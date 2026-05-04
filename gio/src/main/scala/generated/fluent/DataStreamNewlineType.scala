package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDataStreamNewlineType

/** #GDataStreamNewlineType is used when checking for or setting the line
  * endings for a given file.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DataStreamNewlineType(val raw: GDataStreamNewlineType):
  /** Selects "LF" line endings, common on most modern UNIX platforms.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LF
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_LF
      )

  /** Selects "CR" line endings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CR
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR
      )

  /** Selects "CR, LF" line ending, common on Microsoft Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CR_LF
      extends DataStreamNewlineType(
        GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR_LF
      )

  /** Automatically try to handle any line ending type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
