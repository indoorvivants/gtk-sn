package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GLogField = CStruct3[Ptr[gchar], gconstpointer, gssize]

object GLogField:
  given _tag: Tag[GLogField] = Tag.materializeCStruct3Tag[Ptr[gchar], gconstpointer, gssize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GLogField)
      inline def key : Ptr[gchar] = struct._1
      inline def key_=(value: Ptr[gchar]): Unit = (!struct.at1 = value)
      inline def value : gconstpointer = struct._2
      inline def value_=(value: gconstpointer): Unit = (!struct.at2 = value)
      inline def length : gssize = struct._3
      inline def length_=(value: gssize): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GLogField on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLogField] = scala.scalanative.unsafe.alloc[GLogField](1)
  def apply(key : Ptr[gchar], value : gconstpointer, length : gssize)(using Zone): Ptr[GLogField] =
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    (!____ptr).length = length
    ____ptr