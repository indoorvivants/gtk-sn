import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*
import FluentErrReason.*

def safeConstructorName(n: String) =
  n match
    case "new"        => "apply"
    case s"new_$rest" =>
      camelify(rest)
    case other =>
      camelify(other)

def renderClassConstructor(cls: AugmentedClass, constructor: Constructor)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val cConstructor = constructor.identifier
    val sanitisedName = safeConstructorName(constructor.name)

    val methodContext = globalKnowledge.targetTypes
      .inMethod(constructor.identifier)
      .getOrElse(raise(TargetTypesMissing(constructor.identifier)))

    val renderedParameters =
      coll.observe(
        renderParameters(
          constructor.parameters,
          s"constructor: ${constructor.name}",
          methodContext
        )
      )

    val isVararg = constructor.parameters
      .collect:
        case p: Parameter if p.name.contains("...") => p
      .nonEmpty

    val isThrowing = constructor.isThrowing

    if isThrowing then coll.add(importGResultEffect)

    val requiresZone = Option
      .when(coll.effectsSoFar().contains(Effect.RequiresZone))("(using Zone)")
      .getOrElse("")

    val serialisedParams = renderedParameters.paramSpecs
      .mkString(", ")

    val arguments =
      if isThrowing then renderedParameters.arguments ++ Seq("__errorPtr")
      else renderedParameters.arguments

    val serialisedArguments = arguments.mkString(", ")

    val instantiation = s"${cConstructor}($serialisedArguments)"

    val massagedInstantiation = s"${instantiation}.asInstanceOf"

    val returnType =
      if isThrowing then s"GResult[${cls.name}]" else cls.name

    val inlining = if isVararg then "inline " else ""

    coll.add(Effect.needsGobjectRuntime)

    val constructorName = escape(sanitisedName)

    renderComment(constructor.doc)
    block(
      s"${inlining}def ${constructorName}($serialisedParams)$requiresZone(using Runtime): ${returnType} = ",
      s"end $constructorName"
    ):
      if isThrowing then
        block("GResult.wrap: __errorPtr =>", ""):
          line(s"val raw: Ptr[Byte] = ${instantiation}.asInstanceOf[Ptr[Byte]]")
          line("if raw == null then null")
          line(
            s"else summon[Runtime].getOrCreate[${cls.name}](raw, r => new ${cls.name}(r.asInstanceOf))"
          )
      else
        line(s"val raw: Ptr[Byte] = ${instantiation}.asInstanceOf")
        line(
          s"summon[Runtime].getOrCreate[${cls.name}](raw, r => new ${cls.name}(r.asInstanceOf))"
        )

end renderClassConstructor
