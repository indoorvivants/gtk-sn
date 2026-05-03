package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkDrawingAreaDrawFunc: _area: the `GtkDrawingArea` to redraw : the context to draw to : the actual width of the contents. This value will be at least as wide as GtkDrawingArea:width. : the actual height of the contents. This value will be at least as wide as GtkDrawingArea:height. _data: (closure): user data
*/
opaque type GtkDrawingAreaDrawFunc = CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkDrawingAreaDrawFunc:
  given _tag: Tag[GtkDrawingAreaDrawFunc] = Tag.materializeCFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkDrawingAreaDrawFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkDrawingAreaDrawFunc = o
  extension (v: GtkDrawingAreaDrawFunc)
    inline def value: CFuncPtr5[Ptr[GtkDrawingArea], Ptr[_root_.sn.gnome.cairo.internal.cairo_t], CInt, CInt, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)