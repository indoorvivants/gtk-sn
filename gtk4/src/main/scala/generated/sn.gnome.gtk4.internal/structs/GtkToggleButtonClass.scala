package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkToggleButtonClass = CStruct3[GtkButtonClass, CFuncPtr1[Ptr[GtkToggleButton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkToggleButtonClass:
  given _tag: Tag[GtkToggleButtonClass] = Tag.materializeCStruct3Tag[GtkButtonClass, CFuncPtr1[Ptr[GtkToggleButton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkToggleButtonClass)
      inline def parent_class : GtkButtonClass = struct._1
      inline def parent_class_=(value: GtkButtonClass): Unit = (!struct.at1 = value)
      inline def toggled : CFuncPtr1[Ptr[GtkToggleButton], Unit] = struct._2
      inline def toggled_=(value: CFuncPtr1[Ptr[GtkToggleButton], Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GtkToggleButtonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkToggleButtonClass] = scala.scalanative.unsafe.alloc[GtkToggleButtonClass](1)
  def apply(parent_class : GtkButtonClass, toggled : CFuncPtr1[Ptr[GtkToggleButton], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkToggleButtonClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).toggled = toggled
    (!____ptr).padding = padding
    ____ptr