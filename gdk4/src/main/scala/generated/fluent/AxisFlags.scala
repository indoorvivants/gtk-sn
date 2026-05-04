package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkAxisFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags describing the current capabilities of a device/tool.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags describing the current capabilities of a device/tool.
    */
  enum KnownValue(override val raw: GdkAxisFlags, name: String)
      extends AxisFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * X axis is present
      */
    case X extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_X, "X")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Y axis is present
      */
    case Y extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_Y, "Y")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Scroll X delta axis is present
      */
    case DELTA_X
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_DELTA_X, "DELTA_X")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Scroll Y delta axis is present
      */
    case DELTA_Y
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_DELTA_Y, "DELTA_Y")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Pressure axis is present
      */
    case PRESSURE
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_PRESSURE, "PRESSURE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * X tilt axis is present
      */
    case XTILT extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_XTILT, "XTILT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Y tilt axis is present
      */
    case YTILT extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_YTILT, "YTILT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Wheel axis is present
      */
    case WHEEL extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_WHEEL, "WHEEL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Distance axis is present
      */
    case DISTANCE
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_DISTANCE, "DISTANCE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Z-axis rotation is present
      */
    case ROTATION
        extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_ROTATION, "ROTATION")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Slider axis is present
      */
    case SLIDER extends KnownValue(GdkAxisFlags.GDK_AXIS_FLAG_SLIDER, "SLIDER")
  end KnownValue
end AxisFlags
