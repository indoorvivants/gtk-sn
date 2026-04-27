package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGraphicsOffloadClass = CStruct1[GtkWidgetClass]

object GtkGraphicsOffloadClass:
  given _tag: Tag[GtkGraphicsOffloadClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkGraphicsOffloadClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkGraphicsOffloadClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkGraphicsOffloadClass] = scala.scalanative.unsafe.alloc[GtkGraphicsOffloadClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkGraphicsOffloadClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr