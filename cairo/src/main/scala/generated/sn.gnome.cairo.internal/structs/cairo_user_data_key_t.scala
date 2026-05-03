package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_user_data_key_t: : not used; ignore.
*/
opaque type cairo_user_data_key_t = CStruct1[CInt]

object cairo_user_data_key_t:
  given _tag: Tag[cairo_user_data_key_t] = Tag.materializeCStruct1Tag[CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_user_data_key_t)
      inline def unused : CInt = struct._1
      inline def unused_=(value: CInt): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates cairo_user_data_key_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_user_data_key_t] = scala.scalanative.unsafe.alloc[cairo_user_data_key_t](1)
  def apply(unused : CInt)(using Zone): Ptr[cairo_user_data_key_t] =
    val ____ptr = apply()
    (!____ptr).unused = unused
    ____ptr