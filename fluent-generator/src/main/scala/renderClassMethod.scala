import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

import FluentErrReason.*

val needsOverrideCache =
  collection.mutable.Map[(AugmentedClass, Method), Boolean]()

def needsOverride(cls: AugmentedClass, meth: Method)(using GlobalKnowledge) =
  needsOverrideCache.getOrElseUpdate(
    cls -> meth,
    defaultValue =
      val methods = summon[GlobalKnowledge].classMethods
      val allParents =
        def go(classes: Seq[AugmentedClass], result: Seq[String]): Seq[String] =
          classes match
            case Nil         => result
            case cls :: rest =>
              go(rest, result ++ cls.parent.toSeq ++ cls.implements.map(_.name))
        go(Seq(cls), Seq.empty)

      def sig(clsName: String, meth: Method) =
        val params =
          meth.parameters.collect:
            case p: Parameter => p.name.getOrElse("<noname>")
        val result = s"${meth.name}(${params.mkString(", ")})"

        result
      end sig

      val thisMethodSig = sig(cls.name, meth)

      allParents
        .exists(clsName =>
          methods
            .get(GlobalKnowledge().names(clsName))
            .exists(_.exists((_, m) => sig(clsName, m) == thisMethodSig))
        )
  )
end needsOverride

def renderClassMethod(cls: AugmentedClass, meth: Method)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val camelName = camelify(meth.name)
    val cMethod = meth.identifier

    val isOverride = needsOverride(cls, meth)

    val isVararg = meth.parameters
      .collect:
        case p: Parameter if p.name.contains("...") => p
      .nonEmpty

    if meth.isThrowing then coll.add(importGResultEffect)

    val methodContext = globalKnowledge.targetTypes
      .inMethod(meth.identifier)
      .getOrElse(raise(TargetTypesMissing(meth.identifier)))

    val renderedParameters =
      coll.observe(
        inContext("<method parameters>"):
          renderParameters(
            meth.parameters,
            s"method: ${meth.name}",
            methodContext
          )
      )

    val returnType =
      inContext("return type"):
        renderType(
          meth.returnType.getOrElse(
            raise(MethodHasNoReturnType(meth.name))
          ),
          position = TypePosition.ReturnType
        )

    coll.addAll(returnType.effects)

    val requiresZone = Option
      .when(coll.effectsSoFar().contains(Effect.RequiresZone))("(using Zone)")
      .getOrElse("")

    val serialisedParams = renderedParameters.paramSpecs
      .mkString(", ")

    val arguments =
      if meth.isThrowing then renderedParameters.arguments :+ "__errorPtr"
      else renderedParameters.arguments

    val serialisedArguments = arguments.mkString(", ")

    val body = s"$cMethod(${serialisedArguments})"

    val massagedBody = returnType.fromUnsafeForm(body)

    val returnTypeRepr =
      if meth.isThrowing then s"GResult[${returnType.scalaRepr}]"
      else returnType.scalaRepr

    val finalBody =
      if meth.isThrowing then s"GResult.wrap(__errorPtr => $massagedBody)"
      else massagedBody

    val over = if isOverride then "override " else ""

    val inlining = if isVararg then "inline " else ""

    renderComment(meth.doc)
    line(
      s"${over}${inlining}def ${escape(camelName)}(${serialisedParams})$requiresZone: ${returnTypeRepr} = $finalBody"
    )
    emptyLine()

end renderClassMethod
