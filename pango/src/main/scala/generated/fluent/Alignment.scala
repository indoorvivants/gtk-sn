package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoAlignment

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoAlignment` describes how to align the lines of a `PangoLayout` within
  * the available space.
  *
  * If the `PangoLayout` is set to justify using
  * [method@Pango.Layout.set_justify], this only affects partial lines.
  *
  * See [method@Pango.Layout.set_auto_dir] for how text direction affects the
  * interpretation of `PangoAlignment` values.
  */
enum Alignment(val raw: PangoAlignment):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Put all available space on the right
    */
  case LEFT extends Alignment(PangoAlignment.PANGO_ALIGN_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Center the line within the available space
    */
  case CENTER extends Alignment(PangoAlignment.PANGO_ALIGN_CENTER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Put all available space on the left
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
