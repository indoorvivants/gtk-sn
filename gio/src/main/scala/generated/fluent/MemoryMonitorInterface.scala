package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMemoryMonitorInterface

/** The virtual function table for #GMemoryMonitor.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MemoryMonitorInterface private[gnome] (raw: Ptr[GMemoryMonitorInterface]):

  def getUnsafeRawPointer(): Ptr[GMemoryMonitorInterface] = this.raw

  @annotation.compileTimeOnly(
    "[field low_memory_warning]: Field is missing <type>"
  )
  private def lowMemoryWarning__ = ???
end MemoryMonitorInterface

object MemoryMonitorInterface:
  def fromRaw(ptr: Ptr[GMemoryMonitorInterface]): MemoryMonitorInterface =
    new MemoryMonitorInterface(ptr)
end MemoryMonitorInterface
