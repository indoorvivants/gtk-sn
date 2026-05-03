package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFlowBoxForeachFunc = CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkFlowBoxForeachFunc:
  given _tag: Tag[GtkFlowBoxForeachFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkFlowBoxForeachFunc = o
  extension (v: GtkFlowBoxForeachFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBox], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)