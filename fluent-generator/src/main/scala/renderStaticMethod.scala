import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*
import FluentErrReason.*

def renderStaticMethod(meth: FunctionType)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val camelName = camelify(meth.name)
    val cMethod = meth.identifier

    val isVararg = meth.parameters
      .collect:
        case p: Parameter if p.name.contains("...") => p
      .nonEmpty

    if meth.isThrowing then coll.add(importGResultEffect)

    val methodContext = globalKnowledge.targetTypes
      .inMethod(meth.identifier)
      .getOrElse(raise(TargetTypesMissing(meth.identifier)))

    val renderedParameters =
      coll.observe:
        inContext("<function parameters>"):
          renderParameters(
            meth.parameters,
            s"method: ${meth.name}",
            methodContext
          )

    val returnType =
      inContext("<return type>"):
        renderType(
          meth.returnType.getOrElse(
            raise(MethodHasNoReturnType(meth.name))
          ),
          position = TypePosition.ReturnType,
          expectedRawType = Some(methodContext.getReturnType)
        )

    coll.addAll(returnType.effects)

    val givenParams =
      val zone = Option
        .when(coll.effectsSoFar().contains(Effect.RequiresZone))("Zone")
      val runtime = Option
        .when(coll.effectsSoFar().contains(Effect.RequiresRuntime))("Runtime")

      val all = zone.toSeq ++ runtime.toSeq

      if all.isEmpty then "" else s"(using ${all.mkString(", ")})"

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

    val inlining = if isVararg then "inline " else ""

    renderComment(meth.doc)
    line(
      s"${inlining}def ${escape(camelName)}(${serialisedParams})$givenParams: ${returnTypeRepr} = $finalBody"
    )
    emptyLine()
