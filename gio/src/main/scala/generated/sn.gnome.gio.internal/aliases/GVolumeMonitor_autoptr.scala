package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVolumeMonitor_autoptr = Ptr[GVolumeMonitor]
object GVolumeMonitor_autoptr:
  given _tag: Tag[GVolumeMonitor_autoptr] = Tag.Ptr[GVolumeMonitor](GVolumeMonitor._tag)
  inline def apply(inline o: Ptr[GVolumeMonitor]): GVolumeMonitor_autoptr = o
  extension (v: GVolumeMonitor_autoptr)
    inline def value: Ptr[GVolumeMonitor] = v