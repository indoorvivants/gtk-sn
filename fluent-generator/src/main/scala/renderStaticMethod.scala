import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

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
      .getOrElse(break(FluentErr.TargetTypesMissing(meth.identifier)))

    val renderedParameters =
      coll.observe(
        renderParameters(
          meth.parameters,
          s"method: ${meth.name}",
          methodContext
        )
      )

    val returnType = renderType(
      meth.returnType.getOrElse(
        break(FluentErr.MethodHasNoReturnType(meth.name))
      ),
      position = TypePosition.ReturnType,
      expectedRawType = Some(methodContext.getReturnType)
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

    val inlining = if isVararg then "inline " else ""

    renderComment(meth.doc)
    line(
      s"${inlining}def ${escape(camelName)}(${serialisedParams})$requiresZone: ${returnTypeRepr} = $finalBody"
    )
    emptyLine()
