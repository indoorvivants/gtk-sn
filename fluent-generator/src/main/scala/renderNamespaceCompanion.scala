import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderNamespaceCompanion(
    ns: AugmentedNamespace
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy
) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${ns.name}"
    val objectHasAnyMembers = ns.functions.nonEmpty

    def renderFunctions()(using RenderingContext) =
      ns.functions.foreach: function =>
        transact[FluentErr]:
          filterDefinitions(
            namespace = Some(ns),
            function = Some(function)
          )
          handleExceptions(
            coll.observe(renderStaticMethod(function))
          )
        .foreach(renderFunctionStub(function, _))

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()
    end renderFunctions

    if objectHasAnyMembers then
      ns.name match
        case Some(value) =>
          block(s"object $value:", s"end $value"):
            renderFunctions()
        case None =>
          renderFunctions()

    end if
