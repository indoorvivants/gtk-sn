package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeClass:
*/
opaque type GTypeClass = CStruct1[_root_.sn.gnome.gobject.internal.GType]

object GTypeClass:
  given _tag: Tag[GTypeClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GType]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTypeClass)
      inline def g_type : _root_.sn.gnome.gobject.internal.GType = struct._1
      inline def g_type_=(value: _root_.sn.gnome.gobject.internal.GType): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GTypeClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTypeClass] = scala.scalanative.unsafe.alloc[GTypeClass](1)
  def apply(g_type : _root_.sn.gnome.gobject.internal.GType)(using Zone): Ptr[GTypeClass] =
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    ____ptr