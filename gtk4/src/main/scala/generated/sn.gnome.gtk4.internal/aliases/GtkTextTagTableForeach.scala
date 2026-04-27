package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTextTagTableForeach: : the `GtkTextTag`
*/
opaque type GtkTextTagTableForeach = CFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTextTagTableForeach:
  given _tag: Tag[GtkTextTagTableForeach] = Tag.materializeCFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTextTagTableForeach = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTextTagTableForeach = o
  extension (v: GtkTextTagTableForeach)
    inline def value: CFuncPtr2[Ptr[GtkTextTag], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)