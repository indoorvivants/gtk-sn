package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemoryMonitor_autoptr = Ptr[GMemoryMonitor]
object GMemoryMonitor_autoptr:
  given _tag: Tag[GMemoryMonitor_autoptr] = Tag.Ptr[GMemoryMonitor](GMemoryMonitor._tag)
  inline def apply(inline o: Ptr[GMemoryMonitor]): GMemoryMonitor_autoptr = o
  extension (v: GMemoryMonitor_autoptr)
    inline def value: Ptr[GMemoryMonitor] = v