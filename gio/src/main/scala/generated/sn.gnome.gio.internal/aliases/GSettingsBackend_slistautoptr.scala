package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSettingsBackend_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GSettingsBackend_slistautoptr:
  given _tag: Tag[GSettingsBackend_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GSettingsBackend_slistautoptr = o
  extension (v: GSettingsBackend_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v