package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.PangoEllipsizeMode

/** `PangoEllipsizeMode` describes what sort of ellipsization should be applied
  * to text.
  *
  * In the ellipsization process characters are removed from the text in order
  * to make it fit to a given width and replaced with an ellipsis.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum EllipsizeMode(val raw: PangoEllipsizeMode):
  /** No ellipsization
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_NONE)

  /** Omit characters at the start of the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case START extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_START)

  /** Omit characters in the middle of the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MIDDLE extends EllipsizeMode(PangoEllipsizeMode.PANGO_ELLIPSIZE_MIDDLE)

  /** Omit characters at the end of the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
