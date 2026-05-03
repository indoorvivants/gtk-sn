package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileMeasureProgressCallback: : %TRUE if more reports will come _size: the current cumulative size measurement
*/
opaque type GFileMeasureProgressCallback = CFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GFileMeasureProgressCallback:
  given _tag: Tag[GFileMeasureProgressCallback] = Tag.materializeCFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GFileMeasureProgressCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit]): GFileMeasureProgressCallback = o
  extension (v: GFileMeasureProgressCallback)
    inline def value: CFuncPtr5[_root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.guint64, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)