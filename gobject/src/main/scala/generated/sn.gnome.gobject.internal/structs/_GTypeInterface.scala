package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeInterface:
*/
opaque type _GTypeInterface = CStruct2[GType, GType]

object _GTypeInterface:
  given _tag: Tag[_GTypeInterface] = Tag.materializeCStruct2Tag[GType, GType]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeInterface)
      inline def g_type : GType = struct._1
      inline def g_type_=(value: GType): Unit = (!struct.at1 = value)
      inline def g_instance_type : GType = struct._2
      inline def g_instance_type_=(value: GType): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GTypeInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeInterface] = scala.scalanative.unsafe.alloc[_GTypeInterface](1)
  def apply(g_type : GType, g_instance_type : GType)(using Zone): Ptr[_GTypeInterface] =
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    (!____ptr).g_instance_type = g_instance_type
    ____ptr