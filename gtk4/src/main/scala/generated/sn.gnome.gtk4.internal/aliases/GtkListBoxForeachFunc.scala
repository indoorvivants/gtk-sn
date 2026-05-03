package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListBoxForeachFunc = CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkListBoxForeachFunc:
  given _tag: Tag[GtkListBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkListBoxForeachFunc = o
  extension (v: GtkListBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkListBox], Ptr[GtkListBoxRow], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)