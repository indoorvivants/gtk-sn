package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFlowBoxSortFunc = CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkFlowBoxSortFunc:
  given _tag: Tag[GtkFlowBoxSortFunc] = Tag.materializeCFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxSortFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkFlowBoxSortFunc = o
  extension (v: GtkFlowBoxSortFunc)
    inline def value: CFuncPtr3[Ptr[GtkFlowBoxChild], Ptr[GtkFlowBoxChild], _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)