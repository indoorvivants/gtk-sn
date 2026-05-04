package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_serialize_format_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The buffer serialization and de-serialization format used in
  * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
  */
enum Buffer_serialize_format_t(val raw: hb_buffer_serialize_format_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a human-readable, plain text format.
    */
  case TEXT
      extends Buffer_serialize_format_t(
        hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_TEXT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a machine-readable JSON format.
    */
  case JSON
      extends Buffer_serialize_format_t(
        hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_JSON
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * invalid format.
    */
  case INVALID
      extends Buffer_serialize_format_t(
        hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_INVALID
      )
end Buffer_serialize_format_t

object Buffer_serialize_format_t:
  def fromRaw(raw: hb_buffer_serialize_format_t): Buffer_serialize_format_t =
    raw match
      case hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_TEXT =>
        Buffer_serialize_format_t.TEXT
      case hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_JSON =>
        Buffer_serialize_format_t.JSON
      case hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_INVALID =>
        Buffer_serialize_format_t.INVALID
  end fromRaw
end Buffer_serialize_format_t
