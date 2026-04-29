package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPtrArray = CStruct2[Ptr[gpointer], guint]

object GPtrArray:
  given _tag: Tag[GPtrArray] = Tag.materializeCStruct2Tag[Ptr[gpointer], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GPtrArray)
      inline def pdata : Ptr[gpointer] = struct._1
      inline def pdata_=(value: Ptr[gpointer]): Unit = (!struct.at1 = value)
      inline def len : guint = struct._2
      inline def len_=(value: guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GPtrArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GPtrArray] = scala.scalanative.unsafe.alloc[GPtrArray](1)
  def apply(pdata : Ptr[gpointer], len : guint)(using Zone): Ptr[GPtrArray] =
    val ____ptr = apply()
    (!____ptr).pdata = pdata
    (!____ptr).len = len
    ____ptr