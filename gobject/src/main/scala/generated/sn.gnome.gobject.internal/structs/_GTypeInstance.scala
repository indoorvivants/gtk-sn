package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeInstance:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
opaque type _GTypeInstance = CStruct1[Ptr[GTypeClass]]

object _GTypeInstance:
  given _tag: Tag[_GTypeInstance] = Tag.materializeCStruct1Tag[Ptr[GTypeClass]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeInstance)
      inline def g_class : Ptr[GTypeClass] = struct._1
      inline def g_class_=(value: Ptr[GTypeClass]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GTypeInstance on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeInstance] = scala.scalanative.unsafe.alloc[_GTypeInstance](1)
  def apply(g_class : Ptr[GTypeClass])(using Zone): Ptr[_GTypeInstance] =
    val ____ptr = apply()
    (!____ptr).g_class = g_class
    ____ptr