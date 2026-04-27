package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngineClass:
*/
opaque type PangoEngineClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object PangoEngineClass:
  given _tag: Tag[PangoEngineClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoEngineClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates PangoEngineClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoEngineClass] = scala.scalanative.unsafe.alloc[PangoEngineClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[PangoEngineClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr