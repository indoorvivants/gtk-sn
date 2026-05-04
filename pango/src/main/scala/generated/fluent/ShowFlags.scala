package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoShowFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * These flags affect how Pango treats characters that are normally not visible
  * in the output.
  */
class ShowFlags private (val raw: PangoShowFlags):
  def is(kv: ShowFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ShowFlags.KnownValue]
    ShowFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ShowFlags(${sb.result().mkString(", ")})"
end ShowFlags

object ShowFlags:
  export KnownValue.*

  def fromRaw(raw: PangoShowFlags) = new ShowFlags(raw)

  extension (af: ShowFlags)
    def &(other: ShowFlags) =
      ShowFlags(af.raw & other.raw)
    def |(other: ShowFlags) =
      ShowFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * These flags affect how Pango treats characters that are normally not
    * visible in the output.
    */
  enum KnownValue(override val raw: PangoShowFlags, name: String)
      extends ShowFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No special treatment for invisible characters
      */
    case NONE extends KnownValue(PangoShowFlags.PANGO_SHOW_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Render spaces, tabs and newlines visibly
      */
    case SPACES extends KnownValue(PangoShowFlags.PANGO_SHOW_SPACES, "SPACES")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Render line breaks visibly
      */
    case LINE_BREAKS
        extends KnownValue(PangoShowFlags.PANGO_SHOW_LINE_BREAKS, "LINE_BREAKS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Render default-ignorable Unicode characters visibly
      */
    case IGNORABLES
        extends KnownValue(PangoShowFlags.PANGO_SHOW_IGNORABLES, "IGNORABLES")
  end KnownValue
end ShowFlags
