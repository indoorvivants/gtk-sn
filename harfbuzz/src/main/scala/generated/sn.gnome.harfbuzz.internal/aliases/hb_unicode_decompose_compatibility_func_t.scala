package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_unicode_decompose_compatibility_func_t: : a Unicode function structure : codepoint to decompose : address of codepoint array (of length #HB_UNICODE_MAX_DECOMPOSITION_LEN) to write decomposition into _data: user data pointer as passed to hb_unicode_funcs_set_decompose_compatibility_func()
*/
opaque type hb_unicode_decompose_compatibility_func_t = CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
object hb_unicode_decompose_compatibility_func_t:
  given _tag: Tag[hb_unicode_decompose_compatibility_func_t] = Tag.materializeCFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_unicode_decompose_compatibility_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt]): hb_unicode_decompose_compatibility_func_t = o
  extension (v: hb_unicode_decompose_compatibility_func_t)
    inline def value: CFuncPtr4[Ptr[hb_unicode_funcs_t], hb_codepoint_t, Ptr[hb_codepoint_t], Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)