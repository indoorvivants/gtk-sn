package sn.gnome.pango

import _root_.sn.gnome.pango.internal.PangoWrapMode

/** `PangoWrapMode` describes how to wrap the lines of a `PangoLayout` to the
  * desired width.
  *
  * For @PANGO_WRAP_WORD, Pango uses break opportunities that are determined by
  * the Unicode line breaking algorithm. For @PANGO_WRAP_CHAR, Pango allows
  * breaking at grapheme boundaries that are determined by the Unicode text
  * segmentation algorithm.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum WrapMode(val raw: PangoWrapMode):
  /** wrap lines at word boundaries.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD extends WrapMode(PangoWrapMode.PANGO_WRAP_WORD)

  /** wrap lines at character boundaries.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAR extends WrapMode(PangoWrapMode.PANGO_WRAP_CHAR)

  /** wrap lines at word boundaries, but fall back to character boundaries if
    * there is not enough space for a full word.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD_CHAR extends WrapMode(PangoWrapMode.PANGO_WRAP_WORD_CHAR)
end WrapMode

object WrapMode:
  def fromRaw(raw: PangoWrapMode): WrapMode =
    raw match
      case PangoWrapMode.PANGO_WRAP_WORD      => WrapMode.WORD
      case PangoWrapMode.PANGO_WRAP_CHAR      => WrapMode.CHAR
      case PangoWrapMode.PANGO_WRAP_WORD_CHAR => WrapMode.WORD_CHAR
  end fromRaw
end WrapMode
