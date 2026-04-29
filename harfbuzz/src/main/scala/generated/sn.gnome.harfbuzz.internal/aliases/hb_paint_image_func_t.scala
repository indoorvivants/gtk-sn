package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_paint_image_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() : width of the raster image in pixels, or 0 : height of the raster image in pixels, or 0 : the image format as a tag : the synthetic slant ratio to be applied to the image during rendering : (nullable): glyph extents for desired rendering _data: User data pointer passed to hb_paint_funcs_set_image_func()
*/
opaque type hb_paint_image_func_t = CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
object hb_paint_image_func_t:
  given _tag: Tag[hb_paint_image_func_t] = Tag.materializeCFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_paint_image_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t]): hb_paint_image_func_t = o
  extension (v: hb_paint_image_func_t)
    inline def value: CFuncPtr9[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_blob_t], CUnsignedInt, CUnsignedInt, hb_tag_t, Float, Ptr[hb_glyph_extents_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)