package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GApplicationFlags: _APPLICATION_FLAGS_NONE: Default. Deprecated in 2.74, use %G_APPLICATION_DEFAULT_FLAGS instead _APPLICATION_DEFAULT_FLAGS: Default flags. Since: 2.74 _APPLICATION_IS_SERVICE: Run as a service. In this mode, registration fails if the service is already running, and the application will initially wait up to 10 seconds for an initial activation message to arrive. _APPLICATION_IS_LAUNCHER: Don't try to become the primary instance. _APPLICATION_HANDLES_OPEN: This application handles opening files (in the primary instance). Note that this flag only affects the default implementation of local_command_line(), and has no effect if %G_APPLICATION_HANDLES_COMMAND_LINE is given. See g_application_run() for details. _APPLICATION_HANDLES_COMMAND_LINE: This application handles command line arguments (in the primary instance). Note that this flag only affect the default implementation of local_command_line(). See g_application_run() for details. _APPLICATION_SEND_ENVIRONMENT: Send the environment of the launching process to the primary instance. Set this flag if your application is expected to behave differently depending on certain environment variables. For instance, an editor might be expected to use the `GIT_COMMITTER_NAME` environment variable when editing a git commit message. The environment is available to the #GApplication::command-line signal handler, via g_application_command_line_getenv(). _APPLICATION_NON_UNIQUE: Make no attempts to do any of the typical single-instance application negotiation, even if the application ID is given. The application neither attempts to become the owner of the application ID nor does it check if an existing owner already exists. Everything occurs in the local process. Since: 2.30. _APPLICATION_CAN_OVERRIDE_APP_ID: Allow users to override the application ID from the command line with `--gapplication-app-id`. Since: 2.48 _APPLICATION_ALLOW_REPLACEMENT: Allow another instance to take over the bus name. Since: 2.60 _APPLICATION_REPLACE: Take over from another instance. This flag is usually set by passing `--gapplication-replace` on the commandline. Since: 2.60
*/
opaque type GApplicationFlags = CUnsignedInt
object GApplicationFlags extends _BindgenEnumCUnsignedInt[GApplicationFlags]:
  given _tag: Tag[GApplicationFlags] = Tag.UInt
  inline def define(inline a: Long): GApplicationFlags = a.toUInt
  val G_APPLICATION_FLAGS_NONE = define(0)
  val G_APPLICATION_DEFAULT_FLAGS = define(0)
  val G_APPLICATION_IS_SERVICE = define(1)
  val G_APPLICATION_IS_LAUNCHER = define(2)
  val G_APPLICATION_HANDLES_OPEN = define(4)
  val G_APPLICATION_HANDLES_COMMAND_LINE = define(8)
  val G_APPLICATION_SEND_ENVIRONMENT = define(16)
  val G_APPLICATION_NON_UNIQUE = define(32)
  val G_APPLICATION_CAN_OVERRIDE_APP_ID = define(64)
  val G_APPLICATION_ALLOW_REPLACEMENT = define(128)
  val G_APPLICATION_REPLACE = define(256)
  def getName(value: GApplicationFlags): Option[String] =
    value match
      case `G_APPLICATION_FLAGS_NONE` => Some("G_APPLICATION_FLAGS_NONE")
      case `G_APPLICATION_DEFAULT_FLAGS` => Some("G_APPLICATION_DEFAULT_FLAGS")
      case `G_APPLICATION_IS_SERVICE` => Some("G_APPLICATION_IS_SERVICE")
      case `G_APPLICATION_IS_LAUNCHER` => Some("G_APPLICATION_IS_LAUNCHER")
      case `G_APPLICATION_HANDLES_OPEN` => Some("G_APPLICATION_HANDLES_OPEN")
      case `G_APPLICATION_HANDLES_COMMAND_LINE` => Some("G_APPLICATION_HANDLES_COMMAND_LINE")
      case `G_APPLICATION_SEND_ENVIRONMENT` => Some("G_APPLICATION_SEND_ENVIRONMENT")
      case `G_APPLICATION_NON_UNIQUE` => Some("G_APPLICATION_NON_UNIQUE")
      case `G_APPLICATION_CAN_OVERRIDE_APP_ID` => Some("G_APPLICATION_CAN_OVERRIDE_APP_ID")
      case `G_APPLICATION_ALLOW_REPLACEMENT` => Some("G_APPLICATION_ALLOW_REPLACEMENT")
      case `G_APPLICATION_REPLACE` => Some("G_APPLICATION_REPLACE")
      case _ => _root_.scala.None
  extension (a: GApplicationFlags)
    inline def &(b: GApplicationFlags): GApplicationFlags = a & b
    inline def |(b: GApplicationFlags): GApplicationFlags = a | b
    inline def is(b: GApplicationFlags): Boolean = (a & b) == b