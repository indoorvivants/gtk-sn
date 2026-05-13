package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkSeatCapabilities

/** Flags describing the seat capabilities.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Flags describing the seat capabilities.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GdkSeatCapabilities, name: String)
      extends SeatCapabilities(raw):
    override def toString(): String = this.name

    /** No input capabilities
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GdkSeatCapabilities.GDK_SEAT_CAPABILITY_NONE, "NONE")

    /** The seat has a pointer (e.g. mouse)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case POINTER
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_POINTER,
          "POINTER"
        )

    /** The seat has touchscreen(s) attached
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TOUCH
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_TOUCH,
          "TOUCH"
        )

    /** The seat has drawing tablet(s) attached
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TABLET_STYLUS
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_TABLET_STYLUS,
          "TABLET_STYLUS"
        )

    /** The seat has keyboard(s) attached
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case KEYBOARD
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_KEYBOARD,
          "KEYBOARD"
        )

    /** The seat has drawing tablet pad(s) attached
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TABLET_PAD
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_TABLET_PAD,
          "TABLET_PAD"
        )

    /** The union of all pointing capabilities
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALL_POINTING
        extends KnownValue(
          GdkSeatCapabilities.GDK_SEAT_CAPABILITY_ALL_POINTING,
          "ALL_POINTING"
        )

    /** The union of all capabilities
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALL
        extends KnownValue(GdkSeatCapabilities.GDK_SEAT_CAPABILITY_ALL, "ALL")
  end KnownValue
end SeatCapabilities
