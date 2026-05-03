import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import util.boundary.*

def renderEnumeration(enumeration: Enumeration)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val members =
      enumeration.enumerationoption.collect:
        case d if d.value.isInstanceOf[Member] =>
          d.value.asInstanceOf[Member]

    val enumName = enumeration.name

    renderComment(enumeration.enumerationoption.doc)
    block(
      s"enum $enumName(val raw: ${enumeration.typeValue}):",
      s"end $enumName"
    ):
      members.foreach: member =>
        renderComment(member.infou46elementsOption11.doc)
        val memberName = escape(member.name.toUpperCase())
        line(
          s"case ${memberName} extends $enumName(${enumeration.typeValue}.${member.identifier})"
        )

    emptyLine()

    block(s"object $enumName:", s"end $enumName"):
      block(
        s"def fromRaw(raw: ${enumeration.typeValue}): $enumName = ",
        "end fromRaw"
      ):
        line("raw match")
        members.foreach: member =>
          val memberName = escape(member.name.toUpperCase())
          line(
            s"  case ${enumeration.typeValue}.${member.identifier} => $enumName.${memberName}"
          )

end renderEnumeration
