package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Indicates the file's on-disk type.
  *
  * On Windows systems a file will never have %G_FILE_TYPE_SYMBOLIC_LINK type;
  * use #GFileInfo and %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK to determine
  * whether a file is a symlink or not. This is due to the fact that NTFS does
  * not have a single filesystem object type for symbolic links - it has files
  * that symlink to files, and directories that symlink to directories.
  * #GFileType enumeration cannot precisely represent this important
  * distinction, which is why all Windows symlinks will continue to be reported
  * as %G_FILE_TYPE_REGULAR or %G_FILE_TYPE_DIRECTORY.
  */
enum FileType(val raw: GFileType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File's type is unknown.
    */
  case UNKNOWN extends FileType(GFileType.G_FILE_TYPE_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File handle represents a regular file.
    */
  case REGULAR extends FileType(GFileType.G_FILE_TYPE_REGULAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File handle represents a directory.
    */
  case DIRECTORY extends FileType(GFileType.G_FILE_TYPE_DIRECTORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File handle represents a symbolic link (Unix systems).
    */
  case SYMBOLIC_LINK extends FileType(GFileType.G_FILE_TYPE_SYMBOLIC_LINK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is a "special" file, such as a socket, fifo, block device, or
    * character device.
    */
  case SPECIAL extends FileType(GFileType.G_FILE_TYPE_SPECIAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is a shortcut (Windows systems).
    */
  case SHORTCUT extends FileType(GFileType.G_FILE_TYPE_SHORTCUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is a mountable location.
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
