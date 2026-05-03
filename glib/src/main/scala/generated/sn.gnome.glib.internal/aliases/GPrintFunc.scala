package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPrintFunc: : the message to output
*/
opaque type GPrintFunc = CFuncPtr1[Ptr[gchar], Unit]
object GPrintFunc:
  given _tag: Tag[GPrintFunc] = Tag.materializeCFuncPtr1[Ptr[gchar], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GPrintFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[gchar], Unit]): GPrintFunc = o
  extension (v: GPrintFunc)
    inline def value: CFuncPtr1[Ptr[gchar], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)