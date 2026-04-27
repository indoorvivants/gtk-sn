package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSettings_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettings_slistautoptr:
  given _tag: Tag[GSettings_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettings_slistautoptr = o
  extension (v: GSettings_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v