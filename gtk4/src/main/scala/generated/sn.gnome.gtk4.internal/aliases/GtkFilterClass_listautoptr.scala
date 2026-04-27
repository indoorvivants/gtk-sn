package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFilterClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkFilterClass_listautoptr:
  given _tag: Tag[GtkFilterClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkFilterClass_listautoptr = o
  extension (v: GtkFilterClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v