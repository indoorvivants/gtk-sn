package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GByteArray = CStruct2[Ptr[guint8], guint]

object _GByteArray:
  given _tag: Tag[_GByteArray] = Tag.materializeCStruct2Tag[Ptr[guint8], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GByteArray)
      inline def data : Ptr[guint8] = struct._1
      inline def data_=(value: Ptr[guint8]): Unit = (!struct.at1 = value)
      inline def len : guint = struct._2
      inline def len_=(value: guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GByteArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GByteArray] = scala.scalanative.unsafe.alloc[_GByteArray](1)
  def apply(data : Ptr[guint8], len : guint)(using Zone): Ptr[_GByteArray] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr