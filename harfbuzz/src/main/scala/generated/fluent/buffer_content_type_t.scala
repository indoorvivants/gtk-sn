package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_content_type_t

/** The type of #hb_buffer_t contents.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Buffer_content_type_t(val raw: hb_buffer_content_type_t):
  /** Initial value for new buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends Buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_INVALID
      )

  /** The buffer contains input characters (before shaping).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNICODE
      extends Buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_UNICODE
      )

  /** The buffer contains output glyphs (after shaping).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case GLYPHS
      extends Buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_GLYPHS
      )
end Buffer_content_type_t

object Buffer_content_type_t:
  def fromRaw(raw: hb_buffer_content_type_t): Buffer_content_type_t =
    raw match
      case hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_INVALID =>
        Buffer_content_type_t.INVALID
      case hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_UNICODE =>
        Buffer_content_type_t.UNICODE
      case hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_GLYPHS =>
        Buffer_content_type_t.GLYPHS
  end fromRaw
end Buffer_content_type_t
