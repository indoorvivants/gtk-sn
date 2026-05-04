package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileMonitorFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags used to set what a #GFileMonitor will watch for.
  */
class FileMonitorFlags private (val raw: GFileMonitorFlags):
  def is(kv: FileMonitorFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FileMonitorFlags.KnownValue]
    FileMonitorFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FileMonitorFlags(${sb.result().mkString(", ")})"
end FileMonitorFlags

object FileMonitorFlags:
  export KnownValue.*

  def fromRaw(raw: GFileMonitorFlags) = new FileMonitorFlags(raw)

  extension (af: FileMonitorFlags)
    def &(other: FileMonitorFlags) =
      FileMonitorFlags(af.raw & other.raw)
    def |(other: FileMonitorFlags) =
      FileMonitorFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Flags used to set what a #GFileMonitor will watch for.
    */
  enum KnownValue(override val raw: GFileMonitorFlags, name: String)
      extends FileMonitorFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * No flags set.
      */
    case NONE extends KnownValue(GFileMonitorFlags.G_FILE_MONITOR_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Watch for mount events.
      */
    case WATCH_MOUNTS
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_WATCH_MOUNTS,
          "WATCH_MOUNTS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Pair DELETED and CREATED events caused by file renames (moves) and send
      * a single G_FILE_MONITOR_EVENT_MOVED event instead (NB: not supported on
      * all backends; the default behaviour -without specifying this flag- is to
      * send single DELETED and CREATED events). Deprecated since 2.46: use
      * %G_FILE_MONITOR_WATCH_MOVES instead.
      */
    case SEND_MOVED
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_SEND_MOVED,
          "SEND_MOVED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Watch for changes to the file made via another hard link. Since 2.36.
      */
    case WATCH_HARD_LINKS
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_WATCH_HARD_LINKS,
          "WATCH_HARD_LINKS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Watch for rename operations on a monitored directory. This causes
      * %G_FILE_MONITOR_EVENT_RENAMED, %G_FILE_MONITOR_EVENT_MOVED_IN and
      * %G_FILE_MONITOR_EVENT_MOVED_OUT events to be emitted when possible.
      * Since: 2.46.
      */
    case WATCH_MOVES
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_WATCH_MOVES,
          "WATCH_MOVES"
        )
  end KnownValue
end FileMonitorFlags
