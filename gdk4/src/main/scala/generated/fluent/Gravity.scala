package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkGravity

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Defines the reference point of a surface and is used in `GdkPopupLayout`.
  */
enum Gravity(val raw: GdkGravity):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the top left corner.
    */
  case NORTH_WEST extends Gravity(GdkGravity.GDK_GRAVITY_NORTH_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is in the middle of the top edge.
    */
  case NORTH extends Gravity(GdkGravity.GDK_GRAVITY_NORTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the top right corner.
    */
  case NORTH_EAST extends Gravity(GdkGravity.GDK_GRAVITY_NORTH_EAST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the middle of the left edge.
    */
  case WEST extends Gravity(GdkGravity.GDK_GRAVITY_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the center of the surface.
    */
  case CENTER extends Gravity(GdkGravity.GDK_GRAVITY_CENTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the middle of the right edge.
    */
  case EAST extends Gravity(GdkGravity.GDK_GRAVITY_EAST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the lower left corner.
    */
  case SOUTH_WEST extends Gravity(GdkGravity.GDK_GRAVITY_SOUTH_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the middle of the lower edge.
    */
  case SOUTH extends Gravity(GdkGravity.GDK_GRAVITY_SOUTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the lower right corner.
    */
  case SOUTH_EAST extends Gravity(GdkGravity.GDK_GRAVITY_SOUTH_EAST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the reference point is at the top left corner of the surface itself,
    * ignoring window manager decorations.
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
