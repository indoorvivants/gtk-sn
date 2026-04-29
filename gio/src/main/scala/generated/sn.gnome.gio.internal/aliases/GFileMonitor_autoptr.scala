package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileMonitor_autoptr = Ptr[GFileMonitor]
object GFileMonitor_autoptr:
  given _tag: Tag[GFileMonitor_autoptr] = Tag.Ptr[GFileMonitor](GFileMonitor._tag)
  inline def apply(inline o: Ptr[GFileMonitor]): GFileMonitor_autoptr = o
  extension (v: GFileMonitor_autoptr)
    inline def value: Ptr[GFileMonitor] = v