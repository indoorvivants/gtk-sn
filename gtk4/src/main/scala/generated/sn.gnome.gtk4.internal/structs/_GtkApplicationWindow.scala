package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkApplicationWindow = CStruct1[GtkWindow]

object _GtkApplicationWindow:
  given _tag: Tag[_GtkApplicationWindow] = Tag.materializeCStruct1Tag[GtkWindow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkApplicationWindow)
      inline def parent_instance : GtkWindow = struct._1
      inline def parent_instance_=(value: GtkWindow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkApplicationWindow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkApplicationWindow] = scala.scalanative.unsafe.alloc[_GtkApplicationWindow](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[_GtkApplicationWindow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr