package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GLogLevelFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags specifying the level of log messages.
  *
  * It is possible to change how GLib treats messages of the various levels
  * using g_log_set_handler() and g_log_set_fatal_mask().
  */
class LogLevelFlags private (val raw: GLogLevelFlags):
  def is(kv: LogLevelFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[LogLevelFlags.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags specifying the level of log messages.
    *
    * It is possible to change how GLib treats messages of the various levels
    * using g_log_set_handler() and g_log_set_fatal_mask().
    */
  enum KnownValue(override val raw: GLogLevelFlags, name: String)
      extends LogLevelFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * internal flag
      */
    case FLAG_RECURSION
        extends KnownValue(
          GLogLevelFlags.G_LOG_FLAG_RECURSION,
          "FLAG_RECURSION"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * internal flag
      */
    case FLAG_FATAL
        extends KnownValue(GLogLevelFlags.G_LOG_FLAG_FATAL, "FLAG_FATAL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * log level for errors, see g_error(). This level is also used for
      * messages produced by g_assert().
      */
    case LEVEL_ERROR
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_ERROR, "LEVEL_ERROR")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * log level for critical warning messages, see g_critical(). This level is
      * also used for messages produced by g_return_if_fail() and
      * g_return_val_if_fail().
      */
    case LEVEL_CRITICAL
        extends KnownValue(
          GLogLevelFlags.G_LOG_LEVEL_CRITICAL,
          "LEVEL_CRITICAL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * log level for warnings, see g_warning()
      */
    case LEVEL_WARNING
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_WARNING, "LEVEL_WARNING")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * log level for messages, see g_message()
      */
    case LEVEL_MESSAGE
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_MESSAGE, "LEVEL_MESSAGE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * log level for informational messages, see g_info()
      */
    case LEVEL_INFO
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_INFO, "LEVEL_INFO")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * log level for debug messages, see g_debug()
      */
    case LEVEL_DEBUG
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_DEBUG, "LEVEL_DEBUG")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * a mask including all log levels
      */
    case LEVEL_MASK
        extends KnownValue(GLogLevelFlags.G_LOG_LEVEL_MASK, "LEVEL_MASK")
  end KnownValue
end LogLevelFlags
