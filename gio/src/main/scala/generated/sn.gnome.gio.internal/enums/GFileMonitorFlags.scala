package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileMonitorFlags: _FILE_MONITOR_NONE: No flags set. _FILE_MONITOR_WATCH_MOUNTS: Watch for mount events. _FILE_MONITOR_SEND_MOVED: Pair DELETED and CREATED events caused by file renames (moves) and send a single G_FILE_MONITOR_EVENT_MOVED event instead (NB: not supported on all backends; the default behaviour -without specifying this flag- is to send single DELETED and CREATED events). Deprecated since 2.46: use %G_FILE_MONITOR_WATCH_MOVES instead. _FILE_MONITOR_WATCH_HARD_LINKS: Watch for changes to the file made via another hard link. Since 2.36. _FILE_MONITOR_WATCH_MOVES: Watch for rename operations on a monitored directory. This causes %G_FILE_MONITOR_EVENT_RENAMED, %G_FILE_MONITOR_EVENT_MOVED_IN and %G_FILE_MONITOR_EVENT_MOVED_OUT events to be emitted when possible. Since: 2.46.
*/
opaque type GFileMonitorFlags = CUnsignedInt
object GFileMonitorFlags extends _BindgenEnumCUnsignedInt[GFileMonitorFlags]:
  given _tag: Tag[GFileMonitorFlags] = Tag.UInt
  inline def define(inline a: Long): GFileMonitorFlags = a.toUInt
  val G_FILE_MONITOR_NONE = define(0)
  val G_FILE_MONITOR_WATCH_MOUNTS = define(1)
  val G_FILE_MONITOR_SEND_MOVED = define(2)
  val G_FILE_MONITOR_WATCH_HARD_LINKS = define(4)
  val G_FILE_MONITOR_WATCH_MOVES = define(8)
  def getName(value: GFileMonitorFlags): Option[String] =
    value match
      case `G_FILE_MONITOR_NONE` => Some("G_FILE_MONITOR_NONE")
      case `G_FILE_MONITOR_WATCH_MOUNTS` => Some("G_FILE_MONITOR_WATCH_MOUNTS")
      case `G_FILE_MONITOR_SEND_MOVED` => Some("G_FILE_MONITOR_SEND_MOVED")
      case `G_FILE_MONITOR_WATCH_HARD_LINKS` => Some("G_FILE_MONITOR_WATCH_HARD_LINKS")
      case `G_FILE_MONITOR_WATCH_MOVES` => Some("G_FILE_MONITOR_WATCH_MOVES")
      case _ => _root_.scala.None
  extension (a: GFileMonitorFlags)
    inline def &(b: GFileMonitorFlags): GFileMonitorFlags = a & b
    inline def |(b: GFileMonitorFlags): GFileMonitorFlags = a | b
    inline def is(b: GFileMonitorFlags): Boolean = (a & b) == b