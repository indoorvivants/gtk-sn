package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GSeekType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An enumeration specifying the base position for a
  * g_io_channel_seek_position() operation.
  */
enum SeekType(val raw: GSeekType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the current position in the file.
    */
  case CUR extends SeekType(GSeekType.G_SEEK_CUR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the start of the file.
    */
  case SET extends SeekType(GSeekType.G_SEEK_SET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the end of the file.
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
