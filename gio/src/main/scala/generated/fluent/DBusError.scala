package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GDBusError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes for the %G_DBUS_ERROR error domain.
  */
enum DBusError(val raw: GDBusError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A generic error; "something went wrong" - see the error message for more.
    */
  case FAILED extends DBusError(GDBusError.G_DBUS_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * There was not enough memory to complete an operation.
    */
  case NO_MEMORY extends DBusError(GDBusError.G_DBUS_ERROR_NO_MEMORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The bus doesn't know how to launch a service to supply the bus name you
    * wanted.
    */
  case SERVICE_UNKNOWN
      extends DBusError(GDBusError.G_DBUS_ERROR_SERVICE_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The bus name you referenced doesn't exist (i.e. no application owns it).
    */
  case NAME_HAS_NO_OWNER
      extends DBusError(GDBusError.G_DBUS_ERROR_NAME_HAS_NO_OWNER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No reply to a message expecting one, usually means a timeout occurred.
    */
  case NO_REPLY extends DBusError(GDBusError.G_DBUS_ERROR_NO_REPLY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Something went wrong reading or writing to a socket, for example.
    */
  case IO_ERROR extends DBusError(GDBusError.G_DBUS_ERROR_IO_ERROR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A D-Bus bus address was malformed.
    */
  case BAD_ADDRESS extends DBusError(GDBusError.G_DBUS_ERROR_BAD_ADDRESS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Requested operation isn't supported (like ENOSYS on UNIX).
    */
  case NOT_SUPPORTED extends DBusError(GDBusError.G_DBUS_ERROR_NOT_SUPPORTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Some limited resource is exhausted.
    */
  case LIMITS_EXCEEDED
      extends DBusError(GDBusError.G_DBUS_ERROR_LIMITS_EXCEEDED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Security restrictions don't allow doing what you're trying to do.
    */
  case ACCESS_DENIED extends DBusError(GDBusError.G_DBUS_ERROR_ACCESS_DENIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Authentication didn't work.
    */
  case AUTH_FAILED extends DBusError(GDBusError.G_DBUS_ERROR_AUTH_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unable to connect to server (probably caused by ECONNREFUSED on a socket).
    */
  case NO_SERVER extends DBusError(GDBusError.G_DBUS_ERROR_NO_SERVER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Certain timeout errors, possibly ETIMEDOUT on a socket. Note that
    * %G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning: this
    * is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also exists. We
    * can't fix it for compatibility reasons so just be careful.
    */
  case TIMEOUT extends DBusError(GDBusError.G_DBUS_ERROR_TIMEOUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No network access (probably ENETUNREACH on a socket).
    */
  case NO_NETWORK extends DBusError(GDBusError.G_DBUS_ERROR_NO_NETWORK)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Can't bind a socket since its address is in use (i.e. EADDRINUSE).
    */
  case ADDRESS_IN_USE extends DBusError(GDBusError.G_DBUS_ERROR_ADDRESS_IN_USE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The connection is disconnected and you're trying to use it.
    */
  case DISCONNECTED extends DBusError(GDBusError.G_DBUS_ERROR_DISCONNECTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Invalid arguments passed to a method call.
    */
  case INVALID_ARGS extends DBusError(GDBusError.G_DBUS_ERROR_INVALID_ARGS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Missing file.
    */
  case FILE_NOT_FOUND extends DBusError(GDBusError.G_DBUS_ERROR_FILE_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Existing file and the operation you're using does not silently overwrite.
    */
  case FILE_EXISTS extends DBusError(GDBusError.G_DBUS_ERROR_FILE_EXISTS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Method name you invoked isn't known by the object you invoked it on.
    */
  case UNKNOWN_METHOD extends DBusError(GDBusError.G_DBUS_ERROR_UNKNOWN_METHOD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Certain timeout errors, e.g. while starting a service. Warning: this is
    * confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We can't
    * fix it for compatibility reasons so just be careful.
    */
  case TIMED_OUT extends DBusError(GDBusError.G_DBUS_ERROR_TIMED_OUT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tried to remove or modify a match rule that didn't exist.
    */
  case MATCH_RULE_NOT_FOUND
      extends DBusError(GDBusError.G_DBUS_ERROR_MATCH_RULE_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The match rule isn't syntactically valid.
    */
  case MATCH_RULE_INVALID
      extends DBusError(GDBusError.G_DBUS_ERROR_MATCH_RULE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * While starting a new process, the exec() call failed.
    */
  case SPAWN_EXEC_FAILED
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_EXEC_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * While starting a new process, the fork() call failed.
    */
  case SPAWN_FORK_FAILED
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_FORK_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * While starting a new process, the child exited with a status code.
    */
  case SPAWN_CHILD_EXITED
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_CHILD_EXITED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * While starting a new process, the child exited on a signal.
    */
  case SPAWN_CHILD_SIGNALED
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_CHILD_SIGNALED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * While starting a new process, something went wrong.
    */
  case SPAWN_FAILED extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * We failed to setup the environment correctly.
    */
  case SPAWN_SETUP_FAILED
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_SETUP_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * We failed to setup the config parser correctly.
    */
  case SPAWN_CONFIG_INVALID
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_CONFIG_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bus name was not valid.
    */
  case SPAWN_SERVICE_INVALID
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Service file not found in system-services directory.
    */
  case SPAWN_SERVICE_NOT_FOUND
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Permissions are incorrect on the setuid helper.
    */
  case SPAWN_PERMISSIONS_INVALID
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Service file invalid (Name, User or Exec missing).
    */
  case SPAWN_FILE_INVALID
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_FILE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tried to get a UNIX process ID and it wasn't available.
    */
  case SPAWN_NO_MEMORY
      extends DBusError(GDBusError.G_DBUS_ERROR_SPAWN_NO_MEMORY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tried to get a UNIX process ID and it wasn't available.
    */
  case UNIX_PROCESS_ID_UNKNOWN
      extends DBusError(GDBusError.G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A type signature is not valid.
    */
  case INVALID_SIGNATURE
      extends DBusError(GDBusError.G_DBUS_ERROR_INVALID_SIGNATURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A file contains invalid syntax or is otherwise broken.
    */
  case INVALID_FILE_CONTENT
      extends DBusError(GDBusError.G_DBUS_ERROR_INVALID_FILE_CONTENT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asked for SELinux security context and it wasn't available.
    */
  case SELINUX_SECURITY_CONTEXT_UNKNOWN
      extends DBusError(
        GDBusError.G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asked for ADT audit data and it wasn't available.
    */
  case ADT_AUDIT_DATA_UNKNOWN
      extends DBusError(GDBusError.G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * There's already an object with the requested object path.
    */
  case OBJECT_PATH_IN_USE
      extends DBusError(GDBusError.G_DBUS_ERROR_OBJECT_PATH_IN_USE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Object you invoked a method on isn't known. Since 2.42
    */
  case UNKNOWN_OBJECT extends DBusError(GDBusError.G_DBUS_ERROR_UNKNOWN_OBJECT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Interface you invoked a method on isn't known by the object. Since 2.42
    */
  case UNKNOWN_INTERFACE
      extends DBusError(GDBusError.G_DBUS_ERROR_UNKNOWN_INTERFACE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Property you tried to access isn't known by the object. Since 2.42
    */
  case UNKNOWN_PROPERTY
      extends DBusError(GDBusError.G_DBUS_ERROR_UNKNOWN_PROPERTY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Property you tried to set is read-only. Since 2.42
    */
  case PROPERTY_READ_ONLY
      extends DBusError(GDBusError.G_DBUS_ERROR_PROPERTY_READ_ONLY)
end DBusError

object DBusError:
  def fromRaw(raw: GDBusError): DBusError =
    raw match
      case GDBusError.G_DBUS_ERROR_FAILED          => DBusError.FAILED
      case GDBusError.G_DBUS_ERROR_NO_MEMORY       => DBusError.NO_MEMORY
      case GDBusError.G_DBUS_ERROR_SERVICE_UNKNOWN => DBusError.SERVICE_UNKNOWN
      case GDBusError.G_DBUS_ERROR_NAME_HAS_NO_OWNER =>
        DBusError.NAME_HAS_NO_OWNER
      case GDBusError.G_DBUS_ERROR_NO_REPLY        => DBusError.NO_REPLY
      case GDBusError.G_DBUS_ERROR_IO_ERROR        => DBusError.IO_ERROR
      case GDBusError.G_DBUS_ERROR_BAD_ADDRESS     => DBusError.BAD_ADDRESS
      case GDBusError.G_DBUS_ERROR_NOT_SUPPORTED   => DBusError.NOT_SUPPORTED
      case GDBusError.G_DBUS_ERROR_LIMITS_EXCEEDED => DBusError.LIMITS_EXCEEDED
      case GDBusError.G_DBUS_ERROR_ACCESS_DENIED   => DBusError.ACCESS_DENIED
      case GDBusError.G_DBUS_ERROR_AUTH_FAILED     => DBusError.AUTH_FAILED
      case GDBusError.G_DBUS_ERROR_NO_SERVER       => DBusError.NO_SERVER
      case GDBusError.G_DBUS_ERROR_TIMEOUT         => DBusError.TIMEOUT
      case GDBusError.G_DBUS_ERROR_NO_NETWORK      => DBusError.NO_NETWORK
      case GDBusError.G_DBUS_ERROR_ADDRESS_IN_USE  => DBusError.ADDRESS_IN_USE
      case GDBusError.G_DBUS_ERROR_DISCONNECTED    => DBusError.DISCONNECTED
      case GDBusError.G_DBUS_ERROR_INVALID_ARGS    => DBusError.INVALID_ARGS
      case GDBusError.G_DBUS_ERROR_FILE_NOT_FOUND  => DBusError.FILE_NOT_FOUND
      case GDBusError.G_DBUS_ERROR_FILE_EXISTS     => DBusError.FILE_EXISTS
      case GDBusError.G_DBUS_ERROR_UNKNOWN_METHOD  => DBusError.UNKNOWN_METHOD
      case GDBusError.G_DBUS_ERROR_TIMED_OUT       => DBusError.TIMED_OUT
      case GDBusError.G_DBUS_ERROR_MATCH_RULE_NOT_FOUND =>
        DBusError.MATCH_RULE_NOT_FOUND
      case GDBusError.G_DBUS_ERROR_MATCH_RULE_INVALID =>
        DBusError.MATCH_RULE_INVALID
      case GDBusError.G_DBUS_ERROR_SPAWN_EXEC_FAILED =>
        DBusError.SPAWN_EXEC_FAILED
      case GDBusError.G_DBUS_ERROR_SPAWN_FORK_FAILED =>
        DBusError.SPAWN_FORK_FAILED
      case GDBusError.G_DBUS_ERROR_SPAWN_CHILD_EXITED =>
        DBusError.SPAWN_CHILD_EXITED
      case GDBusError.G_DBUS_ERROR_SPAWN_CHILD_SIGNALED =>
        DBusError.SPAWN_CHILD_SIGNALED
      case GDBusError.G_DBUS_ERROR_SPAWN_FAILED       => DBusError.SPAWN_FAILED
      case GDBusError.G_DBUS_ERROR_SPAWN_SETUP_FAILED =>
        DBusError.SPAWN_SETUP_FAILED
      case GDBusError.G_DBUS_ERROR_SPAWN_CONFIG_INVALID =>
        DBusError.SPAWN_CONFIG_INVALID
      case GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_INVALID =>
        DBusError.SPAWN_SERVICE_INVALID
      case GDBusError.G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND =>
        DBusError.SPAWN_SERVICE_NOT_FOUND
      case GDBusError.G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID =>
        DBusError.SPAWN_PERMISSIONS_INVALID
      case GDBusError.G_DBUS_ERROR_SPAWN_FILE_INVALID =>
        DBusError.SPAWN_FILE_INVALID
      case GDBusError.G_DBUS_ERROR_SPAWN_NO_MEMORY => DBusError.SPAWN_NO_MEMORY
      case GDBusError.G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN =>
        DBusError.UNIX_PROCESS_ID_UNKNOWN
      case GDBusError.G_DBUS_ERROR_INVALID_SIGNATURE =>
        DBusError.INVALID_SIGNATURE
      case GDBusError.G_DBUS_ERROR_INVALID_FILE_CONTENT =>
        DBusError.INVALID_FILE_CONTENT
      case GDBusError.G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN =>
        DBusError.SELINUX_SECURITY_CONTEXT_UNKNOWN
      case GDBusError.G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN =>
        DBusError.ADT_AUDIT_DATA_UNKNOWN
      case GDBusError.G_DBUS_ERROR_OBJECT_PATH_IN_USE =>
        DBusError.OBJECT_PATH_IN_USE
      case GDBusError.G_DBUS_ERROR_UNKNOWN_OBJECT    => DBusError.UNKNOWN_OBJECT
      case GDBusError.G_DBUS_ERROR_UNKNOWN_INTERFACE =>
        DBusError.UNKNOWN_INTERFACE
      case GDBusError.G_DBUS_ERROR_UNKNOWN_PROPERTY =>
        DBusError.UNKNOWN_PROPERTY
      case GDBusError.G_DBUS_ERROR_PROPERTY_READ_ONLY =>
        DBusError.PROPERTY_READ_ONLY
  end fromRaw
end DBusError
