package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAppChooserWidget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkAppChooserWidget_slistautoptr:
  given _tag: Tag[GtkAppChooserWidget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkAppChooserWidget_slistautoptr = o
  extension (v: GtkAppChooserWidget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v