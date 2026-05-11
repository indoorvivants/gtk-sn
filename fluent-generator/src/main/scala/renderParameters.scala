import com.indoorvivants.gnome.gir_schema.*
import scala.util.boundary, boundary.*
import rendition.*
import FluentErrReason.*

case class RenderedParameters(
    paramSpecs: Seq[String],
    arguments: Seq[String]
)

def renderParameters(
    params: Seq[Parameter | Instanceu45parameter],
    methodLabel: String,
    methodContext: TargetTypes.MethodContext
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
            (Option
              .when(param.name.contains("...")):
                raiseWith(
                  _.Other(
                    "Vararg parameters require inlining which doesn't work with overriding"
                  )
                )
                "args" -> TypeMapping("Any*").withMassageIntoUnsafe(
                  Massage.Splat("args")
                )
              )
              .unzip

          val targetType = getTargetType(param.name.getOrElse("<no name>"), idx)

          val paramType = vararg.getOrElse:
            val rendered =
              inContext(param.name.getOrElse("<no name>")):
                renderType(
                  param.tpe.getOrElse(
                    raise(
                      MethodParameterHasNoType(methodLabel, param.name)
                    )
                  ),
                  position = TypePosition.ParameterType,
                  Some(targetType)
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
