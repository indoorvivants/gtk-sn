package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererText = CStruct1[GtkCellRenderer]

object GtkCellRendererText:
  given _tag: Tag[GtkCellRendererText] = Tag.materializeCStruct1Tag[GtkCellRenderer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkCellRendererText)
      inline def parent : GtkCellRenderer = struct._1
      inline def parent_=(value: GtkCellRenderer): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkCellRendererText on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkCellRendererText] = scala.scalanative.unsafe.alloc[GtkCellRendererText](1)
  def apply(parent : GtkCellRenderer)(using Zone): Ptr[GtkCellRendererText] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr