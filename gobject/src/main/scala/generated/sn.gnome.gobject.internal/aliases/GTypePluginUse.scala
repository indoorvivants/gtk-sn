package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypePluginUse: : the #GTypePlugin whose use count should be increased

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type GTypePluginUse = CFuncPtr1[Ptr[GTypePlugin], Unit]
object GTypePluginUse:
  given _tag: Tag[GTypePluginUse] = Tag.materializeCFuncPtr1[Ptr[GTypePlugin], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypePluginUse = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GTypePlugin], Unit]): GTypePluginUse = o
  extension (v: GTypePluginUse)
    inline def value: CFuncPtr1[Ptr[GTypePlugin], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)