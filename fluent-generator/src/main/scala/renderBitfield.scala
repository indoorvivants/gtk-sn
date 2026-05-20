import com.indoorvivants.gnome.gir_schema.*
import rendition.*
import util.boundary.*

def renderBitfield(bitfield: Bitfield)(using
    GlobalKnowledge,
    NamingPolicy,
    RenderingContext,
    Label[FluentErr]
) =
  WithEffects.collect: coll =>
    val members =
      bitfield.bitfieldoption.collect:
        case d if d.value.isInstanceOf[Member] =>
          d.value.asInstanceOf[Member]

    val bitfieldName = bitfield.name

    renderComment(bitfield.bitfieldoption.doc)
    block(
      s"class $bitfieldName private (val raw: ${bitfield.typeValue}):",
      s"end $bitfieldName"
    ):
      classTemplate(bitfieldName).foreach(line(_))

    emptyLine()

    block(s"object $bitfieldName:", s"end $bitfieldName"):
      companionTemplate(bitfieldName, bitfield.typeValue).foreach(line(_))
      emptyLine()
      renderComment(bitfield.bitfieldoption.doc)
      block(s"enum KnownValue(override val raw: ${bitfield.typeValue}, name: scala.Predef.String) extends $bitfieldName(raw):", "end KnownValue"):
        line("override def toString(): scala.Predef.String = this.name")
        emptyLine()
        members.foreach: member =>
          renderComment(member.infou46elementsOption11.doc)
          val memberName = escape(member.name.toUpperCase())
          line(
            s"case ${memberName} extends KnownValue(${bitfield.typeValue}.${member.identifier}, \"$memberName\")"
          )


private def classTemplate(name: String) =
  s"""
   |def is(kv: $name): Boolean = 
   |  raw.is(kv.raw)
   |
   |override def toString(): scala.Predef.String = 
   |  var rem = raw.value
   |  val sb = scala.List.newBuilder[$name.KnownValue]
   |  $name.KnownValue.values.foreach: kv =>
   |    if this.is(kv) then sb += kv
   |
   |    rem = rem & (~kv.raw.value)
   |
   |  s"$name($${sb.result().mkString(", ")})"
  """.trim.stripMargin.linesIterator

private def companionTemplate(name: String, rawName: String) =
  s"""
   |export KnownValue.*
   |
   |def fromRaw(raw: $rawName) = new $name(raw)
   |
   |extension (af: $name) 
   |  def &(other: $name) = 
   |    $name(af.raw & other.raw)
   |  def |(other: $name) = 
   |    $name(af.raw | other.raw)
  """.trim.stripMargin.linesIterator
