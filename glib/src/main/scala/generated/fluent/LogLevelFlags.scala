package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GLogLevelFlags

/** Flags specifying the level of log messages.
  *
  * It is possible to change how GLib treats messages of the various levels
  * using g_log_set_handler() and g_log_set_fatal_mask().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LogLevelFlags private (val raw: GLogLevelFlags):
  def is(kv: LogLevelFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[LogLevelFlags.KnownValue]
    LogLevelFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"LogLevelFlags(${sb.result().mkString(", ")})"
end LogLevelFlags

object LogLevelFlags:
  export KnownValue.*

  def fromRaw(raw: GLogLevelFlags) = new LogLevelFlags(raw)

  extension (af: LogLevelFlags)
    def &(other: LogLevelFlags) =
      LogLevelFlags(af.raw & other.raw)
    def |(other: LogLevelFlags) =
      LogLevelFlags(af.raw | other.raw)

  /** Flags specifying the level of log messages.
    *
    * It is possible to change how GLib treats messages of the various levels
    * using g_log_set_handler() and g_log_set_fatal_mask().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GLogLevelFlags, name: scala.Predef.String)
      extends LogLevelFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** internal flag
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLAG_RECURSION
        extends KnownValue(
          GLogLevelFlags.G_LOG_FLAG_RECURSION,
          "FLAG_RECURSION"
        )

    /** internal flag
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLAG_FATAL
        extends KnownValue(GLogLevelFlags.G_LOG_FLAG_FATAL, "FLAG_FATAL")

    /** log level for errors, see g_error(). This level is also used for
      * messages produced by g_assert().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_ERROR
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_ERROR, "LEVEL_ERROR")

    /** log level for critical warning messages, see g_critical(). This level is
      * also used for messages produced by g_return_if_fail() and
      * g_return_val_if_fail().
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_CRITICAL
        extends KnownValue(
          GLogLevelFlags.G_LOG_LEVEL_CRITICAL,
          "LEVEL_CRITICAL"
        )

    /** log level for warnings, see g_warning()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_WARNING
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_WARNING, "LEVEL_WARNING")

    /** log level for messages, see g_message()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_MESSAGE
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_MESSAGE, "LEVEL_MESSAGE")

    /** log level for informational messages, see g_info()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_INFO
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_INFO, "LEVEL_INFO")

    /** log level for debug messages, see g_debug()
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_DEBUG
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_DEBUG, "LEVEL_DEBUG")

    /** a mask including all log levels
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEVEL_MASK
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_MASK, "LEVEL_MASK")
  end KnownValue
end LogLevelFlags
