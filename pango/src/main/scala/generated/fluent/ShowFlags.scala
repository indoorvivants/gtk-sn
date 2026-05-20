package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoShowFlags

/** These flags affect how Pango treats characters that are normally not visible
  * in the output.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShowFlags private (val raw: PangoShowFlags):
  def is(kv: ShowFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[ShowFlags.KnownValue]
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

  /** These flags affect how Pango treats characters that are normally not
    * visible in the output.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: PangoShowFlags, name: scala.Predef.String)
      extends ShowFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No special treatment for invisible characters
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(PangoShowFlags.PANGO_SHOW_NONE, "NONE")

    /** Render spaces, tabs and newlines visibly
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SPACES extends KnownValue(PangoShowFlags.PANGO_SHOW_SPACES, "SPACES")

    /** Render line breaks visibly
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LINE_BREAKS
        extends KnownValue(PangoShowFlags.PANGO_SHOW_LINE_BREAKS, "LINE_BREAKS")

    /** Render default-ignorable Unicode characters visibly
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IGNORABLES
        extends KnownValue(PangoShowFlags.PANGO_SHOW_IGNORABLES, "IGNORABLES")
  end KnownValue
end ShowFlags
