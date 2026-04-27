package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GDebugKey = CStruct2[Ptr[gchar], guint]

object _GDebugKey:
  given _tag: Tag[_GDebugKey] = Tag.materializeCStruct2Tag[Ptr[gchar], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDebugKey)
      inline def key : Ptr[gchar] = struct._1
      inline def key_=(value: Ptr[gchar]): Unit = (!struct.at1 = value)
      inline def value : guint = struct._2
      inline def value_=(value: guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDebugKey on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDebugKey] = scala.scalanative.unsafe.alloc[_GDebugKey](1)
  def apply(key : Ptr[gchar], value : guint)(using Zone): Ptr[_GDebugKey] =
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    ____ptr