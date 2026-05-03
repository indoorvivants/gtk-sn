package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeFundamentalInfo: _flags: #GTypeFundamentalFlags describing the characteristics of the fundamental type
*/
opaque type _GTypeFundamentalInfo = CStruct1[GTypeFundamentalFlags]

object _GTypeFundamentalInfo:
  given _tag: Tag[_GTypeFundamentalInfo] = Tag.materializeCStruct1Tag[GTypeFundamentalFlags]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeFundamentalInfo)
      inline def type_flags : GTypeFundamentalFlags = struct._1
      inline def type_flags_=(value: GTypeFundamentalFlags): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GTypeFundamentalInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeFundamentalInfo] = scala.scalanative.unsafe.alloc[_GTypeFundamentalInfo](1)
  def apply(type_flags : GTypeFundamentalFlags)(using Zone): Ptr[_GTypeFundamentalInfo] =
    val ____ptr = apply()
    (!____ptr).type_flags = type_flags
    ____ptr