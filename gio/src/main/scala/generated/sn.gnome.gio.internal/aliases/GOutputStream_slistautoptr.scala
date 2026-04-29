package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOutputStream_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GOutputStream_slistautoptr:
  given _tag: Tag[GOutputStream_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GOutputStream_slistautoptr = o
  extension (v: GOutputStream_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v