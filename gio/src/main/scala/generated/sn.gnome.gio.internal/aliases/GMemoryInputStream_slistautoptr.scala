package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemoryInputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GMemoryInputStream_slistautoptr:
  given _tag: Tag[GMemoryInputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GMemoryInputStream_slistautoptr = o
  extension (v: GMemoryInputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v