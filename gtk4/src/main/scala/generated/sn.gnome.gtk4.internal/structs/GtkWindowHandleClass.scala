package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWindowHandleClass = CStruct1[GtkWidgetClass]

object GtkWindowHandleClass:
  given _tag: Tag[GtkWindowHandleClass] = Tag.materializeCStruct1Tag[GtkWidgetClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkWindowHandleClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkWindowHandleClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkWindowHandleClass] = scala.scalanative.unsafe.alloc[GtkWindowHandleClass](1)
  def apply(parent_class : GtkWidgetClass)(using Zone): Ptr[GtkWindowHandleClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr