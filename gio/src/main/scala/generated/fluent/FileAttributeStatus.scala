package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileAttributeStatus

/** Used by g_file_set_attributes_from_info() when setting file attributes.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileAttributeStatus(val raw: GFileAttributeStatus):
  /** Attribute value is unset (empty).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSET
      extends FileAttributeStatus(
        GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_UNSET
      )

  /** Attribute value is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SET
      extends FileAttributeStatus(
        GFileAttributeStatus.G_FILE_ATTRIBUTE_STATUS_SET
      )

  /** Indicates an error in setting the value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
