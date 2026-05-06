import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*
import FluentErrReason.*

def renderClass(
    ns: AugmentedNamespace,
    cls: AugmentedClass
)(using
    RenderingContext,
    GlobalKnowledge,
    NamingPolicy,
    Label[FluentErr]
): WithEffects[Unit] =
  WithEffects.collect: coll =>
    val cType = cls.cType
    coll.add(
      Effect.RequiresImport(
        NamingPolicy().namespaceToInternalPackage(ns.name.get),
        cType
      )
    )

    val data = s"(raw: Ptr[${cType}])"

    val extensions =
      coll.observe(renderClassExtensions(cls.name, cls.parent, cls.implements))

    val classHeader =
      s"class ${cls.name}$data${extensions}"

    val classHasAnyMembers =
      cls.methods.nonEmpty

    renderComment(cls.doc)
    block(
      classHeader + ":",
      s"end ${cls.name}"
    ):
      val overrides = if cls.parent.nonEmpty then "override " else ""
      emptyLine()
      line(
        s"${overrides}def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf"
      )
      emptyLine()
      cls.methods.foreach: meth =>
        transact[FluentErr]:
          inContext(s"method ${meth.name}"):
            filterDefinitions(
              namespace = Some(ns),
              cls = Some(cls),
              method = Some(meth)
            )
            coll.observe(renderClassMethod(cls, meth))
        .foreach(renderMethodStub(meth, _))

      cls.signals.foreach: signal =>
        transact[FluentErr]:
          inContext(s"signal ${signal.name}"):
            // filterDefinitions(
            //   namespace = Some(ns),
            //   cls = Some(cls),
            //   method = Some(meth)
            // )
            coll.observe(renderSignal(cls, signal))
        .foreach(renderSignalStub(signal, _))

      coll
        .effectsSoFar()
        .distinct
        .collect:
          case Effect.RequiresDefinition(df) =>
            emptyLine()
            df()

    handleExceptions:
      coll.observe(renderClassCompanionObject(ns, cls))
end renderClass
