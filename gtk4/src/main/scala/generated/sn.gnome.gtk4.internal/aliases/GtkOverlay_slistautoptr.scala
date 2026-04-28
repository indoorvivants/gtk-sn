package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOverlay_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkOverlay_slistautoptr:
  given _tag: Tag[GtkOverlay_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkOverlay_slistautoptr = o
  extension (v: GtkOverlay_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v