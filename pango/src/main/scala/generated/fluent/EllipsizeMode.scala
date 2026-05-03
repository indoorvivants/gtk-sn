package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoEllipsizeMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `PangoEllipsizeMode` describes what sort of ellipsization should be applied
  * to text.
  *
  * In the ellipsization process characters are removed from the text in order
  * to make it fit to a given width and replaced with an ellipsis.
  */
enum EllipsizeMode(val raw: PangoEllipsizeMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No ellipsization
    */
  case NONE extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Omit characters at the start of the text
    */
  case START extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_START)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Omit characters in the middle of the text
    */
  case MIDDLE extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_MIDDLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Omit characters at the end of the text
    */
  case END extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_END)
end EllipsizeMode

object EllipsizeMode:
  def fromRaw(raw: PangoEllipsizeMode): EllipsizeMode =
    raw match
      case PangoEllipsizeMode.PANGO_ELLIPSIZE_NONE   => EllipsizeMode.NONE
      case PangoEllipsizeMode.PANGO_ELLIPSIZE_START  => EllipsizeMode.START
      case PangoEllipsizeMode.PANGO_ELLIPSIZE_MIDDLE => EllipsizeMode.MIDDLE
      case PangoEllipsizeMode.PANGO_ELLIPSIZE_END    => EllipsizeMode.END
  end fromRaw
end EllipsizeMode
