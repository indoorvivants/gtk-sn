import com.indoorvivants.gnome.gir_schema.*
import rendition.*

import scala.util.boundary, boundary.*

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
      line(
        s"${overrides}def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf"
      )
      emptyLine()
      cls.methods.foreach: meth =>
        filterDefinitions(
          namespace = Some(ns),
          cls = Some(cls),
          method = Some(meth)
        ) match
          case None =>
            val result =
              transact[FluentErr]:
                handleExceptions(coll.observe(renderClassMethod(cls, meth)))

            result.foreach: msg =>
              msg.log(s"Failed to render method ${meth.name}")
          case Some(value) =>
            renderComment(meth.doc)
            line(s"@annotation.compileTimeOnly(\"$value\")")
            line(s"def ${camelify(meth.name)}(using DummyImplicit) = ???")
            emptyLine()

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
