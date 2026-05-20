package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileMonitorFlags

/** Flags used to set what a #GFileMonitor will watch for.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileMonitorFlags private (val raw: GFileMonitorFlags):
  def is(kv: FileMonitorFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[FileMonitorFlags.KnownValue]
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

  /** Flags used to set what a #GFileMonitor will watch for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GFileMonitorFlags,
      name: scala.Predef.String
  ) extends FileMonitorFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** No flags set.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE extends KnownValue(GFileMonitorFlags.G_FILE_MONITOR_NONE, "NONE")

    /** Watch for mount events.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WATCH_MOUNTS
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_WATCH_MOUNTS,
          "WATCH_MOUNTS"
        )

    /** Pair DELETED and CREATED events caused by file renames (moves) and send
      * a single G_FILE_MONITOR_EVENT_MOVED event instead (NB: not supported on
      * all backends; the default behaviour -without specifying this flag- is to
      * send single DELETED and CREATED events). Deprecated since 2.46: use
      * %G_FILE_MONITOR_WATCH_MOVES instead.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SEND_MOVED
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_SEND_MOVED,
          "SEND_MOVED"
        )

    /** Watch for changes to the file made via another hard link. Since 2.36.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WATCH_HARD_LINKS
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_WATCH_HARD_LINKS,
          "WATCH_HARD_LINKS"
        )

    /** Watch for rename operations on a monitored directory. This causes
      * %G_FILE_MONITOR_EVENT_RENAMED, %G_FILE_MONITOR_EVENT_MOVED_IN and
      * %G_FILE_MONITOR_EVENT_MOVED_OUT events to be emitted when possible.
      * Since: 2.46.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case WATCH_MOVES
        extends KnownValue(
          GFileMonitorFlags.G_FILE_MONITOR_WATCH_MOVES,
          "WATCH_MOVES"
        )
  end KnownValue
end FileMonitorFlags
