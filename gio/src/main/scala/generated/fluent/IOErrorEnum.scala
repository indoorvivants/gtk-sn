package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GIOErrorEnum

/**  Error codes returned by GIO functions.
  *
  *  Note that this domain may be extended in future GLib releases. In
  *  general, new error codes either only apply to new APIs, or else
  *  replace %G_IO_ERROR_FAILED in cases that were not explicitly
  *  distinguished before. You should therefore avoid writing code like
  *  |[<!-- language="C" -->
  *  if (g_error_matches (error, G_IO_ERROR, G_IO_ERROR_FAILED))
  *    {
  *      // Assume that this is EPRINTERONFIRE
  *      ...
  *    }
  *  ]|
  *  but should instead treat all unrecognized error codes the same as
  *  %G_IO_ERROR_FAILED.
  *
  *  See also #GPollableReturn for a cheaper way of returning
  *  %G_IO_ERROR_WOULD_BLOCK to callers without allocating a #GError.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
enum IOErrorEnum(val raw: GIOErrorEnum):
  /** Generic error condition for when an operation fails and no more specific
    * #GIOErrorEnum value is defined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_FAILED)

  /** File not found.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_FOUND extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_FOUND)

  /** File already exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EXISTS extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_EXISTS)

  /** File is a directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case IS_DIRECTORY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_IS_DIRECTORY)

  /** File is not a directory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_DIRECTORY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_DIRECTORY)

  /** File is a directory that isn't empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_EMPTY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_EMPTY)

  /** File is not a regular file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_REGULAR_FILE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_REGULAR_FILE)

  /** File is not a symbolic link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_SYMBOLIC_LINK
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_SYMBOLIC_LINK)

  /** File cannot be mounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_MOUNTABLE_FILE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_MOUNTABLE_FILE)

  /** Filename is too many characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILENAME_TOO_LONG
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_FILENAME_TOO_LONG)

  /** Filename is invalid or contains invalid characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_FILENAME
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_INVALID_FILENAME)

  /** File contains too many symbolic links.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_MANY_LINKS
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_TOO_MANY_LINKS)

  /** No space left on drive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_SPACE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NO_SPACE)

  /** Invalid argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_ARGUMENT
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_INVALID_ARGUMENT)

  /** Permission denied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PERMISSION_DENIED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PERMISSION_DENIED)

  /** Operation (or one of its parameters) not supported
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_SUPPORTED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_SUPPORTED)

  /** File isn't mounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_MOUNTED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_MOUNTED)

  /** File is already mounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALREADY_MOUNTED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_ALREADY_MOUNTED)

  /** File was closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLOSED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CLOSED)

  /** Operation was cancelled. See #GCancellable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANCELLED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CANCELLED)

  /** Operations are still pending.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PENDING extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PENDING)

  /** File is read only.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case READ_ONLY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_READ_ONLY)

  /** Backup couldn't be created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CANT_CREATE_BACKUP
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CANT_CREATE_BACKUP)

  /** File's Entity Tag was incorrect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WRONG_ETAG extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WRONG_ETAG)

  /** Operation timed out.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TIMED_OUT extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_TIMED_OUT)

  /** Operation would be recursive.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WOULD_RECURSE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WOULD_RECURSE)

  /** File is busy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BUSY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_BUSY)

  /** Operation would block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WOULD_BLOCK extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WOULD_BLOCK)

  /** Host couldn't be found (remote operations).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HOST_NOT_FOUND
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_HOST_NOT_FOUND)

  /** Operation would merge files.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WOULD_MERGE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WOULD_MERGE)

  /** Operation failed and a helper program has already interacted with the
    * user. Do not display any error dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED_HANDLED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_FAILED_HANDLED)

  /** The current process has too many files open and can't open any more.
    * Duplicate descriptors do count toward this limit. Since 2.20
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOO_MANY_OPEN_FILES
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_TOO_MANY_OPEN_FILES)

  /** The object has not been initialized. Since 2.22
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_INITIALIZED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_INITIALIZED)

  /** The requested address is already in use. Since 2.22
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ADDRESS_IN_USE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_ADDRESS_IN_USE)

  /** Need more input to finish operation. Since 2.24
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARTIAL_INPUT extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PARTIAL_INPUT)

  /** The input data was invalid. Since 2.24
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_DATA extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_INVALID_DATA)

  /** A remote object generated an error that doesn't correspond to a locally
    * registered #GError error domain. Use g_dbus_error_get_remote_error() to
    * extract the D-Bus error name and g_dbus_error_strip_remote_error() to fix
    * up the message so it matches what was received on the wire. Since 2.26.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DBUS_ERROR extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_DBUS_ERROR)

  /** Host unreachable. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HOST_UNREACHABLE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_HOST_UNREACHABLE)

  /** Network unreachable. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NETWORK_UNREACHABLE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NETWORK_UNREACHABLE)

  /** Connection refused. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONNECTION_REFUSED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CONNECTION_REFUSED)

  /** Connection to proxy server failed. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXY_FAILED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_FAILED)

  /** Proxy authentication failed. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXY_AUTH_FAILED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_AUTH_FAILED)

  /** Proxy server needs authentication. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXY_NEED_AUTH
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_NEED_AUTH)

  /** Proxy connection is not allowed by ruleset. Since 2.26
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PROXY_NOT_ALLOWED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_NOT_ALLOWED)

  /** Broken pipe. Since 2.36
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BROKEN_PIPE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_BROKEN_PIPE)

  /** Connection closed by peer. Note that this is the same code as
    * %G_IO_ERROR_BROKEN_PIPE; before 2.44 some "connection closed" errors
    * returned %G_IO_ERROR_BROKEN_PIPE, but others returned %G_IO_ERROR_FAILED.
    * Now they should all return the same value, which has this more logical
    * name. Since 2.44.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONNECTION_CLOSED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CONNECTION_CLOSED)

  /** Transport endpoint is not connected. Since 2.44
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_CONNECTED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_CONNECTED)

  /** Message too large. Since 2.48.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MESSAGE_TOO_LARGE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_MESSAGE_TOO_LARGE)

  /** No such device found. Since 2.74
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NO_SUCH_DEVICE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NO_SUCH_DEVICE)
end IOErrorEnum

object IOErrorEnum:
  def fromRaw(raw: GIOErrorEnum): IOErrorEnum =
    raw match
      case GIOErrorEnum.G_IO_ERROR_FAILED           => IOErrorEnum.FAILED
      case GIOErrorEnum.G_IO_ERROR_NOT_FOUND        => IOErrorEnum.NOT_FOUND
      case GIOErrorEnum.G_IO_ERROR_EXISTS           => IOErrorEnum.EXISTS
      case GIOErrorEnum.G_IO_ERROR_IS_DIRECTORY     => IOErrorEnum.IS_DIRECTORY
      case GIOErrorEnum.G_IO_ERROR_NOT_DIRECTORY    => IOErrorEnum.NOT_DIRECTORY
      case GIOErrorEnum.G_IO_ERROR_NOT_EMPTY        => IOErrorEnum.NOT_EMPTY
      case GIOErrorEnum.G_IO_ERROR_NOT_REGULAR_FILE =>
        IOErrorEnum.NOT_REGULAR_FILE
      case GIOErrorEnum.G_IO_ERROR_NOT_SYMBOLIC_LINK =>
        IOErrorEnum.NOT_SYMBOLIC_LINK
      case GIOErrorEnum.G_IO_ERROR_NOT_MOUNTABLE_FILE =>
        IOErrorEnum.NOT_MOUNTABLE_FILE
      case GIOErrorEnum.G_IO_ERROR_FILENAME_TOO_LONG =>
        IOErrorEnum.FILENAME_TOO_LONG
      case GIOErrorEnum.G_IO_ERROR_INVALID_FILENAME =>
        IOErrorEnum.INVALID_FILENAME
      case GIOErrorEnum.G_IO_ERROR_TOO_MANY_LINKS => IOErrorEnum.TOO_MANY_LINKS
      case GIOErrorEnum.G_IO_ERROR_NO_SPACE       => IOErrorEnum.NO_SPACE
      case GIOErrorEnum.G_IO_ERROR_INVALID_ARGUMENT =>
        IOErrorEnum.INVALID_ARGUMENT
      case GIOErrorEnum.G_IO_ERROR_PERMISSION_DENIED =>
        IOErrorEnum.PERMISSION_DENIED
      case GIOErrorEnum.G_IO_ERROR_NOT_SUPPORTED   => IOErrorEnum.NOT_SUPPORTED
      case GIOErrorEnum.G_IO_ERROR_NOT_MOUNTED     => IOErrorEnum.NOT_MOUNTED
      case GIOErrorEnum.G_IO_ERROR_ALREADY_MOUNTED =>
        IOErrorEnum.ALREADY_MOUNTED
      case GIOErrorEnum.G_IO_ERROR_CLOSED             => IOErrorEnum.CLOSED
      case GIOErrorEnum.G_IO_ERROR_CANCELLED          => IOErrorEnum.CANCELLED
      case GIOErrorEnum.G_IO_ERROR_PENDING            => IOErrorEnum.PENDING
      case GIOErrorEnum.G_IO_ERROR_READ_ONLY          => IOErrorEnum.READ_ONLY
      case GIOErrorEnum.G_IO_ERROR_CANT_CREATE_BACKUP =>
        IOErrorEnum.CANT_CREATE_BACKUP
      case GIOErrorEnum.G_IO_ERROR_WRONG_ETAG     => IOErrorEnum.WRONG_ETAG
      case GIOErrorEnum.G_IO_ERROR_TIMED_OUT      => IOErrorEnum.TIMED_OUT
      case GIOErrorEnum.G_IO_ERROR_WOULD_RECURSE  => IOErrorEnum.WOULD_RECURSE
      case GIOErrorEnum.G_IO_ERROR_BUSY           => IOErrorEnum.BUSY
      case GIOErrorEnum.G_IO_ERROR_WOULD_BLOCK    => IOErrorEnum.WOULD_BLOCK
      case GIOErrorEnum.G_IO_ERROR_HOST_NOT_FOUND => IOErrorEnum.HOST_NOT_FOUND
      case GIOErrorEnum.G_IO_ERROR_WOULD_MERGE    => IOErrorEnum.WOULD_MERGE
      case GIOErrorEnum.G_IO_ERROR_FAILED_HANDLED => IOErrorEnum.FAILED_HANDLED
      case GIOErrorEnum.G_IO_ERROR_TOO_MANY_OPEN_FILES =>
        IOErrorEnum.TOO_MANY_OPEN_FILES
      case GIOErrorEnum.G_IO_ERROR_NOT_INITIALIZED =>
        IOErrorEnum.NOT_INITIALIZED
      case GIOErrorEnum.G_IO_ERROR_ADDRESS_IN_USE => IOErrorEnum.ADDRESS_IN_USE
      case GIOErrorEnum.G_IO_ERROR_PARTIAL_INPUT  => IOErrorEnum.PARTIAL_INPUT
      case GIOErrorEnum.G_IO_ERROR_INVALID_DATA   => IOErrorEnum.INVALID_DATA
      case GIOErrorEnum.G_IO_ERROR_DBUS_ERROR     => IOErrorEnum.DBUS_ERROR
      case GIOErrorEnum.G_IO_ERROR_HOST_UNREACHABLE =>
        IOErrorEnum.HOST_UNREACHABLE
      case GIOErrorEnum.G_IO_ERROR_NETWORK_UNREACHABLE =>
        IOErrorEnum.NETWORK_UNREACHABLE
      case GIOErrorEnum.G_IO_ERROR_CONNECTION_REFUSED =>
        IOErrorEnum.CONNECTION_REFUSED
      case GIOErrorEnum.G_IO_ERROR_PROXY_FAILED      => IOErrorEnum.PROXY_FAILED
      case GIOErrorEnum.G_IO_ERROR_PROXY_AUTH_FAILED =>
        IOErrorEnum.PROXY_AUTH_FAILED
      case GIOErrorEnum.G_IO_ERROR_PROXY_NEED_AUTH =>
        IOErrorEnum.PROXY_NEED_AUTH
      case GIOErrorEnum.G_IO_ERROR_PROXY_NOT_ALLOWED =>
        IOErrorEnum.PROXY_NOT_ALLOWED
      case GIOErrorEnum.G_IO_ERROR_BROKEN_PIPE       => IOErrorEnum.BROKEN_PIPE
      case GIOErrorEnum.G_IO_ERROR_CONNECTION_CLOSED =>
        IOErrorEnum.CONNECTION_CLOSED
      case GIOErrorEnum.G_IO_ERROR_NOT_CONNECTED => IOErrorEnum.NOT_CONNECTED
      case GIOErrorEnum.G_IO_ERROR_MESSAGE_TOO_LARGE =>
        IOErrorEnum.MESSAGE_TOO_LARGE
      case GIOErrorEnum.G_IO_ERROR_NO_SUCH_DEVICE => IOErrorEnum.NO_SUCH_DEVICE
  end fromRaw
end IOErrorEnum
