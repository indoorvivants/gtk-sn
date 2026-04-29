package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNetworkMonitor_autoptr = Ptr[GNetworkMonitor]
object GNetworkMonitor_autoptr:
  given _tag: Tag[GNetworkMonitor_autoptr] = Tag.Ptr[GNetworkMonitor](GNetworkMonitor._tag)
  inline def apply(inline o: Ptr[GNetworkMonitor]): GNetworkMonitor_autoptr = o
  extension (v: GNetworkMonitor_autoptr)
    inline def value: Ptr[GNetworkMonitor] = v