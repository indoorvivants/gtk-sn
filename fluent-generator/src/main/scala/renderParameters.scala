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
    Label[String],
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
                  s"$methodLabel, param: ${param.name}: type is empty"
                )
              )
            )
          )

          coll.addAll(paramType.effects)

          val paramName = escape(paraName.getOrElse(param.name.get))

          val parameter = paramName + " : " + paramType.scalaRepr

          val argument = paramType.intoUnsafeForm(paramName)

          (Some(parameter), argument)

        case param: Instanceu45parameter =>
          (None, "this.raw.asInstanceOf")
      .unzip

    RenderedParameters(paramSpecs.flatten, arguments)
end renderParameters
