package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+1-0ab16a73-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_get_table_tags_func_t: : A face object _offset: The index of first table tag to retrieve _count: (inout): Input = the maximum number of table tags to return; Output = the actual number of table tags returned (may be zero) _tags: (out) (array length=table_count): The array of table tags found _data: User data pointer passed by the caller
*/
opaque type hb_get_table_tags_func_t = CFuncPtr5[Ptr[hb_face_t], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_tag_t], Ptr[Byte], CUnsignedInt]
object hb_get_table_tags_func_t:
  given _tag: Tag[hb_get_table_tags_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_face_t], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_tag_t], Ptr[Byte], CUnsignedInt]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_get_table_tags_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_face_t], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_tag_t], Ptr[Byte], CUnsignedInt]): hb_get_table_tags_func_t = o
  extension (v: hb_get_table_tags_func_t)
    inline def value: CFuncPtr5[Ptr[hb_face_t], CUnsignedInt, Ptr[CUnsignedInt], Ptr[hb_tag_t], Ptr[Byte], CUnsignedInt] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)