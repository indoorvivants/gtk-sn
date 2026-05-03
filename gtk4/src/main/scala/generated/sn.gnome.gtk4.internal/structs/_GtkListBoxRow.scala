package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkListBoxRow = CStruct1[GtkWidget]

object _GtkListBoxRow:
  given _tag: Tag[_GtkListBoxRow] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkListBoxRow)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkListBoxRow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkListBoxRow] = scala.scalanative.unsafe.alloc[_GtkListBoxRow](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[_GtkListBoxRow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr