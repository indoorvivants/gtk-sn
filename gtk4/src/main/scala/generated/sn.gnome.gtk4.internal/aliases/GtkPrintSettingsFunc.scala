package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPrintSettingsFunc = CFuncPtr3[CString, CString, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkPrintSettingsFunc:
  given _tag: Tag[GtkPrintSettingsFunc] = Tag.materializeCFuncPtr3[CString, CString, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkPrintSettingsFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[CString, CString, _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkPrintSettingsFunc = o
  extension (v: GtkPrintSettingsFunc)
    inline def value: CFuncPtr3[CString, CString, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)