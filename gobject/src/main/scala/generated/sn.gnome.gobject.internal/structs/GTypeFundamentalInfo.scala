package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeFundamentalInfo: _flags: #GTypeFundamentalFlags describing the characteristics of the fundamental type
*/
opaque type GTypeFundamentalInfo = CStruct1[GTypeFundamentalFlags]

object GTypeFundamentalInfo:
  given _tag: Tag[GTypeFundamentalInfo] = Tag.materializeCStruct1Tag[GTypeFundamentalFlags]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTypeFundamentalInfo)
      inline def type_flags : GTypeFundamentalFlags = struct._1
      inline def type_flags_=(value: GTypeFundamentalFlags): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GTypeFundamentalInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTypeFundamentalInfo] = scala.scalanative.unsafe.alloc[GTypeFundamentalInfo](1)
  def apply(type_flags : GTypeFundamentalFlags)(using Zone): Ptr[GTypeFundamentalInfo] =
    val ____ptr = apply()
    (!____ptr).type_flags = type_flags
    ____ptr