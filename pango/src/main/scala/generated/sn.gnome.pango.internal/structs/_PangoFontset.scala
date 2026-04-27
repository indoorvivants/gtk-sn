package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontset:
*/
opaque type _PangoFontset = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object _PangoFontset:
  given _tag: Tag[_PangoFontset] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoFontset)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _PangoFontset on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoFontset] = scala.scalanative.unsafe.alloc[_PangoFontset](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFontset] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr