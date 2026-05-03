package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkAxisUse

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Defines how device axes are interpreted by GTK.
  *
  * Note that the X and Y axes are not really needed; pointer devices report
  * their location via the x/y members of events regardless. Whether X and Y are
  * present as axes depends on the GDK backend.
  */
enum AxisUse(val raw: GdkAxisUse):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is ignored.
    */
  case IGNORE extends AxisUse(GdkAxisUse.GDK_AXIS_IGNORE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used as the x axis.
    */
  case X extends AxisUse(GdkAxisUse.GDK_AXIS_X)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used as the y axis.
    */
  case Y extends AxisUse(GdkAxisUse.GDK_AXIS_Y)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used as the scroll x delta
    */
  case DELTA_X extends AxisUse(GdkAxisUse.GDK_AXIS_DELTA_X)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used as the scroll y delta
    */
  case DELTA_Y extends AxisUse(GdkAxisUse.GDK_AXIS_DELTA_Y)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for pressure information.
    */
  case PRESSURE extends AxisUse(GdkAxisUse.GDK_AXIS_PRESSURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for x tilt information.
    */
  case XTILT extends AxisUse(GdkAxisUse.GDK_AXIS_XTILT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for y tilt information.
    */
  case YTILT extends AxisUse(GdkAxisUse.GDK_AXIS_YTILT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for wheel information.
    */
  case WHEEL extends AxisUse(GdkAxisUse.GDK_AXIS_WHEEL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for pen/tablet distance information
    */
  case DISTANCE extends AxisUse(GdkAxisUse.GDK_AXIS_DISTANCE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for pen rotation information
    */
  case ROTATION extends AxisUse(GdkAxisUse.GDK_AXIS_ROTATION)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the axis is used for pen slider information
    */
  case SLIDER extends AxisUse(GdkAxisUse.GDK_AXIS_SLIDER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a constant equal to the numerically highest axis value.
    */
  case LAST extends AxisUse(GdkAxisUse.GDK_AXIS_LAST)
end AxisUse

object AxisUse:
  def fromRaw(raw: GdkAxisUse): AxisUse =
    raw match
      case GdkAxisUse.GDK_AXIS_IGNORE   => AxisUse.IGNORE
      case GdkAxisUse.GDK_AXIS_X        => AxisUse.X
      case GdkAxisUse.GDK_AXIS_Y        => AxisUse.Y
      case GdkAxisUse.GDK_AXIS_DELTA_X  => AxisUse.DELTA_X
      case GdkAxisUse.GDK_AXIS_DELTA_Y  => AxisUse.DELTA_Y
      case GdkAxisUse.GDK_AXIS_PRESSURE => AxisUse.PRESSURE
      case GdkAxisUse.GDK_AXIS_XTILT    => AxisUse.XTILT
      case GdkAxisUse.GDK_AXIS_YTILT    => AxisUse.YTILT
      case GdkAxisUse.GDK_AXIS_WHEEL    => AxisUse.WHEEL
      case GdkAxisUse.GDK_AXIS_DISTANCE => AxisUse.DISTANCE
      case GdkAxisUse.GDK_AXIS_ROTATION => AxisUse.ROTATION
      case GdkAxisUse.GDK_AXIS_SLIDER   => AxisUse.SLIDER
      case GdkAxisUse.GDK_AXIS_LAST     => AxisUse.LAST
  end fromRaw
end AxisUse
