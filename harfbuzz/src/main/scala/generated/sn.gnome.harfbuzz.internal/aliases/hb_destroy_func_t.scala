package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_destroy_func_t: _data: the data to be destroyed
*/
opaque type hb_destroy_func_t = CFuncPtr1[Ptr[Byte], Unit]
object hb_destroy_func_t:
  given _tag: Tag[hb_destroy_func_t] = Tag.materializeCFuncPtr1[Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_destroy_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[Byte], Unit]): hb_destroy_func_t = o
  extension (v: hb_destroy_func_t)
    inline def value: CFuncPtr1[Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)