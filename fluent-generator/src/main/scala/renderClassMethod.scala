import rendition.*

import com.indoorvivants.gnome.gir_schema.*
import util.boundary.*

import FluentErrReason.*
import scala.annotation.tailrec

val needsOverrideCache =
  collection.mutable.Map[(ClassLike, Method), Boolean]()

val methodSigCache =
  collection.mutable.Map[Method, MethodSignature]()

private def getParents(c: ClassLike): Seq[String] =
  c match
    case cls: AugmentedClass => cls.parent.toSeq ++ cls.implements.map(_.name)
    case _                   => c.implements.map(_.name)

opaque type MethodSignature <: String = String

def sig(meth: Method) =
  methodSigCache.getOrElseUpdate(
    meth, {
      val params =
        meth.parameters.collect:
          case p: Parameter => p // .name.getOrElse("<noname>")
      val result = s"${meth.name}(${params.length})"

      result
    }
  )
end sig

enum MethodRef:
  case Impl(in: GlobalName, typeValue: String)
  case Decl(in: GlobalName, typeValue: String)

  def globalName = this match
    case Impl(in, _) => in
    case Decl(in, _) => in

  def tv = this match
    case Impl(_, tv) => tv
    case Decl(_, tv) => tv
end MethodRef

def collectAllMethods(
    cls: ClassLike
)(using
    GlobalKnowledge,
    Label[FluentErr]
): (
    thisClass: Map[MethodSignature, Method],
    inherited: Map[MethodSignature, List[(MethodRef, Method)]]
) =
  val classMethods = cls.methods.map(meth => sig(meth) -> meth).toMap
  val inheritedMethods =
    val b =
      List.newBuilder[(MethodSignature, (MethodRef, Method))]

    @tailrec
    def go(names: Seq[GlobalName], visited: Set[GlobalName]): Unit =
      val filtered = names.filterNot(visited)
      if filtered.nonEmpty then
        val next = filtered.flatMap: gn =>
          globalKnowledge
            .classMethods(gn)
            .foreach: (name, method) =>
              gn.tpe match
                case NameType.Class(tv) =>
                  b += sig(method) -> (MethodRef.Impl(gn, tv), method)
                case NameType.Interface(tv) =>
                  b += sig(method) -> (MethodRef.Decl(gn, tv), method)
                case _ =>
                  raiseWith(
                    _.Other(
                      s"Unexpected type of parent of class ${cls.name}: ${gn}"
                    )
                  )
          globalKnowledge.parents.getOrElse(gn, Nil)
        go(next, visited ++ filtered)
      end if
    end go

    go(globalKnowledge.parents(globalKnowledge.names(cls.name)), Set.empty)

    b.result()
      .groupBy(_._1)
      .mapValues(_.map(_._2))
      .toMap
    // .flatMap: (sig, candidates) =>
    //   val implemented =
    //     candidates.map(_._2).collectFirst { case (a: MethodRef.Impl, meth) =>
    //       (sig, (a, meth))
    //     }

    //   implemented match
    //     case Some(value) => Some(value)
    //     case None        =>
    //       candidates.headOption

  end inheritedMethods

  (thisClass = classMethods, inherited = inheritedMethods)
end collectAllMethods

// def needsOverride(cls: ClassLike, meth: Method)(using GlobalKnowledge) =
//   needsOverrideCache.getOrElseUpdate(
//     cls -> meth,
//     defaultValue =
//       val gl = summon[GlobalKnowledge]
//       val names = gl.names
//       val methods = gl.classMethods

//       def hasMethod(gn: Seq[GlobalName], visited: Set[GlobalName]): Boolean =
//         if meth.name == "get_display" then
//           scribe.info(
//             s"get_display checking names ${cls.name} ${gn.map(_.fluent).mkString(", ")}"
//           )

//         if gn.isEmpty then false
//         else
//           val contains = gn
//             .filterNot(visited)
//             .map(methods(_))
//             .exists:
//               _.exists:
//                 case (name, method) =>
//                   name == meth.name && sig(method) == sig(meth)

//           contains || gn.exists(name =>
//             hasMethod(gl.parents.getOrElse(name, Seq.empty), visited ++ gn)
//           )
//         end if
//       end hasMethod

//       val thisMethodSig = sig(meth)

//       hasMethod(gl.parents.getOrElse(names(cls.name), Seq.empty), Set.empty)
//   )
// end needsOverride

case class MethodRenderingOptions(isOverride: Boolean, body: Boolean)

def renderClassMethod(meth: Method, options: MethodRenderingOptions)(using
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

    val over = if options.isOverride then "override " else ""

    val inlining = if isVararg then "inline " else ""

    val methodName = escape(camelName)

    renderComment(meth.doc)
    val declaration =
      s"${over}${inlining}def $methodName(${serialisedParams})$givenParams: ${returnTypeRepr}"

    if !options.body then line(declaration)
    else
      block(s"$declaration = ", s"end $methodName"):
        line(finalBody)

    emptyLine()

end renderClassMethod
