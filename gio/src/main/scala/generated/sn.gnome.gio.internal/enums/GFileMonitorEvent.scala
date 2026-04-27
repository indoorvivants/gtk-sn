package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileMonitorEvent: _FILE_MONITOR_EVENT_CHANGED: a file changed. _FILE_MONITOR_EVENT_CHANGES_DONE_HINT: a hint that this was probably the last change in a set of changes. _FILE_MONITOR_EVENT_DELETED: a file was deleted. _FILE_MONITOR_EVENT_CREATED: a file was created. _FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED: a file attribute was changed. _FILE_MONITOR_EVENT_PRE_UNMOUNT: the file location will soon be unmounted. _FILE_MONITOR_EVENT_UNMOUNTED: the file location was unmounted. _FILE_MONITOR_EVENT_MOVED: the file was moved -- only sent if the (deprecated) %G_FILE_MONITOR_SEND_MOVED flag is set _FILE_MONITOR_EVENT_RENAMED: the file was renamed within the current directory -- only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46. _FILE_MONITOR_EVENT_MOVED_IN: the file was moved into the monitored directory from another location -- only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46. _FILE_MONITOR_EVENT_MOVED_OUT: the file was moved out of the monitored directory to another location -- only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46
*/
opaque type GFileMonitorEvent = CUnsignedInt
object GFileMonitorEvent extends _BindgenEnumCUnsignedInt[GFileMonitorEvent]:
  given _tag: Tag[GFileMonitorEvent] = Tag.UInt
  inline def define(inline a: Long): GFileMonitorEvent = a.toUInt
  val G_FILE_MONITOR_EVENT_CHANGED = define(0)
  val G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT = define(1)
  val G_FILE_MONITOR_EVENT_DELETED = define(2)
  val G_FILE_MONITOR_EVENT_CREATED = define(3)
  val G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED = define(4)
  val G_FILE_MONITOR_EVENT_PRE_UNMOUNT = define(5)
  val G_FILE_MONITOR_EVENT_UNMOUNTED = define(6)
  val G_FILE_MONITOR_EVENT_MOVED = define(7)
  val G_FILE_MONITOR_EVENT_RENAMED = define(8)
  val G_FILE_MONITOR_EVENT_MOVED_IN = define(9)
  val G_FILE_MONITOR_EVENT_MOVED_OUT = define(10)
  def getName(value: GFileMonitorEvent): Option[String] =
    value match
      case `G_FILE_MONITOR_EVENT_CHANGED` => Some("G_FILE_MONITOR_EVENT_CHANGED")
      case `G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT` => Some("G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT")
      case `G_FILE_MONITOR_EVENT_DELETED` => Some("G_FILE_MONITOR_EVENT_DELETED")
      case `G_FILE_MONITOR_EVENT_CREATED` => Some("G_FILE_MONITOR_EVENT_CREATED")
      case `G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED` => Some("G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED")
      case `G_FILE_MONITOR_EVENT_PRE_UNMOUNT` => Some("G_FILE_MONITOR_EVENT_PRE_UNMOUNT")
      case `G_FILE_MONITOR_EVENT_UNMOUNTED` => Some("G_FILE_MONITOR_EVENT_UNMOUNTED")
      case `G_FILE_MONITOR_EVENT_MOVED` => Some("G_FILE_MONITOR_EVENT_MOVED")
      case `G_FILE_MONITOR_EVENT_RENAMED` => Some("G_FILE_MONITOR_EVENT_RENAMED")
      case `G_FILE_MONITOR_EVENT_MOVED_IN` => Some("G_FILE_MONITOR_EVENT_MOVED_IN")
      case `G_FILE_MONITOR_EVENT_MOVED_OUT` => Some("G_FILE_MONITOR_EVENT_MOVED_OUT")
      case _ => _root_.scala.None
  extension (a: GFileMonitorEvent)
    inline def &(b: GFileMonitorEvent): GFileMonitorEvent = a & b
    inline def |(b: GFileMonitorEvent): GFileMonitorEvent = a | b
    inline def is(b: GFileMonitorEvent): Boolean = (a & b) == b