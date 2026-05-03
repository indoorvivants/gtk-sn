package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixSocketAddress_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GUnixSocketAddress_slistautoptr:
  given _tag: Tag[GUnixSocketAddress_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GUnixSocketAddress_slistautoptr = o
  extension (v: GUnixSocketAddress_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v