package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkDrawingArea = CStruct1[GtkWidget]

object _GtkDrawingArea:
  given _tag: Tag[_GtkDrawingArea] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkDrawingArea)
      inline def widget : GtkWidget = struct._1
      inline def widget_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkDrawingArea on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkDrawingArea] = scala.scalanative.unsafe.alloc[_GtkDrawingArea](1)
  def apply(widget : GtkWidget)(using Zone): Ptr[_GtkDrawingArea] =
    val ____ptr = apply()
    (!____ptr).widget = widget
    ____ptr