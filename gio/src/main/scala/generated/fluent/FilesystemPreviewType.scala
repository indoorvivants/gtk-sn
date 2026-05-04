package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFilesystemPreviewType

/** Indicates a hint from the file system whether files should be previewed in a
  * file manager. Returned as the value of the key
  * %G_FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FilesystemPreviewType(val raw: GFilesystemPreviewType):
  /** Only preview files if user has explicitly requested it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IF_ALWAYS
      extends FilesystemPreviewType(
        GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS
      )

  /** Preview files if user has requested preview of "local" files.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IF_LOCAL
      extends FilesystemPreviewType(
        GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL
      )

  /** Never preview files.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NEVER
      extends FilesystemPreviewType(
        GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_NEVER
      )
end FilesystemPreviewType

object FilesystemPreviewType:
  def fromRaw(raw: GFilesystemPreviewType): FilesystemPreviewType =
    raw match
      case GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_ALWAYS =>
        FilesystemPreviewType.IF_ALWAYS
      case GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_IF_LOCAL =>
        FilesystemPreviewType.IF_LOCAL
      case GFilesystemPreviewType.G_FILESYSTEM_PREVIEW_TYPE_NEVER =>
        FilesystemPreviewType.NEVER
  end fromRaw
end FilesystemPreviewType
