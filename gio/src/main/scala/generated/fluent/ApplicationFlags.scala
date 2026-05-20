package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GApplicationFlags

/** Flags used to define the behaviour of a #GApplication.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ApplicationFlags private (val raw: GApplicationFlags):
  def is(kv: ApplicationFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[ApplicationFlags.KnownValue]
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

  /** Flags used to define the behaviour of a #GApplication.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GApplicationFlags,
      name: scala.Predef.String
  ) extends ApplicationFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** Default. Deprecated in 2.74, use %G_APPLICATION_DEFAULT_FLAGS instead
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLAGS_NONE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_FLAGS_NONE,
          "FLAGS_NONE"
        )

    /** Default flags. Since: 2.74
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DEFAULT_FLAGS
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_DEFAULT_FLAGS,
          "DEFAULT_FLAGS"
        )

    /** Run as a service. In this mode, registration fails if the service is
      * already running, and the application will initially wait up to 10
      * seconds for an initial activation message to arrive.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_SERVICE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_IS_SERVICE,
          "IS_SERVICE"
        )

    /** Don't try to become the primary instance.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case IS_LAUNCHER
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_IS_LAUNCHER,
          "IS_LAUNCHER"
        )

    /** This application handles opening files (in the primary instance). Note
      * that this flag only affects the default implementation of
      * local_command_line(), and has no effect if
      * %G_APPLICATION_HANDLES_COMMAND_LINE is given. See g_application_run()
      * for details.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HANDLES_OPEN
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_HANDLES_OPEN,
          "HANDLES_OPEN"
        )

    /** This application handles command line arguments (in the primary
      * instance). Note that this flag only affect the default implementation of
      * local_command_line(). See g_application_run() for details.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HANDLES_COMMAND_LINE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_HANDLES_COMMAND_LINE,
          "HANDLES_COMMAND_LINE"
        )

    /** Send the environment of the launching process to the primary instance.
      * Set this flag if your application is expected to behave differently
      * depending on certain environment variables. For instance, an editor
      * might be expected to use the `GIT_COMMITTER_NAME` environment variable
      * when editing a git commit message. The environment is available to the
      * #GApplication::command-line signal handler, via
      * g_application_command_line_getenv().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SEND_ENVIRONMENT
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_SEND_ENVIRONMENT,
          "SEND_ENVIRONMENT"
        )

    /** Make no attempts to do any of the typical single-instance application
      * negotiation, even if the application ID is given. The application
      * neither attempts to become the owner of the application ID nor does it
      * check if an existing owner already exists. Everything occurs in the
      * local process. Since: 2.30.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NON_UNIQUE
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_NON_UNIQUE,
          "NON_UNIQUE"
        )

    /** Allow users to override the application ID from the command line with
      * `--gapplication-app-id`. Since: 2.48
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CAN_OVERRIDE_APP_ID
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_CAN_OVERRIDE_APP_ID,
          "CAN_OVERRIDE_APP_ID"
        )

    /** Allow another instance to take over the bus name. Since: 2.60
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ALLOW_REPLACEMENT
        extends KnownValue(
          GApplicationFlags.G_APPLICATION_ALLOW_REPLACEMENT,
          "ALLOW_REPLACEMENT"
        )

    /** Take over from another instance. This flag is usually set by passing
      * `--gapplication-replace` on the commandline. Since: 2.60
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case REPLACE
        extends KnownValue(GApplicationFlags.G_APPLICATION_REPLACE, "REPLACE")
  end KnownValue
end ApplicationFlags
