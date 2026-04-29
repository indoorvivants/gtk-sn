package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeInstance:
*/
opaque type GTypeInstance = CStruct1[Ptr[GTypeClass]]

object GTypeInstance:
  given _tag: Tag[GTypeInstance] = Tag.materializeCStruct1Tag[Ptr[GTypeClass]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTypeInstance)
      inline def g_class : Ptr[GTypeClass] = struct._1
      inline def g_class_=(value: Ptr[GTypeClass]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GTypeInstance on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTypeInstance] = scala.scalanative.unsafe.alloc[GTypeInstance](1)
  def apply(g_class : Ptr[GTypeClass])(using Zone): Ptr[GTypeInstance] =
    val ____ptr = apply()
    (!____ptr).g_class = g_class
    ____ptr