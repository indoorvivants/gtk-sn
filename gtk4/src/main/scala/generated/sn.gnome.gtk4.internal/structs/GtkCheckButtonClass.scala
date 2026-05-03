package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCheckButtonClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkCheckButton], Unit], CFuncPtr1[Ptr[GtkCheckButton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]

object GtkCheckButtonClass:
  given _tag: Tag[GtkCheckButtonClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkCheckButton], Unit], CFuncPtr1[Ptr[GtkCheckButton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkCheckButtonClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def toggled : CFuncPtr1[Ptr[GtkCheckButton], Unit] = struct._2
      inline def toggled_=(value: CFuncPtr1[Ptr[GtkCheckButton], Unit]): Unit = (!struct.at2 = value)
      inline def activate : CFuncPtr1[Ptr[GtkCheckButton], Unit] = struct._3
      inline def activate_=(value: CFuncPtr1[Ptr[GtkCheckButton], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GtkCheckButtonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkCheckButtonClass] = scala.scalanative.unsafe.alloc[GtkCheckButtonClass](1)
  def apply(parent_class : GtkWidgetClass, toggled : CFuncPtr1[Ptr[GtkCheckButton], Unit], activate : CFuncPtr1[Ptr[GtkCheckButton], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7])(using Zone): Ptr[GtkCheckButtonClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).toggled = toggled
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr