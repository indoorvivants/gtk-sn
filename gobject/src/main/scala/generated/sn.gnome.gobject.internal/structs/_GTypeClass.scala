package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeClass:
*/
opaque type _GTypeClass = CStruct1[GType]

object _GTypeClass:
  given _tag: Tag[_GTypeClass] = Tag.materializeCStruct1Tag[GType]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeClass)
      inline def g_type : GType = struct._1
      inline def g_type_=(value: GType): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GTypeClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeClass] = scala.scalanative.unsafe.alloc[_GTypeClass](1)
  def apply(g_type : GType)(using Zone): Ptr[_GTypeClass] =
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    ____ptr