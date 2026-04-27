package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaControlsClass = CStruct1[GtkWidgetClass]

object GtkMediaControlsClass:
  given _tag: Tag[GtkMediaControlsClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkMediaControlsClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkMediaControlsClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkMediaControlsClass] = scala.scalanative.unsafe.alloc[GtkMediaControlsClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkMediaControlsClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr