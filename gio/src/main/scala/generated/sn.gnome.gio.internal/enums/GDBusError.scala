package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusError: _DBUS_ERROR_FAILED: A generic error; "something went wrong" - see the error message for more. _DBUS_ERROR_NO_MEMORY: There was not enough memory to complete an operation. _DBUS_ERROR_SERVICE_UNKNOWN: The bus doesn't know how to launch a service to supply the bus name you wanted. _DBUS_ERROR_NAME_HAS_NO_OWNER: The bus name you referenced doesn't exist (i.e. no application owns it). _DBUS_ERROR_NO_REPLY: No reply to a message expecting one, usually means a timeout occurred. _DBUS_ERROR_IO_ERROR: Something went wrong reading or writing to a socket, for example. _DBUS_ERROR_BAD_ADDRESS: A D-Bus bus address was malformed. _DBUS_ERROR_NOT_SUPPORTED: Requested operation isn't supported (like ENOSYS on UNIX). _DBUS_ERROR_LIMITS_EXCEEDED: Some limited resource is exhausted. _DBUS_ERROR_ACCESS_DENIED: Security restrictions don't allow doing what you're trying to do. _DBUS_ERROR_AUTH_FAILED: Authentication didn't work. _DBUS_ERROR_NO_SERVER: Unable to connect to server (probably caused by ECONNREFUSED on a socket). _DBUS_ERROR_TIMEOUT: Certain timeout errors, possibly ETIMEDOUT on a socket. Note that %G_DBUS_ERROR_NO_REPLY is used for message reply timeouts. Warning: this is confusingly-named given that %G_DBUS_ERROR_TIMED_OUT also exists. We can't fix it for compatibility reasons so just be careful. _DBUS_ERROR_NO_NETWORK: No network access (probably ENETUNREACH on a socket). _DBUS_ERROR_ADDRESS_IN_USE: Can't bind a socket since its address is in use (i.e. EADDRINUSE). _DBUS_ERROR_DISCONNECTED: The connection is disconnected and you're trying to use it. _DBUS_ERROR_INVALID_ARGS: Invalid arguments passed to a method call. _DBUS_ERROR_FILE_NOT_FOUND: Missing file. _DBUS_ERROR_FILE_EXISTS: Existing file and the operation you're using does not silently overwrite. _DBUS_ERROR_UNKNOWN_METHOD: Method name you invoked isn't known by the object you invoked it on. _DBUS_ERROR_UNKNOWN_OBJECT: Object you invoked a method on isn't known. Since 2.42 _DBUS_ERROR_UNKNOWN_INTERFACE: Interface you invoked a method on isn't known by the object. Since 2.42 _DBUS_ERROR_UNKNOWN_PROPERTY: Property you tried to access isn't known by the object. Since 2.42 _DBUS_ERROR_PROPERTY_READ_ONLY: Property you tried to set is read-only. Since 2.42 _DBUS_ERROR_TIMED_OUT: Certain timeout errors, e.g. while starting a service. Warning: this is confusingly-named given that %G_DBUS_ERROR_TIMEOUT also exists. We can't fix it for compatibility reasons so just be careful. _DBUS_ERROR_MATCH_RULE_NOT_FOUND: Tried to remove or modify a match rule that didn't exist. _DBUS_ERROR_MATCH_RULE_INVALID: The match rule isn't syntactically valid. _DBUS_ERROR_SPAWN_EXEC_FAILED: While starting a new process, the exec() call failed. _DBUS_ERROR_SPAWN_FORK_FAILED: While starting a new process, the fork() call failed. _DBUS_ERROR_SPAWN_CHILD_EXITED: While starting a new process, the child exited with a status code. _DBUS_ERROR_SPAWN_CHILD_SIGNALED: While starting a new process, the child exited on a signal. _DBUS_ERROR_SPAWN_FAILED: While starting a new process, something went wrong. _DBUS_ERROR_SPAWN_SETUP_FAILED: We failed to setup the environment correctly. _DBUS_ERROR_SPAWN_CONFIG_INVALID: We failed to setup the config parser correctly. _DBUS_ERROR_SPAWN_SERVICE_INVALID: Bus name was not valid. _DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND: Service file not found in system-services directory. _DBUS_ERROR_SPAWN_PERMISSIONS_INVALID: Permissions are incorrect on the setuid helper. _DBUS_ERROR_SPAWN_FILE_INVALID: Service file invalid (Name, User or Exec missing). _DBUS_ERROR_SPAWN_NO_MEMORY: Tried to get a UNIX process ID and it wasn't available. _DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN: Tried to get a UNIX process ID and it wasn't available. _DBUS_ERROR_INVALID_SIGNATURE: A type signature is not valid. _DBUS_ERROR_INVALID_FILE_CONTENT: A file contains invalid syntax or is otherwise broken. _DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN: Asked for SELinux security context and it wasn't available. _DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN: Asked for ADT audit data and it wasn't available. _DBUS_ERROR_OBJECT_PATH_IN_USE: There's already an object with the requested object path.
*/
opaque type GDBusError = CUnsignedInt
object GDBusError extends _BindgenEnumCUnsignedInt[GDBusError]:
  given _tag: Tag[GDBusError] = Tag.UInt
  inline def define(inline a: Long): GDBusError = a.toUInt
  val G_DBUS_ERROR_FAILED = define(0)
  val G_DBUS_ERROR_NO_MEMORY = define(1)
  val G_DBUS_ERROR_SERVICE_UNKNOWN = define(2)
  val G_DBUS_ERROR_NAME_HAS_NO_OWNER = define(3)
  val G_DBUS_ERROR_NO_REPLY = define(4)
  val G_DBUS_ERROR_IO_ERROR = define(5)
  val G_DBUS_ERROR_BAD_ADDRESS = define(6)
  val G_DBUS_ERROR_NOT_SUPPORTED = define(7)
  val G_DBUS_ERROR_LIMITS_EXCEEDED = define(8)
  val G_DBUS_ERROR_ACCESS_DENIED = define(9)
  val G_DBUS_ERROR_AUTH_FAILED = define(10)
  val G_DBUS_ERROR_NO_SERVER = define(11)
  val G_DBUS_ERROR_TIMEOUT = define(12)
  val G_DBUS_ERROR_NO_NETWORK = define(13)
  val G_DBUS_ERROR_ADDRESS_IN_USE = define(14)
  val G_DBUS_ERROR_DISCONNECTED = define(15)
  val G_DBUS_ERROR_INVALID_ARGS = define(16)
  val G_DBUS_ERROR_FILE_NOT_FOUND = define(17)
  val G_DBUS_ERROR_FILE_EXISTS = define(18)
  val G_DBUS_ERROR_UNKNOWN_METHOD = define(19)
  val G_DBUS_ERROR_TIMED_OUT = define(20)
  val G_DBUS_ERROR_MATCH_RULE_NOT_FOUND = define(21)
  val G_DBUS_ERROR_MATCH_RULE_INVALID = define(22)
  val G_DBUS_ERROR_SPAWN_EXEC_FAILED = define(23)
  val G_DBUS_ERROR_SPAWN_FORK_FAILED = define(24)
  val G_DBUS_ERROR_SPAWN_CHILD_EXITED = define(25)
  val G_DBUS_ERROR_SPAWN_CHILD_SIGNALED = define(26)
  val G_DBUS_ERROR_SPAWN_FAILED = define(27)
  val G_DBUS_ERROR_SPAWN_SETUP_FAILED = define(28)
  val G_DBUS_ERROR_SPAWN_CONFIG_INVALID = define(29)
  val G_DBUS_ERROR_SPAWN_SERVICE_INVALID = define(30)
  val G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND = define(31)
  val G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID = define(32)
  val G_DBUS_ERROR_SPAWN_FILE_INVALID = define(33)
  val G_DBUS_ERROR_SPAWN_NO_MEMORY = define(34)
  val G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN = define(35)
  val G_DBUS_ERROR_INVALID_SIGNATURE = define(36)
  val G_DBUS_ERROR_INVALID_FILE_CONTENT = define(37)
  val G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN = define(38)
  val G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN = define(39)
  val G_DBUS_ERROR_OBJECT_PATH_IN_USE = define(40)
  val G_DBUS_ERROR_UNKNOWN_OBJECT = define(41)
  val G_DBUS_ERROR_UNKNOWN_INTERFACE = define(42)
  val G_DBUS_ERROR_UNKNOWN_PROPERTY = define(43)
  val G_DBUS_ERROR_PROPERTY_READ_ONLY = define(44)
  def getName(value: GDBusError): Option[String] =
    value match
      case `G_DBUS_ERROR_FAILED` => Some("G_DBUS_ERROR_FAILED")
      case `G_DBUS_ERROR_NO_MEMORY` => Some("G_DBUS_ERROR_NO_MEMORY")
      case `G_DBUS_ERROR_SERVICE_UNKNOWN` => Some("G_DBUS_ERROR_SERVICE_UNKNOWN")
      case `G_DBUS_ERROR_NAME_HAS_NO_OWNER` => Some("G_DBUS_ERROR_NAME_HAS_NO_OWNER")
      case `G_DBUS_ERROR_NO_REPLY` => Some("G_DBUS_ERROR_NO_REPLY")
      case `G_DBUS_ERROR_IO_ERROR` => Some("G_DBUS_ERROR_IO_ERROR")
      case `G_DBUS_ERROR_BAD_ADDRESS` => Some("G_DBUS_ERROR_BAD_ADDRESS")
      case `G_DBUS_ERROR_NOT_SUPPORTED` => Some("G_DBUS_ERROR_NOT_SUPPORTED")
      case `G_DBUS_ERROR_LIMITS_EXCEEDED` => Some("G_DBUS_ERROR_LIMITS_EXCEEDED")
      case `G_DBUS_ERROR_ACCESS_DENIED` => Some("G_DBUS_ERROR_ACCESS_DENIED")
      case `G_DBUS_ERROR_AUTH_FAILED` => Some("G_DBUS_ERROR_AUTH_FAILED")
      case `G_DBUS_ERROR_NO_SERVER` => Some("G_DBUS_ERROR_NO_SERVER")
      case `G_DBUS_ERROR_TIMEOUT` => Some("G_DBUS_ERROR_TIMEOUT")
      case `G_DBUS_ERROR_NO_NETWORK` => Some("G_DBUS_ERROR_NO_NETWORK")
      case `G_DBUS_ERROR_ADDRESS_IN_USE` => Some("G_DBUS_ERROR_ADDRESS_IN_USE")
      case `G_DBUS_ERROR_DISCONNECTED` => Some("G_DBUS_ERROR_DISCONNECTED")
      case `G_DBUS_ERROR_INVALID_ARGS` => Some("G_DBUS_ERROR_INVALID_ARGS")
      case `G_DBUS_ERROR_FILE_NOT_FOUND` => Some("G_DBUS_ERROR_FILE_NOT_FOUND")
      case `G_DBUS_ERROR_FILE_EXISTS` => Some("G_DBUS_ERROR_FILE_EXISTS")
      case `G_DBUS_ERROR_UNKNOWN_METHOD` => Some("G_DBUS_ERROR_UNKNOWN_METHOD")
      case `G_DBUS_ERROR_TIMED_OUT` => Some("G_DBUS_ERROR_TIMED_OUT")
      case `G_DBUS_ERROR_MATCH_RULE_NOT_FOUND` => Some("G_DBUS_ERROR_MATCH_RULE_NOT_FOUND")
      case `G_DBUS_ERROR_MATCH_RULE_INVALID` => Some("G_DBUS_ERROR_MATCH_RULE_INVALID")
      case `G_DBUS_ERROR_SPAWN_EXEC_FAILED` => Some("G_DBUS_ERROR_SPAWN_EXEC_FAILED")
      case `G_DBUS_ERROR_SPAWN_FORK_FAILED` => Some("G_DBUS_ERROR_SPAWN_FORK_FAILED")
      case `G_DBUS_ERROR_SPAWN_CHILD_EXITED` => Some("G_DBUS_ERROR_SPAWN_CHILD_EXITED")
      case `G_DBUS_ERROR_SPAWN_CHILD_SIGNALED` => Some("G_DBUS_ERROR_SPAWN_CHILD_SIGNALED")
      case `G_DBUS_ERROR_SPAWN_FAILED` => Some("G_DBUS_ERROR_SPAWN_FAILED")
      case `G_DBUS_ERROR_SPAWN_SETUP_FAILED` => Some("G_DBUS_ERROR_SPAWN_SETUP_FAILED")
      case `G_DBUS_ERROR_SPAWN_CONFIG_INVALID` => Some("G_DBUS_ERROR_SPAWN_CONFIG_INVALID")
      case `G_DBUS_ERROR_SPAWN_SERVICE_INVALID` => Some("G_DBUS_ERROR_SPAWN_SERVICE_INVALID")
      case `G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND` => Some("G_DBUS_ERROR_SPAWN_SERVICE_NOT_FOUND")
      case `G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID` => Some("G_DBUS_ERROR_SPAWN_PERMISSIONS_INVALID")
      case `G_DBUS_ERROR_SPAWN_FILE_INVALID` => Some("G_DBUS_ERROR_SPAWN_FILE_INVALID")
      case `G_DBUS_ERROR_SPAWN_NO_MEMORY` => Some("G_DBUS_ERROR_SPAWN_NO_MEMORY")
      case `G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN` => Some("G_DBUS_ERROR_UNIX_PROCESS_ID_UNKNOWN")
      case `G_DBUS_ERROR_INVALID_SIGNATURE` => Some("G_DBUS_ERROR_INVALID_SIGNATURE")
      case `G_DBUS_ERROR_INVALID_FILE_CONTENT` => Some("G_DBUS_ERROR_INVALID_FILE_CONTENT")
      case `G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN` => Some("G_DBUS_ERROR_SELINUX_SECURITY_CONTEXT_UNKNOWN")
      case `G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN` => Some("G_DBUS_ERROR_ADT_AUDIT_DATA_UNKNOWN")
      case `G_DBUS_ERROR_OBJECT_PATH_IN_USE` => Some("G_DBUS_ERROR_OBJECT_PATH_IN_USE")
      case `G_DBUS_ERROR_UNKNOWN_OBJECT` => Some("G_DBUS_ERROR_UNKNOWN_OBJECT")
      case `G_DBUS_ERROR_UNKNOWN_INTERFACE` => Some("G_DBUS_ERROR_UNKNOWN_INTERFACE")
      case `G_DBUS_ERROR_UNKNOWN_PROPERTY` => Some("G_DBUS_ERROR_UNKNOWN_PROPERTY")
      case `G_DBUS_ERROR_PROPERTY_READ_ONLY` => Some("G_DBUS_ERROR_PROPERTY_READ_ONLY")
      case _ => _root_.scala.None
  extension (a: GDBusError)
    inline def &(b: GDBusError): GDBusError = a & b
    inline def |(b: GDBusError): GDBusError = a | b
    inline def is(b: GDBusError): Boolean = (a & b) == b