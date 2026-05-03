package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkComboBoxClass: _class: The parent class. : Signal is emitted when the active item is changed. _entry_text: Signal which allows you to change how the text displayed in a combo box’s entry is displayed.
*/
opaque type _GtkComboBoxClass = CStruct5[GtkWidgetClass, CFuncPtr1[Ptr[GtkComboBox], Unit], CFuncPtr2[Ptr[GtkComboBox], CString, CString], CFuncPtr1[Ptr[GtkComboBox], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]

object _GtkComboBoxClass:
  given _tag: Tag[_GtkComboBoxClass] = Tag.materializeCStruct5Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkComboBox], Unit], CFuncPtr2[Ptr[GtkComboBox], CString, CString], CFuncPtr1[Ptr[GtkComboBox], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkComboBoxClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr1[Ptr[GtkComboBox], Unit] = struct._2
      inline def changed_=(value: CFuncPtr1[Ptr[GtkComboBox], Unit]): Unit = (!struct.at2 = value)
      inline def format_entry_text : CFuncPtr2[Ptr[GtkComboBox], CString, CString] = struct._3
      inline def format_entry_text_=(value: CFuncPtr2[Ptr[GtkComboBox], CString, CString]): Unit = (!struct.at3 = value)
      inline def activate : CFuncPtr1[Ptr[GtkComboBox], Unit] = struct._4
      inline def activate_=(value: CFuncPtr1[Ptr[GtkComboBox], Unit]): Unit = (!struct.at4 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7] = struct._5
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GtkComboBoxClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkComboBoxClass] = scala.scalanative.unsafe.alloc[_GtkComboBoxClass](1)
  def apply(parent_class : GtkWidgetClass, changed : CFuncPtr1[Ptr[GtkComboBox], Unit], format_entry_text : CFuncPtr2[Ptr[GtkComboBox], CString, CString], activate : CFuncPtr1[Ptr[GtkComboBox], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7])(using Zone): Ptr[_GtkComboBoxClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).format_entry_text = format_entry_text
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr