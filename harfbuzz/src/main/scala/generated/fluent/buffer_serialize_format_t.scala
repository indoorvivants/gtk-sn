package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_serialize_format_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The buffer serialization and de-serialization format used in
  * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
  */
enum buffer_serialize_format_t(val raw: hb_buffer_serialize_format_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a human-readable, plain text format.
    */
  case TEXT
      extends buffer_serialize_format_t(
        hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_TEXT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a machine-readable JSON format.
    */
  case JSON
      extends buffer_serialize_format_t(
        hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_JSON
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * invalid format.
    */
  case INVALID
      extends buffer_serialize_format_t(
        hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_INVALID
      )
end buffer_serialize_format_t

object buffer_serialize_format_t:
  def fromRaw(raw: hb_buffer_serialize_format_t): buffer_serialize_format_t =
    raw match
      case hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_TEXT =>
        buffer_serialize_format_t.TEXT
      case hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_JSON =>
        buffer_serialize_format_t.JSON
      case hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_INVALID =>
        buffer_serialize_format_t.INVALID
  end fromRaw
end buffer_serialize_format_t
