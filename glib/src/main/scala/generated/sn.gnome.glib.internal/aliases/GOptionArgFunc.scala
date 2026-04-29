package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOptionArgFunc: _name: The name of the option being parsed. This will be either a single dash followed by a single letter (for a short name) or two dashes followed by a long option name. : The value to be parsed.
*/
opaque type GOptionArgFunc = CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
object GOptionArgFunc:
  given _tag: Tag[GOptionArgFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GOptionArgFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean]): GOptionArgFunc = o
  extension (v: GOptionArgFunc)
    inline def value: CFuncPtr4[Ptr[gchar], Ptr[gchar], gpointer, Ptr[Ptr[GError]], gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)