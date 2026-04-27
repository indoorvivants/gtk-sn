package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBusNameWatcherFlags: _BUS_NAME_WATCHER_FLAGS_NONE: No flags set. _BUS_NAME_WATCHER_FLAGS_AUTO_START: If no-one owns the name when beginning to watch the name, ask the bus to launch an owner for the name.
*/
opaque type GBusNameWatcherFlags = CUnsignedInt
object GBusNameWatcherFlags extends _BindgenEnumCUnsignedInt[GBusNameWatcherFlags]:
  given _tag: Tag[GBusNameWatcherFlags] = Tag.UInt
  inline def define(inline a: Long): GBusNameWatcherFlags = a.toUInt
  val G_BUS_NAME_WATCHER_FLAGS_NONE = define(0)
  val G_BUS_NAME_WATCHER_FLAGS_AUTO_START = define(1)
  def getName(value: GBusNameWatcherFlags): Option[String] =
    value match
      case `G_BUS_NAME_WATCHER_FLAGS_NONE` => Some("G_BUS_NAME_WATCHER_FLAGS_NONE")
      case `G_BUS_NAME_WATCHER_FLAGS_AUTO_START` => Some("G_BUS_NAME_WATCHER_FLAGS_AUTO_START")
      case _ => _root_.scala.None
  extension (a: GBusNameWatcherFlags)
    inline def &(b: GBusNameWatcherFlags): GBusNameWatcherFlags = a & b
    inline def |(b: GBusNameWatcherFlags): GBusNameWatcherFlags = a | b
    inline def is(b: GBusNameWatcherFlags): Boolean = (a & b) == b