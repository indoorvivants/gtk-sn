package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkCellRendererText = CStruct1[GtkCellRenderer]

object _GtkCellRendererText:
  given _tag: Tag[_GtkCellRendererText] = Tag.materializeCStruct1Tag[GtkCellRenderer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkCellRendererText)
      inline def parent : GtkCellRenderer = struct._1
      inline def parent_=(value: GtkCellRenderer): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkCellRendererText on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkCellRendererText] = scala.scalanative.unsafe.alloc[_GtkCellRendererText](1)
  def apply(parent : GtkCellRenderer)(using Zone): Ptr[_GtkCellRendererText] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr