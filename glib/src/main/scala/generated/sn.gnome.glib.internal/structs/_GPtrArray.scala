package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPtrArray = CStruct2[Ptr[gpointer], guint]

object _GPtrArray:
  given _tag: Tag[_GPtrArray] = Tag.materializeCStruct2Tag[Ptr[gpointer], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPtrArray)
      inline def pdata : Ptr[gpointer] = struct._1
      inline def pdata_=(value: Ptr[gpointer]): Unit = (!struct.at1 = value)
      inline def len : guint = struct._2
      inline def len_=(value: guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GPtrArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPtrArray] = scala.scalanative.unsafe.alloc[_GPtrArray](1)
  def apply(pdata : Ptr[gpointer], len : guint)(using Zone): Ptr[_GPtrArray] =
    val ____ptr = apply()
    (!____ptr).pdata = pdata
    (!____ptr).len = len
    ____ptr