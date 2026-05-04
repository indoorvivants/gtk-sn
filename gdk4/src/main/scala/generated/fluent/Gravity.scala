package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkGravity

/** Defines the reference point of a surface and is used in `GdkPopupLayout`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Gravity(val raw: GdkGravity):
  /** the reference point is at the top left corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORTH_WEST extends Gravity(GdkGravity.GDK_GRAVITY_NORTH_WEST)

  /** the reference point is in the middle of the top edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORTH extends Gravity(GdkGravity.GDK_GRAVITY_NORTH)

  /** the reference point is at the top right corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORTH_EAST extends Gravity(GdkGravity.GDK_GRAVITY_NORTH_EAST)

  /** the reference point is at the middle of the left edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEST extends Gravity(GdkGravity.GDK_GRAVITY_WEST)

  /** the reference point is at the center of the surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER extends Gravity(GdkGravity.GDK_GRAVITY_CENTER)

  /** the reference point is at the middle of the right edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EAST extends Gravity(GdkGravity.GDK_GRAVITY_EAST)

  /** the reference point is at the lower left corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOUTH_WEST extends Gravity(GdkGravity.GDK_GRAVITY_SOUTH_WEST)

  /** the reference point is at the middle of the lower edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOUTH extends Gravity(GdkGravity.GDK_GRAVITY_SOUTH)

  /** the reference point is at the lower right corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOUTH_EAST extends Gravity(GdkGravity.GDK_GRAVITY_SOUTH_EAST)

  /** the reference point is at the top left corner of the surface itself,
    * ignoring window manager decorations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STATIC extends Gravity(GdkGravity.GDK_GRAVITY_STATIC)
end Gravity

object Gravity:
  def fromRaw(raw: GdkGravity): Gravity =
    raw match
      case GdkGravity.GDK_GRAVITY_NORTH_WEST => Gravity.NORTH_WEST
      case GdkGravity.GDK_GRAVITY_NORTH      => Gravity.NORTH
      case GdkGravity.GDK_GRAVITY_NORTH_EAST => Gravity.NORTH_EAST
      case GdkGravity.GDK_GRAVITY_WEST       => Gravity.WEST
      case GdkGravity.GDK_GRAVITY_CENTER     => Gravity.CENTER
      case GdkGravity.GDK_GRAVITY_EAST       => Gravity.EAST
      case GdkGravity.GDK_GRAVITY_SOUTH_WEST => Gravity.SOUTH_WEST
      case GdkGravity.GDK_GRAVITY_SOUTH      => Gravity.SOUTH
      case GdkGravity.GDK_GRAVITY_SOUTH_EAST => Gravity.SOUTH_EAST
      case GdkGravity.GDK_GRAVITY_STATIC     => Gravity.STATIC
  end fromRaw
end Gravity
