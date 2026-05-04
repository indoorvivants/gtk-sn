package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkSeatCapabilities

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags describing the seat capabilities.
  */
class SeatCapabilities private (val raw: GdkSeatCapabilities):
  def is(kv: SeatCapabilities): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[SeatCapabilities.KnownValue]
    SeatCapabilities.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"SeatCapabilities(${sb.result().mkString(", ")})"
end SeatCapabilities

object SeatCapabilities:
  export KnownValue.*

  def fromRaw(raw: GdkSeatCapabilities) = new SeatCapabilities(raw)

  extension (af: SeatCapabilities)
    def &(other: SeatCapabilities) =
      SeatCapabilities(af.raw & other.raw)
    def |(other: SeatCapabilities) =
      SeatCapabilities(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags describing the seat capabilities.
    */
  enum KnownValue(override val raw: GdkSeatCapabilities, name: String)
      extends SeatCapabilities(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No input capabilities
      */
    case NONE
        extends KnownValue(GdkSeatCapabilities.GDK_SEAT_CAPABILITY_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The seat has a pointer (e.g. mouse)
      */
    case POINTER
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_POINTER,
          "POINTER"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The seat has touchscreen(s) attached
      */
    case TOUCH
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_TOUCH,
          "TOUCH"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The seat has drawing tablet(s) attached
      */
    case TABLET_STYLUS
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_TABLET_STYLUS,
          "TABLET_STYLUS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The seat has keyboard(s) attached
      */
    case KEYBOARD
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_KEYBOARD,
          "KEYBOARD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The seat has drawing tablet pad(s) attached
      */
    case TABLET_PAD
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_TABLET_PAD,
          "TABLET_PAD"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The union of all pointing capabilities
      */
    case ALL_POINTING
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_ALL_POINTING,
          "ALL_POINTING"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The union of all capabilities
      */
    case ALL
        extends KnownValue(GdkSeatCapabilities.GDK_SEAT_CAPABILITY_ALL, "ALL")
  end KnownValue
end SeatCapabilities
