package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngine:
*/
opaque type PangoEngine = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object PangoEngine:
  given _tag: Tag[PangoEngine] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoEngine)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates PangoEngine on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoEngine] = scala.scalanative.unsafe.alloc[PangoEngine](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[PangoEngine] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr