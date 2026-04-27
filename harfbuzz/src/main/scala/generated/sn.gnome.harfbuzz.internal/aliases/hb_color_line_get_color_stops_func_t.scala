package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_color_line_get_color_stops_func_t: _line: a #hb_color_line_t object _line_data: the data accompanying _line : the index of the first color stop to return : (inout) (optional): Input = the maximum number of feature tags to return; Output = the actual number of feature tags returned (may be zero) _stops: (out) (array length=count) (optional): Array of #hb_color_stop_t to populate _data: the data accompanying this method
*/
opaque type hb_color_line_get_color_stops_func_t = CFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt]
object hb_color_line_get_color_stops_func_t:
  given _tag: Tag[hb_color_line_get_color_stops_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_color_line_get_color_stops_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt]): hb_color_line_get_color_stops_func_t = o
  extension (v: hb_color_line_get_color_stops_func_t)
    inline def value: CFuncPtr6[Ptr[hb_color_line_t], Ptr[Byte], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_color_stop_t], Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)