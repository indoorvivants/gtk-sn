package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAssistantPageFunc: _page: The page number used to calculate the next page.
*/
opaque type GtkAssistantPageFunc = CFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt]
object GtkAssistantPageFunc:
  given _tag: Tag[GtkAssistantPageFunc] = Tag.materializeCFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkAssistantPageFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt]): GtkAssistantPageFunc = o
  extension (v: GtkAssistantPageFunc)
    inline def value: CFuncPtr2[CInt, _root_.sn.gnome.glib.internal.gpointer, CInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)