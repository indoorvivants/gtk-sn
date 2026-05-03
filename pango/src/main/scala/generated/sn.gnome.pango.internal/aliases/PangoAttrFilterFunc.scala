package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrFilterFunc: : a Pango attribute _data: user data passed to the function
*/
opaque type PangoAttrFilterFunc = CFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object PangoAttrFilterFunc:
  given _tag: Tag[PangoAttrFilterFunc] = Tag.materializeCFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PangoAttrFilterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): PangoAttrFilterFunc = o
  extension (v: PangoAttrFilterFunc)
    inline def value: CFuncPtr2[Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)