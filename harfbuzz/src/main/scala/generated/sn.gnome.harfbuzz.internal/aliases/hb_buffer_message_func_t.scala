package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_buffer_message_func_t: : An #hb_buffer_t to work upon : The #hb_font_t the is shaped with : `NULL`-terminated message passed to the function _data: User data pointer passed by the caller
*/
opaque type hb_buffer_message_func_t = CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
object hb_buffer_message_func_t:
  given _tag: Tag[hb_buffer_message_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_buffer_message_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t]): hb_buffer_message_func_t = o
  extension (v: hb_buffer_message_func_t)
    inline def value: CFuncPtr4[Ptr[hb_buffer_t], Ptr[hb_font_t], CString, Ptr[Byte], hb_bool_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)