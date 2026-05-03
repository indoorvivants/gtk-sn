package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTranslateFunc: : the untranslated string
*/
opaque type GTranslateFunc = CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
object GTranslateFunc:
  given _tag: Tag[GTranslateFunc] = Tag.materializeCFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTranslateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]]): GTranslateFunc = o
  extension (v: GTranslateFunc)
    inline def value: CFuncPtr2[Ptr[gchar], gpointer, Ptr[gchar]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)