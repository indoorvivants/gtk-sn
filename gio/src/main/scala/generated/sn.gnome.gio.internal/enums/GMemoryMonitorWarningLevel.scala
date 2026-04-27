package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMemoryMonitorWarningLevel: _MEMORY_MONITOR_WARNING_LEVEL_LOW: Memory on the device is low, processes should free up unneeded resources (for example, in-memory caches) so they can be used elsewhere. _MEMORY_MONITOR_WARNING_LEVEL_MEDIUM: Same as _MEMORY_MONITOR_WARNING_LEVEL_LOW but the device has even less free memory, so processes should try harder to free up unneeded resources. If your process does not need to stay running, it is a good time for it to quit. _MEMORY_MONITOR_WARNING_LEVEL_CRITICAL: The system will soon start terminating processes to reclaim memory, including background processes.
*/
opaque type GMemoryMonitorWarningLevel = CUnsignedInt
object GMemoryMonitorWarningLevel extends _BindgenEnumCUnsignedInt[GMemoryMonitorWarningLevel]:
  given _tag: Tag[GMemoryMonitorWarningLevel] = Tag.UInt
  inline def define(inline a: Long): GMemoryMonitorWarningLevel = a.toUInt
  val G_MEMORY_MONITOR_WARNING_LEVEL_LOW = define(50)
  val G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM = define(100)
  val G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL = define(255)
  def getName(value: GMemoryMonitorWarningLevel): Option[String] =
    value match
      case `G_MEMORY_MONITOR_WARNING_LEVEL_LOW` => Some("G_MEMORY_MONITOR_WARNING_LEVEL_LOW")
      case `G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM` => Some("G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM")
      case `G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL` => Some("G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL")
      case _ => _root_.scala.None
  extension (a: GMemoryMonitorWarningLevel)
    inline def &(b: GMemoryMonitorWarningLevel): GMemoryMonitorWarningLevel = a & b
    inline def |(b: GMemoryMonitorWarningLevel): GMemoryMonitorWarningLevel = a | b
    inline def is(b: GMemoryMonitorWarningLevel): Boolean = (a & b) == b