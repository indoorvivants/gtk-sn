package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkAxisFlags

/** Flags describing the current capabilities of a device/tool.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AxisFlags private (val raw: GdkAxisFlags):
  def is(kv: AxisFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[AxisFlags.KnownValue]
    AxisFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"AxisFlags(${sb.result().mkString(", ")})"
end AxisFlags

object AxisFlags:
  export KnownValue.*

  def fromRaw(raw: GdkAxisFlags) = new AxisFlags(raw)

  extension (af: AxisFlags)
    def &(other: AxisFlags) =
      AxisFlags(af.raw & other.raw)
    def |(other: AxisFlags) =
      AxisFlags(af.raw | other.raw)

  /** Flags describing the current capabilities of a device/tool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GdkAxisFlags, name: String)
      extends AxisFlags(raw):
    override def toString(): String = this.name

    /** X axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case X extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_X, "X")

    /** Y axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case Y extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_Y, "Y")

    /** Scroll X delta axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DELTA_X
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_DELTA_X, "DELTA_X")

    /** Scroll Y delta axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DELTA_Y
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_DELTA_Y, "DELTA_Y")

    /** Pressure axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRESSURE
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_PRESSURE, "PRESSURE")

    /** X tilt axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case XTILT extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_XTILT, "XTILT")

    /** Y tilt axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case YTILT extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_YTILT, "YTILT")

    /** Wheel axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WHEEL extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_WHEEL, "WHEEL")

    /** Distance axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DISTANCE
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_DISTANCE, "DISTANCE")

    /** Z-axis rotation is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ROTATION
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_ROTATION, "ROTATION")

    /** Slider axis is present
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SLIDER extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_SLIDER, "SLIDER")
  end KnownValue
end AxisFlags
