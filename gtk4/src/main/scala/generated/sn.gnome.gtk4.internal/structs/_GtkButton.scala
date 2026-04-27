package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkButton = CStruct1[GtkWidget]

object _GtkButton:
  given _tag: Tag[_GtkButton] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkButton)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkButton on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkButton] = scala.scalanative.unsafe.alloc[_GtkButton](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkButton] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr