package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkRangeClass = CStruct7[GtkWidgetClass, CFuncPtr1[Ptr[GtkRange], Unit], CFuncPtr2[Ptr[GtkRange], Double, Unit], CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkRangeClass:
  given _tag: Tag[_GtkRangeClass] = Tag.materializeCStruct7Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkRange], Unit], CFuncPtr2[Ptr[GtkRange], Double, Unit], CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkRangeClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def value_changed : CFuncPtr1[Ptr[GtkRange], Unit] = struct._2
      inline def value_changed_=(value: CFuncPtr1[Ptr[GtkRange], Unit]): Unit = (!struct.at2 = value)
      inline def adjust_bounds : CFuncPtr2[Ptr[GtkRange], Double, Unit] = struct._3
      inline def adjust_bounds_=(value: CFuncPtr2[Ptr[GtkRange], Double, Unit]): Unit = (!struct.at3 = value)
      inline def move_slider : CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit] = struct._4
      inline def move_slider_=(value: CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit]): Unit = (!struct.at4 = value)
      inline def get_range_border : CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit] = struct._5
      inline def get_range_border_=(value: CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit]): Unit = (!struct.at5 = value)
      inline def change_value : CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def change_value_=(value: CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._7
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GtkRangeClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkRangeClass] = scala.scalanative.unsafe.alloc[_GtkRangeClass](1)
  def apply(parent_class : GtkWidgetClass, value_changed : CFuncPtr1[Ptr[GtkRange], Unit], adjust_bounds : CFuncPtr2[Ptr[GtkRange], Double, Unit], move_slider : CFuncPtr2[Ptr[GtkRange], GtkScrollType, Unit], get_range_border : CFuncPtr2[Ptr[GtkRange], Ptr[GtkBorder], Unit], change_value : CFuncPtr3[Ptr[GtkRange], GtkScrollType, Double, _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkRangeClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).value_changed = value_changed
    (!____ptr).adjust_bounds = adjust_bounds
    (!____ptr).move_slider = move_slider
    (!____ptr).get_range_border = get_range_border
    (!____ptr).change_value = change_value
    (!____ptr).padding = padding
    ____ptr