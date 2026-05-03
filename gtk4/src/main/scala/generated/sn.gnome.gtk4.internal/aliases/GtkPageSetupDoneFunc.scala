package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPageSetupDoneFunc: gtk_print_run_page_setup_dialog_async()
*/
opaque type GtkPageSetupDoneFunc = CFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkPageSetupDoneFunc:
  given _tag: Tag[GtkPageSetupDoneFunc] = Tag.materializeCFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkPageSetupDoneFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkPageSetupDoneFunc = o
  extension (v: GtkPageSetupDoneFunc)
    inline def value: CFuncPtr2[Ptr[GtkPageSetup], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)