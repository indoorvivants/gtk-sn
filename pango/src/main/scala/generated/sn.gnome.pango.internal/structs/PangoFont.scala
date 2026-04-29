package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFont:
*/
opaque type PangoFont = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object PangoFont:
  given _tag: Tag[PangoFont] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoFont)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates PangoFont on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoFont] = scala.scalanative.unsafe.alloc[PangoFont](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoFont] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr