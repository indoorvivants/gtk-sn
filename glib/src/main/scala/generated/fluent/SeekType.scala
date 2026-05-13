package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GSeekType

/** An enumeration specifying the base position for a
  * g_io_channel_seek_position() operation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SeekType(val raw: GSeekType):
  /** the current position in the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CUR extends SeekType(GSeekType.G_SEEK_CUR)

  /** the start of the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SET extends SeekType(GSeekType.G_SEEK_SET)

  /** the end of the file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case END extends SeekType(GSeekType.G_SEEK_END)
end SeekType

object SeekType:
  def fromRaw(raw: GSeekType): SeekType =
    raw match
      case GSeekType.G_SEEK_CUR => SeekType.CUR
      case GSeekType.G_SEEK_SET => SeekType.SET
      case GSeekType.G_SEEK_END => SeekType.END
  end fromRaw
end SeekType
