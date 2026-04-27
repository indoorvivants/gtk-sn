import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

def renderClassConstructor(cls: AugmentedClass, constructor: Constructor)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[String]
) =
  WithEffects.collect: coll =>
    val cConstructor = constructor.identifier
    val sanitisedName = constructor.name match
      case "new"        => "apply"
      case s"new_$rest" =>
        camelify(rest)
      case other =>
        camelify(other)

    val renderedParameters =
      coll.observe(
        renderParameters(
          constructor.parameters,
          s"constructor: ${constructor.name}"
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
    val body = s"new ${cls.name}($massagedInstantiation)"
    val finalBody =
      if isThrowing then s"GResult.wrap(__errorPtr => $body)"
      else body

    val returnType =
      if isThrowing then s"GResult[${cls.name}]" else cls.name

    val inlining = if isVararg then "inline " else ""

    line(
      s"${inlining}def ${escape(sanitisedName)}($serialisedParams)$requiresZone: ${returnType} = $finalBody"
    )

end renderClassConstructor
