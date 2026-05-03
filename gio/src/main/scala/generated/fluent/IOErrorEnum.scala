package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GIOErrorEnum

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  Error codes returned by GIO functions.
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
  */
enum IOErrorEnum(val raw: GIOErrorEnum):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic error condition for when an operation fails and no more specific
    * #GIOErrorEnum value is defined.
    */
  case FAILED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File not found.
    */
  case NOT_FOUND extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File already exists.
    */
  case EXISTS extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_EXISTS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is a directory.
    */
  case IS_DIRECTORY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_IS_DIRECTORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is not a directory.
    */
  case NOT_DIRECTORY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_DIRECTORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is a directory that isn't empty.
    */
  case NOT_EMPTY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_EMPTY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is not a regular file.
    */
  case NOT_REGULAR_FILE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_REGULAR_FILE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is not a symbolic link.
    */
  case NOT_SYMBOLIC_LINK
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_SYMBOLIC_LINK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File cannot be mounted.
    */
  case NOT_MOUNTABLE_FILE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_MOUNTABLE_FILE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Filename is too many characters.
    */
  case FILENAME_TOO_LONG
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_FILENAME_TOO_LONG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Filename is invalid or contains invalid characters.
    */
  case INVALID_FILENAME
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_INVALID_FILENAME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File contains too many symbolic links.
    */
  case TOO_MANY_LINKS
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_TOO_MANY_LINKS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No space left on drive.
    */
  case NO_SPACE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NO_SPACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid argument.
    */
  case INVALID_ARGUMENT
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_INVALID_ARGUMENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Permission denied.
    */
  case PERMISSION_DENIED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PERMISSION_DENIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation (or one of its parameters) not supported
    */
  case NOT_SUPPORTED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_SUPPORTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File isn't mounted.
    */
  case NOT_MOUNTED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_MOUNTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is already mounted.
    */
  case ALREADY_MOUNTED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_ALREADY_MOUNTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File was closed.
    */
  case CLOSED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CLOSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation was cancelled. See #GCancellable.
    */
  case CANCELLED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CANCELLED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operations are still pending.
    */
  case PENDING extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PENDING)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is read only.
    */
  case READ_ONLY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_READ_ONLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Backup couldn't be created.
    */
  case CANT_CREATE_BACKUP
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CANT_CREATE_BACKUP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File's Entity Tag was incorrect.
    */
  case WRONG_ETAG extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WRONG_ETAG)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation timed out.
    */
  case TIMED_OUT extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_TIMED_OUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation would be recursive.
    */
  case WOULD_RECURSE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WOULD_RECURSE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * File is busy.
    */
  case BUSY extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_BUSY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation would block.
    */
  case WOULD_BLOCK extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WOULD_BLOCK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Host couldn't be found (remote operations).
    */
  case HOST_NOT_FOUND
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_HOST_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation would merge files.
    */
  case WOULD_MERGE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_WOULD_MERGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Operation failed and a helper program has already interacted with the
    * user. Do not display any error dialog.
    */
  case FAILED_HANDLED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_FAILED_HANDLED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The current process has too many files open and can't open any more.
    * Duplicate descriptors do count toward this limit. Since 2.20
    */
  case TOO_MANY_OPEN_FILES
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_TOO_MANY_OPEN_FILES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The object has not been initialized. Since 2.22
    */
  case NOT_INITIALIZED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_INITIALIZED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The requested address is already in use. Since 2.22
    */
  case ADDRESS_IN_USE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_ADDRESS_IN_USE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Need more input to finish operation. Since 2.24
    */
  case PARTIAL_INPUT extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PARTIAL_INPUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The input data was invalid. Since 2.24
    */
  case INVALID_DATA extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_INVALID_DATA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A remote object generated an error that doesn't correspond to a locally
    * registered #GError error domain. Use g_dbus_error_get_remote_error() to
    * extract the D-Bus error name and g_dbus_error_strip_remote_error() to fix
    * up the message so it matches what was received on the wire. Since 2.26.
    */
  case DBUS_ERROR extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_DBUS_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Host unreachable. Since 2.26
    */
  case HOST_UNREACHABLE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_HOST_UNREACHABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Network unreachable. Since 2.26
    */
  case NETWORK_UNREACHABLE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NETWORK_UNREACHABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connection refused. Since 2.26
    */
  case CONNECTION_REFUSED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CONNECTION_REFUSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connection to proxy server failed. Since 2.26
    */
  case PROXY_FAILED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Proxy authentication failed. Since 2.26
    */
  case PROXY_AUTH_FAILED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_AUTH_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Proxy server needs authentication. Since 2.26
    */
  case PROXY_NEED_AUTH
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_NEED_AUTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Proxy connection is not allowed by ruleset. Since 2.26
    */
  case PROXY_NOT_ALLOWED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_PROXY_NOT_ALLOWED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Broken pipe. Since 2.36
    */
  case BROKEN_PIPE extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_BROKEN_PIPE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Connection closed by peer. Note that this is the same code as
    * %G_IO_ERROR_BROKEN_PIPE; before 2.44 some "connection closed" errors
    * returned %G_IO_ERROR_BROKEN_PIPE, but others returned %G_IO_ERROR_FAILED.
    * Now they should all return the same value, which has this more logical
    * name. Since 2.44.
    */
  case CONNECTION_CLOSED
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_CONNECTION_CLOSED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transport endpoint is not connected. Since 2.44
    */
  case NOT_CONNECTED extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_NOT_CONNECTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Message too large. Since 2.48.
    */
  case MESSAGE_TOO_LARGE
      extends IOErrorEnum(GIOErrorEnum.G_IO_ERROR_MESSAGE_TOO_LARGE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No such device found. Since 2.74
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
