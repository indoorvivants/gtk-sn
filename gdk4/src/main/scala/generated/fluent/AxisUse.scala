package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkAxisUse

/** Defines how device axes are interpreted by GTK.
  *
  * Note that the X and Y axes are not really needed; pointer devices report
  * their location via the x/y members of events regardless. Whether X and Y are
  * present as axes depends on the GDK backend.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum AxisUse(val raw: GdkAxisUse):
  /** the axis is ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IGNORE extends AxisUse(GdkAxisUse.GDK_AXIS_IGNORE)

  /** the axis is used as the x axis.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case X extends AxisUse(GdkAxisUse.GDK_AXIS_X)

  /** the axis is used as the y axis.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case Y extends AxisUse(GdkAxisUse.GDK_AXIS_Y)

  /** the axis is used as the scroll x delta
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DELTA_X extends AxisUse(GdkAxisUse.GDK_AXIS_DELTA_X)

  /** the axis is used as the scroll y delta
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DELTA_Y extends AxisUse(GdkAxisUse.GDK_AXIS_DELTA_Y)

  /** the axis is used for pressure information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRESSURE extends AxisUse(GdkAxisUse.GDK_AXIS_PRESSURE)

  /** the axis is used for x tilt information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case XTILT extends AxisUse(GdkAxisUse.GDK_AXIS_XTILT)

  /** the axis is used for y tilt information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YTILT extends AxisUse(GdkAxisUse.GDK_AXIS_YTILT)

  /** the axis is used for wheel information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WHEEL extends AxisUse(GdkAxisUse.GDK_AXIS_WHEEL)

  /** the axis is used for pen/tablet distance information
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISTANCE extends AxisUse(GdkAxisUse.GDK_AXIS_DISTANCE)

  /** the axis is used for pen rotation information
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROTATION extends AxisUse(GdkAxisUse.GDK_AXIS_ROTATION)

  /** the axis is used for pen slider information
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SLIDER extends AxisUse(GdkAxisUse.GDK_AXIS_SLIDER)

  /** a constant equal to the numerically highest axis value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
