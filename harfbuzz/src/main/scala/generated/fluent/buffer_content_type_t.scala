package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_content_type_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of #hb_buffer_t contents.
  */
enum Buffer_content_type_t(val raw: hb_buffer_content_type_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initial value for new buffer.
    */
  case INVALID
      extends Buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The buffer contains input characters (before shaping).
    */
  case UNICODE
      extends Buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_UNICODE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The buffer contains output glyphs (after shaping).
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
