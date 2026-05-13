package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GFileError

/** Values corresponding to @errno codes returned from file operations on UNIX.
  * Unlike @errno codes, GFileError values are available on all systems, even
  * Windows. The exact meaning of each code depends on what sort of file
  * operation you were performing; the UNIX documentation gives more details.
  * The following error code descriptions come from the GNU C Library manual,
  * and are under the copyright of that manual.
  *
  * It's not very portable to make detailed assumptions about exactly which
  * errors will be returned from a given operation. Some errors don't occur on
  * some systems, etc., sometimes there are subtle differences in when a system
  * will report a given error, etc.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileError(val raw: GFileError):
  /** Operation not permitted; only the owner of the file (or other resource) or
    * processes with special privileges can perform the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXIST extends FileError(GFileError.G_FILE_ERROR_EXIST)

  /** File is a directory; you cannot open a directory for writing, or create or
    * remove hard links to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ISDIR extends FileError(GFileError.G_FILE_ERROR_ISDIR)

  /** Permission denied; the file permissions do not allow the attempted
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ACCES extends FileError(GFileError.G_FILE_ERROR_ACCES)

  /** Filename too long.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NAMETOOLONG extends FileError(GFileError.G_FILE_ERROR_NAMETOOLONG)

  /** No such file or directory. This is a "file doesn't exist" error for
    * ordinary files that are referenced in contexts where they are expected to
    * already exist.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOENT extends FileError(GFileError.G_FILE_ERROR_NOENT)

  /** A file that isn't a directory was specified when a directory is required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOTDIR extends FileError(GFileError.G_FILE_ERROR_NOTDIR)

  /** No such device or address. The system tried to use the device represented
    * by a file you specified, and it couldn't find the device. This can mean
    * that the device file was installed incorrectly, or that the physical
    * device is missing or not correctly attached to the computer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NXIO extends FileError(GFileError.G_FILE_ERROR_NXIO)

  /** The underlying file system of the specified file does not support memory
    * mapping.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NODEV extends FileError(GFileError.G_FILE_ERROR_NODEV)

  /** The directory containing the new link can't be modified because it's on a
    * read-only file system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ROFS extends FileError(GFileError.G_FILE_ERROR_ROFS)

  /** Text file busy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TXTBSY extends FileError(GFileError.G_FILE_ERROR_TXTBSY)

  /** You passed in a pointer to bad memory. (GLib won't reliably return this,
    * don't pass in pointers to bad memory.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAULT extends FileError(GFileError.G_FILE_ERROR_FAULT)

  /** Too many levels of symbolic links were encountered in looking up a file
    * name. This often indicates a cycle of symbolic links.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOOP extends FileError(GFileError.G_FILE_ERROR_LOOP)

  /** No space left on device; write operation on a file failed because the disk
    * is full.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOSPC extends FileError(GFileError.G_FILE_ERROR_NOSPC)

  /** No memory available. The system cannot allocate more virtual memory
    * because its capacity is full.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOMEM extends FileError(GFileError.G_FILE_ERROR_NOMEM)

  /** The current process has too many files open and can't open any more.
    * Duplicate descriptors do count toward this limit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MFILE extends FileError(GFileError.G_FILE_ERROR_MFILE)

  /** There are too many distinct file openings in the entire system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NFILE extends FileError(GFileError.G_FILE_ERROR_NFILE)

  /** Bad file descriptor; for example, I/O on a descriptor that has been closed
    * or reading from a descriptor open only for writing (or vice versa).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BADF extends FileError(GFileError.G_FILE_ERROR_BADF)

  /** Invalid argument. This is used to indicate various kinds of problems with
    * passing the wrong argument to a library function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVAL extends FileError(GFileError.G_FILE_ERROR_INVAL)

  /** Broken pipe; there is no process reading from the other end of a pipe.
    * Every library function that returns this error code also generates a
    * 'SIGPIPE' signal; this signal terminates the program if not handled or
    * blocked. Thus, your program will never actually see this code unless it
    * has handled or blocked 'SIGPIPE'.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PIPE extends FileError(GFileError.G_FILE_ERROR_PIPE)

  /** Resource temporarily unavailable; the call might work if you try again
    * later.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AGAIN extends FileError(GFileError.G_FILE_ERROR_AGAIN)

  /** Interrupted function call; an asynchronous signal occurred and prevented
    * completion of the call. When this happens, you should try the call again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTR extends FileError(GFileError.G_FILE_ERROR_INTR)

  /** Input/output error; usually used for physical read or write errors. i.e.
    * the disk or other physical device hardware is returning errors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IO extends FileError(GFileError.G_FILE_ERROR_IO)

  /** Operation not permitted; only the owner of the file (or other resource) or
    * processes with special privileges can perform the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PERM extends FileError(GFileError.G_FILE_ERROR_PERM)

  /** Function not implemented; this indicates that the system is missing some
    * functionality.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOSYS extends FileError(GFileError.G_FILE_ERROR_NOSYS)

  /** Does not correspond to a UNIX error code; this is the standard "failed for
    * unspecified reason" error code present in all #GError error code
    * enumerations. Returned if no specific code applies.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends FileError(GFileError.G_FILE_ERROR_FAILED)
end FileError

object FileError:
  def fromRaw(raw: GFileError): FileError =
    raw match
      case GFileError.G_FILE_ERROR_EXIST       => FileError.EXIST
      case GFileError.G_FILE_ERROR_ISDIR       => FileError.ISDIR
      case GFileError.G_FILE_ERROR_ACCES       => FileError.ACCES
      case GFileError.G_FILE_ERROR_NAMETOOLONG => FileError.NAMETOOLONG
      case GFileError.G_FILE_ERROR_NOENT       => FileError.NOENT
      case GFileError.G_FILE_ERROR_NOTDIR      => FileError.NOTDIR
      case GFileError.G_FILE_ERROR_NXIO        => FileError.NXIO
      case GFileError.G_FILE_ERROR_NODEV       => FileError.NODEV
      case GFileError.G_FILE_ERROR_ROFS        => FileError.ROFS
      case GFileError.G_FILE_ERROR_TXTBSY      => FileError.TXTBSY
      case GFileError.G_FILE_ERROR_FAULT       => FileError.FAULT
      case GFileError.G_FILE_ERROR_LOOP        => FileError.LOOP
      case GFileError.G_FILE_ERROR_NOSPC       => FileError.NOSPC
      case GFileError.G_FILE_ERROR_NOMEM       => FileError.NOMEM
      case GFileError.G_FILE_ERROR_MFILE       => FileError.MFILE
      case GFileError.G_FILE_ERROR_NFILE       => FileError.NFILE
      case GFileError.G_FILE_ERROR_BADF        => FileError.BADF
      case GFileError.G_FILE_ERROR_INVAL       => FileError.INVAL
      case GFileError.G_FILE_ERROR_PIPE        => FileError.PIPE
      case GFileError.G_FILE_ERROR_AGAIN       => FileError.AGAIN
      case GFileError.G_FILE_ERROR_INTR        => FileError.INTR
      case GFileError.G_FILE_ERROR_IO          => FileError.IO
      case GFileError.G_FILE_ERROR_PERM        => FileError.PERM
      case GFileError.G_FILE_ERROR_NOSYS       => FileError.NOSYS
      case GFileError.G_FILE_ERROR_FAILED      => FileError.FAILED
  end fromRaw
end FileError
