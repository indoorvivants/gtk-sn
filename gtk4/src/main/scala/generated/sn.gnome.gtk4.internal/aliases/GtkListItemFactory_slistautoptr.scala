package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListItemFactory_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListItemFactory_slistautoptr:
  given _tag: Tag[GtkListItemFactory_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListItemFactory_slistautoptr = o
  extension (v: GtkListItemFactory_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v