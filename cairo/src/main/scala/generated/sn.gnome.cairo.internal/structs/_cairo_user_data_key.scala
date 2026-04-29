package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_user_data_key_t: : not used; ignore.
*/
opaque type _cairo_user_data_key = CStruct1[CInt]

object _cairo_user_data_key:
  given _tag: Tag[_cairo_user_data_key] = Tag.materializeCStruct1Tag[CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_user_data_key)
      inline def unused : CInt = struct._1
      inline def unused_=(value: CInt): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _cairo_user_data_key on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_user_data_key] = scala.scalanative.unsafe.alloc[_cairo_user_data_key](1)
  def apply(unused : CInt)(using Zone): Ptr[_cairo_user_data_key] =
    val ____ptr = apply()
    (!____ptr).unused = unused
    ____ptr