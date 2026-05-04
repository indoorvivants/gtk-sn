package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoAlignment

/** `PangoAlignment` describes how to align the lines of a `PangoLayout` within
  * the available space.
  *
  * If the `PangoLayout` is set to justify using
  * [method@Pango.Layout.set_justify], this only affects partial lines.
  *
  * See [method@Pango.Layout.set_auto_dir] for how text direction affects the
  * interpretation of `PangoAlignment` values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Alignment(val raw: PangoAlignment):
  /** Put all available space on the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends Alignment(PangoAlignment.PANGO_ALIGN_LEFT)

  /** Center the line within the available space
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER extends Alignment(PangoAlignment.PANGO_ALIGN_CENTER)

  /** Put all available space on the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends Alignment(PangoAlignment.PANGO_ALIGN_RIGHT)
end Alignment

object Alignment:
  def fromRaw(raw: PangoAlignment): Alignment =
    raw match
      case PangoAlignment.PANGO_ALIGN_LEFT   => Alignment.LEFT
      case PangoAlignment.PANGO_ALIGN_CENTER => Alignment.CENTER
      case PangoAlignment.PANGO_ALIGN_RIGHT  => Alignment.RIGHT
  end fromRaw
end Alignment
