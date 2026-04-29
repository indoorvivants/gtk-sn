import com.indoorvivants.gnome.gir_schema.*
import scala.util.boundary, boundary.*
import rendition.*

case class RenderedParameters(
    paramSpecs: Seq[String],
    arguments: Seq[String]
)

def renderParameters(
    params: Seq[Parameter | Instanceu45parameter],
    methodLabel: String
)(using
    Label[FluentErr],
    GlobalKnowledge,
    NamingPolicy
): WithEffects[RenderedParameters] =
  WithEffects.collect: coll =>
    val (paramSpecs, arguments) = params
      .map:
        case param: Parameter =>
          val (paraName, vararg) =
            (Option
              .when(param.name.contains("...")):
                "args" -> TypeMapping("Any*").withMassageIntoUnsafe(
                  Massage.Splat("args")
                )
              )
              .unzip

          val paramType = vararg.getOrElse(
            renderType(
              param.tpe.getOrElse(
                break(
                  FluentErr.MethodParameterHasNoType(methodLabel, param.name)
                )
              )
            )
          )

          coll.addAll(paramType.effects)

          val paramName = escape(
            paraName.getOrElse(
              param.name.getOrElse(break(FluentErr.MethodParameterHasNoName(methodLabel)))
            )
          )

          val parameter = paramName + " : " + paramType.scalaRepr

          val argument = paramType.intoUnsafeForm(paramName)

          (Some(parameter), argument)

        case param: Instanceu45parameter =>
          (None, "this.raw.asInstanceOf")
      .unzip

    RenderedParameters(paramSpecs.flatten, arguments)
end renderParameters
