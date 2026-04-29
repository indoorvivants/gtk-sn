package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GArray = CStruct2[Ptr[gchar], guint]

object GArray:
  given _tag: Tag[GArray] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GArray)
      inline def data : Ptr[gchar] = struct._1
      inline def data_=(value: Ptr[gchar]): Unit = (!struct.at1 = value)
      inline def len : guint = struct._2
      inline def len_=(value: guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GArray] = scala.scalanative.unsafe.alloc[GArray](1)
  def apply(data : Ptr[gchar], len : guint)(using Zone): Ptr[GArray] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr