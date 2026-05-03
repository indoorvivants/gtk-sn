package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDataStreamNewlineType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GDataStreamNewlineType is used when checking for or setting the line
  * endings for a given file.
  */
enum DataStreamNewlineType(val raw: GDataStreamNewlineType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects "LF" line endings, common on most modern UNIX platforms.
    */
  case LF
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_LF
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects "CR" line endings.
    */
  case CR
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects "CR, LF" line ending, common on Microsoft Windows.
    */
  case CR_LF
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR_LF
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Automatically try to handle any line ending type.
    */
  case ANY
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_ANY
      )
end DataStreamNewlineType

object DataStreamNewlineType:
  def fromRaw(raw: GDataStreamNewlineType): DataStreamNewlineType =
    raw match
      case GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_LF =>
        DataStreamNewlineType.LF
      case GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR =>
        DataStreamNewlineType.CR
      case GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR_LF =>
        DataStreamNewlineType.CR_LF
      case GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_ANY =>
        DataStreamNewlineType.ANY
  end fromRaw
end DataStreamNewlineType
