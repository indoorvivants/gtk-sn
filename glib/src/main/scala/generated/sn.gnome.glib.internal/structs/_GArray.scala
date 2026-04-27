package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GArray = CStruct2[Ptr[gchar], guint]

object _GArray:
  given _tag: Tag[_GArray] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GArray)
      inline def data : Ptr[gchar] = struct._1
      inline def data_=(value: Ptr[gchar]): Unit = (!struct.at1 = value)
      inline def len : guint = struct._2
      inline def len_=(value: guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GArray] = scala.scalanative.unsafe.alloc[_GArray](1)
  def apply(data : Ptr[gchar], len : guint)(using Zone): Ptr[_GArray] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr