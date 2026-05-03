package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileAttributeStatus

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used by g_file_set_attributes_from_info() when setting file attributes.
  */
enum FileAttributeStatus(val raw: GFileAttributeStatus):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attribute value is unset (empty).
    */
  case UNSET
      extends FileAttributeStatus(
        GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_UNSET
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attribute value is set.
    */
  case SET
      extends FileAttributeStatus(
        GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_SET
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates an error in setting the value.
    */
  case ERROR_SETTING
      extends FileAttributeStatus(
        GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING
      )
end FileAttributeStatus

object FileAttributeStatus:
  def fromRaw(raw: GFileAttributeStatus): FileAttributeStatus =
    raw match
      case GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_UNSET =>
        FileAttributeStatus.UNSET
      case GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_SET =>
        FileAttributeStatus.SET
      case GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_ERROR_SETTING =>
        FileAttributeStatus.ERROR_SETTING
  end fromRaw
end FileAttributeStatus
