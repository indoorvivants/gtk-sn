package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_user_data_key_t:
*/
opaque type hb_user_data_key_t = CStruct1[CChar]

object hb_user_data_key_t:
  given _tag: Tag[hb_user_data_key_t] = Tag.materializeCStruct1Tag[CChar]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_user_data_key_t)
      inline def unused : CChar = struct._1
      inline def unused_=(value: CChar): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates hb_user_data_key_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_user_data_key_t] = scala.scalanative.unsafe.alloc[hb_user_data_key_t](1)
  def apply(unused : CChar)(using Zone): Ptr[hb_user_data_key_t] =
    val ____ptr = apply()
    (!____ptr).unused = unused
    ____ptr