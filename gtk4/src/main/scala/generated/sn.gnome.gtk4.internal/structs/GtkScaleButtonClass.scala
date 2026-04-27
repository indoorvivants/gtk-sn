package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkScaleButtonClass = CStruct3[GtkWidgetClass, CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkScaleButtonClass:
  given _tag: Tag[GtkScaleButtonClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkScaleButtonClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def value_changed : CFuncPtr2[Ptr[GtkScaleButton], Double, Unit] = struct._2
      inline def value_changed_=(value: CFuncPtr2[Ptr[GtkScaleButton], Double, Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GtkScaleButtonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkScaleButtonClass] = scala.scalanative.unsafe.alloc[GtkScaleButtonClass](1)
  def apply(parent_class : GtkWidgetClass, value_changed : CFuncPtr2[Ptr[GtkScaleButton], Double, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkScaleButtonClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).value_changed = value_changed
    (!____ptr).padding = padding
    ____ptr