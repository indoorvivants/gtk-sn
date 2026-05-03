package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_reference_table_func_t: : an #hb_face_t to reference table for : the tag of the table to reference _data: User data pointer passed by the caller
*/
opaque type hb_reference_table_func_t = CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
object hb_reference_table_func_t:
  given _tag: Tag[hb_reference_table_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_reference_table_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]]): hb_reference_table_func_t = o
  extension (v: hb_reference_table_func_t)
    inline def value: CFuncPtr3[Ptr[hb_face_t], hb_tag_t, Ptr[Byte], Ptr[hb_blob_t]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)