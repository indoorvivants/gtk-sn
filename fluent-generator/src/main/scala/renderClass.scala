import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*

def renderMethodStub(f: Method, msg: FluentErr)(using RenderingContext) =
  scribe.warn(s"Failed to render function ${f.name}: ${msg.message}")
  renderComment(f.doc)
  line(s"@annotation.compileTimeOnly(\"${msg.message}\")")
  line(s"def ${camelify(f.name)}__ = ???")
  emptyLine()

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
    val cTypeName = cls.attributes.get("@type").map(_.as[String])
    val cType =
      cTypeName
        .orElse(
          Option.when(ns.name.contains("Gtk") && cls.name == "Snapshot")(
            "GtkSnapshot"
          )
        )
        .getOrElse(break(FluentErr.ClassHasNoCType(cls.name)))

    coll.add(
      Effect.RequiresImport(
        NamingPolicy().namespaceToInternalPackage(ns.name.get),
        cType
      )
    )

    val data = s"(raw: Ptr[$cType])"

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
          filterDefinitions(
            namespace = Some(ns),
            cls = Some(cls),
            method = Some(meth)
          )
          handleExceptions(coll.observe(renderClassMethod(cls, meth)))
        .foreach(renderMethodStub(meth, _))

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
