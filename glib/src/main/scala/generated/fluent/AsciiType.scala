package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GAsciiType

class AsciiType private (val raw: GAsciiType):
  def is(kv: AsciiType): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[AsciiType.KnownValue]
    AsciiType.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"AsciiType(${sb.result().mkString(", ")})"
end AsciiType

object AsciiType:
  export KnownValue.*

  def fromRaw(raw: GAsciiType) = new AsciiType(raw)

  extension (af: AsciiType)
    def &(other: AsciiType) =
      AsciiType(af.raw & other.raw)
    def |(other: AsciiType) =
      AsciiType(af.raw | other.raw)

  enum KnownValue(override val raw: GAsciiType, name: String)
      extends AsciiType(raw):
    override def toString(): String = this.name

    case ALNUM extends KnownValue(GAsciiType.G_ASCII_ALNUM, "ALNUM")
    case ALPHA extends KnownValue(GAsciiType.G_ASCII_ALPHA, "ALPHA")
    case CNTRL extends KnownValue(GAsciiType.G_ASCII_CNTRL, "CNTRL")
    case DIGIT extends KnownValue(GAsciiType.G_ASCII_DIGIT, "DIGIT")
    case GRAPH extends KnownValue(GAsciiType.G_ASCII_GRAPH, "GRAPH")
    case LOWER extends KnownValue(GAsciiType.G_ASCII_LOWER, "LOWER")
    case PRINT extends KnownValue(GAsciiType.G_ASCII_PRINT, "PRINT")
    case PUNCT extends KnownValue(GAsciiType.G_ASCII_PUNCT, "PUNCT")
    case SPACE extends KnownValue(GAsciiType.G_ASCII_SPACE, "SPACE")
    case UPPER extends KnownValue(GAsciiType.G_ASCII_UPPER, "UPPER")
    case XDIGIT extends KnownValue(GAsciiType.G_ASCII_XDIGIT, "XDIGIT")
  end KnownValue
end AsciiType
