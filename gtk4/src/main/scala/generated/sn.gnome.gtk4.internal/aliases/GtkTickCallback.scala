package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTickCallback: : the widget _clock: the frame clock for the widget (same as calling gtk_widget_get_frame_clock()) _data: user data passed to gtk_widget_add_tick_callback().
*/
opaque type GtkTickCallback = CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GtkTickCallback:
  given _tag: Tag[GtkTickCallback] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTickCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GtkTickCallback = o
  extension (v: GtkTickCallback)
    inline def value: CFuncPtr3[Ptr[GtkWidget], Ptr[_root_.sn.gnome.gdk4.internal.GdkFrameClock], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)