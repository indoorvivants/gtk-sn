package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontMap:
*/
opaque type _PangoFontMap = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object _PangoFontMap:
  given _tag: Tag[_PangoFontMap] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoFontMap)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _PangoFontMap on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoFontMap] = scala.scalanative.unsafe.alloc[_PangoFontMap](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_PangoFontMap] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr