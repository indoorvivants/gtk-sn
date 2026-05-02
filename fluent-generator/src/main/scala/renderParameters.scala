import com.indoorvivants.gnome.gir_schema.*
import scala.util.boundary, boundary.*
import rendition.*

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
          break(
            FluentErr.ParameterHasNoTargetType(methodContext.name, name, idx)
          )
        )

    val (paramSpecs, arguments) = params.zipWithIndex
      .map:
        case (param: Parameter, idx) =>
          val (paraName, vararg) =
            (Option
              .when(param.name.contains("...")):
                "args" -> TypeMapping("Any*").withMassageIntoUnsafe(
                  Massage.Splat("args")
                )
              )
              .unzip

          val targetType = getTargetType(param.name.getOrElse("<no name>"), idx)

          val paramType = vararg.getOrElse:
            val rendered =
              renderType(
                param.tpe.getOrElse(
                  break(
                    FluentErr.MethodParameterHasNoType(methodLabel, param.name)
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
                break(FluentErr.MethodParameterHasNoName(methodLabel))
              )
            )
          )

          val parameter = paramName + " : " + paramType.scalaRepr

          val argument = paramType.intoUnsafeForm(paramName)

          (Some(parameter), argument)

        case (param: Instanceu45parameter, _) =>
          (None, "this.raw.asInstanceOf")
      .unzip

    RenderedParameters(paramSpecs.flatten, arguments)
end renderParameters
