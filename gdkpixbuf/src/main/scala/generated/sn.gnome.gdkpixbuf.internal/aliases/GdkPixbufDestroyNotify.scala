package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkPixbufDestroyNotify: : (array) (element-type guint8): The pixel array of the pixbuf that is being finalized.
*/
opaque type GdkPixbufDestroyNotify = CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GdkPixbufDestroyNotify:
  given _tag: Tag[GdkPixbufDestroyNotify] = Tag.materializeCFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GdkPixbufDestroyNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GdkPixbufDestroyNotify = o
  extension (v: GdkPixbufDestroyNotify)
    inline def value: CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)