package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileType

/** Indicates the file's on-disk type.
  *
  * On Windows systems a file will never have %G_FILE_TYPE_SYMBOLIC_LINK type;
  * use #GFileInfo and %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK to determine
  * whether a file is a symlink or not. This is due to the fact that NTFS does
  * not have a single filesystem object type for symbolic links - it has files
  * that symlink to files, and directories that symlink to directories.
  * #GFileType enumeration cannot precisely represent this important
  * distinction, which is why all Windows symlinks will continue to be reported
  * as %G_FILE_TYPE_REGULAR or %G_FILE_TYPE_DIRECTORY.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileType(val raw: GFileType):
  /** File's type is unknown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends FileType(GFileType.G_FILE_TYPE_UNKNOWN)

  /** File handle represents a regular file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REGULAR extends FileType(GFileType.G_FILE_TYPE_REGULAR)

  /** File handle represents a directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DIRECTORY extends FileType(GFileType.G_FILE_TYPE_DIRECTORY)

  /** File handle represents a symbolic link (Unix systems).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SYMBOLIC_LINK extends FileType(GFileType.G_FILE_TYPE_SYMBOLIC_LINK)

  /** File is a "special" file, such as a socket, fifo, block device, or
    * character device.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SPECIAL extends FileType(GFileType.G_FILE_TYPE_SPECIAL)

  /** File is a shortcut (Windows systems).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHORTCUT extends FileType(GFileType.G_FILE_TYPE_SHORTCUT)

  /** File is a mountable location.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOUNTABLE extends FileType(GFileType.G_FILE_TYPE_MOUNTABLE)
end FileType

object FileType:
  def fromRaw(raw: GFileType): FileType =
    raw match
      case GFileType.G_FILE_TYPE_UNKNOWN       => FileType.UNKNOWN
      case GFileType.G_FILE_TYPE_REGULAR       => FileType.REGULAR
      case GFileType.G_FILE_TYPE_DIRECTORY     => FileType.DIRECTORY
      case GFileType.G_FILE_TYPE_SYMBOLIC_LINK => FileType.SYMBOLIC_LINK
      case GFileType.G_FILE_TYPE_SPECIAL       => FileType.SPECIAL
      case GFileType.G_FILE_TYPE_SHORTCUT      => FileType.SHORTCUT
      case GFileType.G_FILE_TYPE_MOUNTABLE     => FileType.MOUNTABLE
  end fromRaw
end FileType
