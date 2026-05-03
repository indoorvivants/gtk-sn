package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_unicode_script_func_t: : A Unicode-functions structure : The code point to query _data: User data pointer passed by the caller
*/
opaque type hb_unicode_script_func_t = CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
object hb_unicode_script_func_t:
  given _tag: Tag[hb_unicode_script_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_unicode_script_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t]): hb_unicode_script_func_t = o
  extension (v: hb_unicode_script_func_t)
    inline def value: CFuncPtr3[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[Byte], hb_script_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)