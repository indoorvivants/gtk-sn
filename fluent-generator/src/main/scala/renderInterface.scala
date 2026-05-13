import rendition.*
import util.boundary.*

def renderTrait(ns: AugmentedNamespace, iface: AugmentedInterface)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[FluentErr]
)(using report: InterfaceReporter) =
  WithEffects.collect: coll =>
    val extensions =
      coll.observe(renderClassExtensions(iface.name, None, iface.implements))
    transact[String]:
      block(
        s"trait ${iface.name}${extensions}:",
        s"end ${iface.name}"
      ):
        line("def getUnsafeRawPointer(): Ptr[Byte]")

        iface.methods.foreach: meth =>
          transact[FluentErr]:
            inContext(s"method ${meth.name}"):
              filterDefinitions(
                namespace = Some(ns),
                iface = Some(iface),
                method = Some(meth)
              )
              coll.observe(
                renderClassMethod(
                  meth,
                  MethodRenderingOptions(
                    isOverride = false,
                    body = true
                  )
                )
              )
              report.recordMethod(meth.name, ReportResult.Success)
          .foreach: err =>
            renderMethodStub(meth, err)
            report.recordMethod(
              meth.name,
              ReportResult.Failure(err.getMessage())
            )

      emptyLine()

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

      block(s"object ${iface.name}:", s"end ${iface.name}"):
        block(
          s"class Abstract(raw: Ptr[Byte]) extends ${iface.name}:",
          "end Abstract"
        ):
          line("override def getUnsafeRawPointer(): Ptr[Byte] = raw")

end renderTrait
