package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_content_type_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The type of #hb_buffer_t contents.
  */
enum buffer_content_type_t(val raw: hb_buffer_content_type_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initial value for new buffer.
    */
  case INVALID
      extends buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_INVALID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The buffer contains input characters (before shaping).
    */
  case UNICODE
      extends buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_UNICODE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The buffer contains output glyphs (after shaping).
    */
  case GLYPHS
      extends buffer_content_type_t(
        hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_GLYPHS
      )
end buffer_content_type_t

object buffer_content_type_t:
  def fromRaw(raw: hb_buffer_content_type_t): buffer_content_type_t =
    raw match
      case hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_INVALID =>
        buffer_content_type_t.INVALID
      case hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_UNICODE =>
        buffer_content_type_t.UNICODE
      case hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_GLYPHS =>
        buffer_content_type_t.GLYPHS
  end fromRaw
end buffer_content_type_t
