import rendition.*
import util.boundary.*

def renderTrait(ns: AugmentedNamespace, iface: AugmentedInterface)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[FluentErr]
) =
  WithEffects.collect:
    coll =>
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
            .foreach(renderMethodStub(meth, _))

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

            // val toRender = coll.observe(getRenderableMethods(iface))

            // toRender.foreach: (meth, opts) =>
            //   transact[FluentErr]:
            //     inContext(s"method ${meth.name}"):
            //       filterDefinitions(
            //         namespace = Some(ns),
            //         iface = Some(iface),
            //         method = Some(meth)
            //       )
            //       coll.observe(
            //         renderClassMethod(
            //           meth,
            //           opts
            //         )
            //       )
            //   .foreach(renderMethodStub(meth, _))

end renderTrait
