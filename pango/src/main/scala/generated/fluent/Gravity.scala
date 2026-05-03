package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoGravity

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoGravity` represents the orientation of glyphs in a segment of text.
  *
  * This is useful when rendering vertical text layouts. In those situations,
  * the layout is rotated using a non-identity [struct@Pango.Matrix], and then
  * glyph orientation is controlled using `PangoGravity`.
  *
  * Not every value in this enumeration makes sense for every usage of
  * `PangoGravity`; for example, %PANGO_GRAVITY_AUTO only can be passed to
  * [method@Pango.Context.set_base_gravity] and can only be returned by
  * [method@Pango.Context.get_base_gravity].
  *
  * See also: [enum@Pango.GravityHint]
  */
enum Gravity(val raw: PangoGravity):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Glyphs stand upright (default) <img align="right" valign="center"
    * src="m-south.png">
    */
  case SOUTH extends Gravity(PangoGravity.PANGO_GRAVITY_SOUTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Glyphs are rotated 90 degrees counter-clockwise. <img align="right"
    * valign="center" src="m-east.png">
    */
  case EAST extends Gravity(PangoGravity.PANGO_GRAVITY_EAST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Glyphs are upside-down. <img align="right" valign="cener"
    * src="m-north.png">
    */
  case NORTH extends Gravity(PangoGravity.PANGO_GRAVITY_NORTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Glyphs are rotated 90 degrees clockwise. <img align="right"
    * valign="center" src="m-west.png">
    */
  case WEST extends Gravity(PangoGravity.PANGO_GRAVITY_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gravity is resolved from the context matrix
    */
  case AUTO extends Gravity(PangoGravity.PANGO_GRAVITY_AUTO)
end Gravity

object Gravity:
  def fromRaw(raw: PangoGravity): Gravity =
    raw match
      case PangoGravity.PANGO_GRAVITY_SOUTH => Gravity.SOUTH
      case PangoGravity.PANGO_GRAVITY_EAST  => Gravity.EAST
      case PangoGravity.PANGO_GRAVITY_NORTH => Gravity.NORTH
      case PangoGravity.PANGO_GRAVITY_WEST  => Gravity.WEST
      case PangoGravity.PANGO_GRAVITY_AUTO  => Gravity.AUTO
  end fromRaw
end Gravity
