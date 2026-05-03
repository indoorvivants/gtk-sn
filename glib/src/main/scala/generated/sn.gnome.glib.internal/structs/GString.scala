package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GString = CStruct3[Ptr[gchar], gsize, gsize]

object GString:
  given _tag: Tag[GString] = Tag.materializeCStruct3Tag[Ptr[gchar], gsize, gsize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GString)
      inline def str : Ptr[gchar] = struct._1
      inline def str_=(value: Ptr[gchar]): Unit = (!struct.at1 = value)
      inline def len : gsize = struct._2
      inline def len_=(value: gsize): Unit = (!struct.at2 = value)
      inline def allocated_len : gsize = struct._3
      inline def allocated_len_=(value: gsize): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GString on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GString] = scala.scalanative.unsafe.alloc[GString](1)
  def apply(str : Ptr[gchar], len : gsize, allocated_len : gsize)(using Zone): Ptr[GString] =
    val ____ptr = apply()
    (!____ptr).str = str
    (!____ptr).len = len
    (!____ptr).allocated_len = allocated_len
    ____ptr