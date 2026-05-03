package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDrawingArea = CStruct1[GtkWidget]

object GtkDrawingArea:
  given _tag: Tag[GtkDrawingArea] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkDrawingArea)
      inline def widget : GtkWidget = struct._1
      inline def widget_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkDrawingArea on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkDrawingArea] = scala.scalanative.unsafe.alloc[GtkDrawingArea](1)
  def apply(widget : GtkWidget)(using Zone): Ptr[GtkDrawingArea] =
    val ____ptr = apply()
    (!____ptr).widget = widget
    ____ptr