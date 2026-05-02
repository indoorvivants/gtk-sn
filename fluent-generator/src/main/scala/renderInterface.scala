import rendition.*
import util.boundary.*

def renderTrait(ns: AugmentedNamespace, iface: AugmentedInterface)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val extensions =
      coll.observe(renderClassExtensions(iface.name, None, iface.implements))
    transact[String]:
      block(
        s"trait ${iface.name}${extensions}:",
        s"end ${iface.name}"
      ):
        line("def getUnsafeRawPointer(): Ptr[Byte]")

      emptyLine()

      block(s"object ${iface.name}:", s"end ${iface.name}"):
        block(
          s"class Abstract(raw: Ptr[Byte]) extends ${iface.name}:",
          "end Abstract"
        ):
          line("override def getUnsafeRawPointer(): Ptr[Byte] = raw")
end renderTrait
