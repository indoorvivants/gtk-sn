package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypePluginUnuse: : the #GTypePlugin whose use count should be decreased
*/
opaque type GTypePluginUnuse = CFuncPtr1[Ptr[GTypePlugin], Unit]
object GTypePluginUnuse:
  given _tag: Tag[GTypePluginUnuse] = Tag.materializeCFuncPtr1[Ptr[GTypePlugin], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypePluginUnuse = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GTypePlugin], Unit]): GTypePluginUnuse = o
  extension (v: GTypePluginUnuse)
    inline def value: CFuncPtr1[Ptr[GTypePlugin], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)