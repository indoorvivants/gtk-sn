import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*
import FluentErrReason.*

enum StaticMethodLocation:
  case Namespace(ns: AugmentedNamespace)
  case Klass(cls: AugmentedClass)

  def namespaceName = this match
    case Namespace(ns) => ns.name
    case Klass(cls)    => cls.namespace.name

def renderStaticMethod(loc: StaticMethodLocation, meth: FunctionType)(using
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

    // glib does not depend on GObject, so all its methods should just use top level Zone in each static method
    val renderOpts =
      val nonGobject = Set("GLib", "Cairo", "HarfBuzz")
      if loc.namespaceName.exists(nonGobject.contains) then
        TypeRenderingOptions.default.copy(useRuntimeZone = false)
      else TypeRenderingOptions.default

    val renderedParameters =
      coll.observe:
        inContext("<function parameters>"):
          renderParameters(
            meth.parameters,
            s"method: ${meth.name}",
            methodContext,
            // we allow varargs in static methods because there is no issue with overriding
            opts = ParamtersRenderingOptions(VarargsPolicy.Accept),
            (_, _) => renderOpts
          )

    val returnType =
      inContext("<return type>"):
        renderType(
          meth.returnType.getOrElse(
            raise(MethodHasNoReturnType(meth.name))
          ),
          position = TypePosition.ReturnType,
          expectedRawType = Some(methodContext.getReturnType),
          renderOpts
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
