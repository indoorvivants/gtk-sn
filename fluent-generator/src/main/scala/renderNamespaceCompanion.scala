import rendition.*
import util.boundary.*
import com.indoorvivants.gnome.gir_schema.*

def renderNamespaceCompanion(
    ns: AugmentedNamespace
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy
)(using reporter: NamespaceReporter) =
  WithEffects.collect: coll =>
    val objectHeader = s"object ${ns.name}"
    val objectHasAnyMembers = ns.functions.nonEmpty || ns.constants.nonEmpty

    def renderFunctions()(using RenderingContext) =
      ns.functions
        .foreach: function =>
          transact[FluentErr]:
            inContext(s"${function.name}:"):
              filterDefinitions(
                namespace = Some(ns),
                function = Some(function)
              )
              coll.observe(renderStaticMethod(function))
              reporter.recordFunction(function.name, ReportResult.Success)
          .foreach: err =>
            renderFunctionStub(function, err)
            reporter.recordFunction(function.name, ReportResult(err))

      ns.constants
        .foreach: constant =>
          transact[FluentErr]:
            inContext(s"${constant.name}:"):
              filterDefinitions(
                namespace = Some(ns),
                constant = Some(constant)
              )
              coll.observe(renderConstant(constant))
              reporter.recordConstant(constant.name, ReportResult.Success)
          .foreach: err =>
            renderConstantStub(constant, err)
            reporter.recordConstant(constant.name, ReportResult(err))

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
