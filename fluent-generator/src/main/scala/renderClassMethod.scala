import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

def renderClassMethod(cls: AugmentedClass, meth: Method)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[String]
) =
  WithEffects.collect: coll =>
    val camelName = camelify(meth.name)
    val cMethod = meth.identifier

    val methods = summon[GlobalKnowledge].classMethods
    val allParents = (cls.parent.toSeq ++ cls.implements.map(_.name))

    def sig(meth: Method) =
      val params =
        meth.parameters.collect:
          case p: Parameter => p.name.getOrElse("<noname>")
      s"${meth.name}(${params.mkString(", ")})${meth.returnType}"

    val thisMethodSig = sig(meth)

    val isOverride = allParents
      .exists(clsName =>
        methods.get(clsName).exists(_.exists((_, m) => sig(m) == thisMethodSig))
      )

    val isVararg = meth.parameters
      .collect:
        case p: Parameter if p.name.contains("...") => p
      .nonEmpty

    if meth.isThrowing then coll.add(importGResultEffect)

    val renderedParameters =
      coll.observe(renderParameters(meth.parameters, s"method: ${meth.name}"))

    val returnType = renderType(
      meth.returnType.getOrElse(
        break(s"return type missing")
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

    line(
      s"${over}${inlining}def ${escape(camelName)}(${serialisedParams})$requiresZone: ${returnTypeRepr} = $finalBody"
    )
    emptyLine()

end renderClassMethod
