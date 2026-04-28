package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkApplicationWindow = CStruct1[GtkWindow]

object GtkApplicationWindow:
  given _tag: Tag[GtkApplicationWindow] = Tag.materializeCStruct1Tag[GtkWindow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkApplicationWindow)
      inline def parent_instance : GtkWindow = struct._1
      inline def parent_instance_=(value: GtkWindow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkApplicationWindow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkApplicationWindow] = scala.scalanative.unsafe.alloc[GtkApplicationWindow](1)
  def apply(parent_instance : GtkWindow)(using Zone): Ptr[GtkApplicationWindow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr