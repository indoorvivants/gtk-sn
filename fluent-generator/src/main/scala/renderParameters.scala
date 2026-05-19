import com.indoorvivants.gnome.gir_schema.*
import scala.util.boundary, boundary.*
import rendition.*
import FluentErrReason.*

case class RenderedParameters(
    paramSpecs: Seq[String],
    arguments: Seq[String]
)

enum VarargsPolicy:
  case Ignore, Error, Accept

case class ParamtersRenderingOptions(
    varargsPolicy: VarargsPolicy
)

object ParamtersRenderingOptions:
  val default = ParamtersRenderingOptions(VarargsPolicy.Error)

def renderParameters(
    params: Seq[Parameter | Instanceu45parameter],
    methodLabel: String,
    methodContext: TargetTypes.MethodContext,
    opts: ParamtersRenderingOptions = ParamtersRenderingOptions.default,
    typeRenderingOpts: (Parameter | Instanceu45parameter, Type | ArrayType) => TypeRenderingOptions = (_, _) => TypeRenderingOptions.default
)(using
    Label[FluentErr],
    GlobalKnowledge,
    NamingPolicy
): WithEffects[RenderedParameters] =
  WithEffects.collect: coll =>
    def getTargetType(name: String, idx: Int) =
      methodContext
        .getParamType(idx)
        .getOrElse(
          raise(
            ParameterHasNoTargetType(methodContext.name, name, idx)
          )
        )

    val (paramSpecs, arguments) = params.zipWithIndex
      .map:
        case (param: Parameter, idx) =>
          val (paraName, vararg) =
            Option
              .when(param.name.contains("...")):
                if opts.varargsPolicy == VarargsPolicy.Error then
                  raiseWith(
                    _.Other(
                      "Vararg parameters require inlining which doesn't work with overriding"
                    )
                  )
                "args" -> TypeMapping("Any*").withMassageIntoUnsafe(
                  Massage.Splat("args")
                )
              .filter(_ => opts.varargsPolicy != VarargsPolicy.Ignore)
              .unzip
          end val

          val targetType = getTargetType(param.name.getOrElse("<no name>"), idx)

          val paramType = vararg.getOrElse:
            val rendered =
              inContext(param.name.getOrElse("<no name>")):
                val tpe =                   param.tpe.getOrElse(
                  raise(
                    MethodParameterHasNoType(methodLabel, param.name)
                  )
                )

                renderType(
                  tpe,
                  position = TypePosition.ParameterType,
                  Some(targetType),
                  typeRenderingOpts(param, tpe)
                )
            if param.nullable.contains(Number1Value20) then
              TypeMapping.optional(rendered, Some(targetType))
            else rendered

          coll.addAll(paramType.effects)

          val paramName = escape(
            paraName.getOrElse(
              param.name.getOrElse(
                raise(MethodParameterHasNoName(methodLabel))
              )
            )
          )

          val parameter = paramName + " : " + paramType.scalaRepr

          val argument = paramType.intoUnsafeForm(paramName)

          (Some(parameter), argument)

        case (param: Instanceu45parameter, idx) =>
          val targetType = getTargetType(param.name, idx)

          (None, s"this.getUnsafeRawPointer().asInstanceOf[$targetType]")
      .unzip

    RenderedParameters(paramSpecs.flatten, arguments)
end renderParameters
