package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GApplicationFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used to define the behaviour of a #GApplication.
  */
class ApplicationFlags private (val raw: GApplicationFlags):
  def is(kv: ApplicationFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ApplicationFlags.KnownValue]
    ApplicationFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ApplicationFlags(${sb.result().mkString(", ")})"
end ApplicationFlags

object ApplicationFlags:
  export KnownValue.*

  def fromRaw(raw: GApplicationFlags) = new ApplicationFlags(raw)

  extension (af: ApplicationFlags)
    def &(other: ApplicationFlags) =
      ApplicationFlags(af.raw & other.raw)
    def |(other: ApplicationFlags) =
      ApplicationFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used to define the behaviour of a #GApplication.
    */
  enum KnownValue(override val raw: GApplicationFlags, name: String)
      extends ApplicationFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default. Deprecated in 2.74, use %G_APPLICATION_DEFAULT_FLAGS instead
      */
    case FLAGS_NONE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_FLAGS_NONE,
          "FLAGS_NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Default flags. Since: 2.74
      */
    case DEFAULT_FLAGS
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_DEFAULT_FLAGS,
          "DEFAULT_FLAGS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Run as a service. In this mode, registration fails if the service is
      * already running, and the application will initially wait up to 10
      * seconds for an initial activation message to arrive.
      */
    case IS_SERVICE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_IS_SERVICE,
          "IS_SERVICE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't try to become the primary instance.
      */
    case IS_LAUNCHER
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_IS_LAUNCHER,
          "IS_LAUNCHER"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * This application handles opening files (in the primary instance). Note
      * that this flag only affects the default implementation of
      * local_command_line(), and has no effect if
      * %G_APPLICATION_HANDLES_COMMAND_LINE is given. See g_application_run()
      * for details.
      */
    case HANDLES_OPEN
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_HANDLES_OPEN,
          "HANDLES_OPEN"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * This application handles command line arguments (in the primary
      * instance). Note that this flag only affect the default implementation of
      * local_command_line(). See g_application_run() for details.
      */
    case HANDLES_COMMAND_LINE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_HANDLES_COMMAND_LINE,
          "HANDLES_COMMAND_LINE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Send the environment of the launching process to the primary instance.
      * Set this flag if your application is expected to behave differently
      * depending on certain environment variables. For instance, an editor
      * might be expected to use the `GIT_COMMITTER_NAME` environment variable
      * when editing a git commit message. The environment is available to the
      * #GApplication::command-line signal handler, via
      * g_application_command_line_getenv().
      */
    case SEND_ENVIRONMENT
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_SEND_ENVIRONMENT,
          "SEND_ENVIRONMENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Make no attempts to do any of the typical single-instance application
      * negotiation, even if the application ID is given. The application
      * neither attempts to become the owner of the application ID nor does it
      * check if an existing owner already exists. Everything occurs in the
      * local process. Since: 2.30.
      */
    case NON_UNIQUE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_NON_UNIQUE,
          "NON_UNIQUE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow users to override the application ID from the command line with
      * `--gapplication-app-id`. Since: 2.48
      */
    case CAN_OVERRIDE_APP_ID
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_CAN_OVERRIDE_APP_ID,
          "CAN_OVERRIDE_APP_ID"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Allow another instance to take over the bus name. Since: 2.60
      */
    case ALLOW_REPLACEMENT
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_ALLOW_REPLACEMENT,
          "ALLOW_REPLACEMENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Take over from another instance. This flag is usually set by passing
      * `--gapplication-replace` on the commandline. Since: 2.60
      */
    case REPLACE
        extends KnownValue(GApplicationFlags.G_APPLICATION_REPLACE, "REPLACE")
  end KnownValue
end ApplicationFlags
