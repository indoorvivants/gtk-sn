package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkPopoverClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkPopover], Unit], CFuncPtr1[Ptr[GtkPopover], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkPopoverClass:
  given _tag: Tag[_GtkPopoverClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkPopover], Unit], CFuncPtr1[Ptr[GtkPopover], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkPopoverClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def closed : CFuncPtr1[Ptr[GtkPopover], Unit] = struct._2
      inline def closed_=(value: CFuncPtr1[Ptr[GtkPopover], Unit]): Unit = (!struct.at2 = value)
      inline def activate_default : CFuncPtr1[Ptr[GtkPopover], Unit] = struct._3
      inline def activate_default_=(value: CFuncPtr1[Ptr[GtkPopover], Unit]): Unit = (!struct.at3 = value)
      inline def reserved : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def reserved_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GtkPopoverClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkPopoverClass] = scala.scalanative.unsafe.alloc[_GtkPopoverClass](1)
  def apply(parent_class : GtkWidgetClass, closed : CFuncPtr1[Ptr[GtkPopover], Unit], activate_default : CFuncPtr1[Ptr[GtkPopover], Unit], reserved : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkPopoverClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).closed = closed
    (!____ptr).activate_default = activate_default
    (!____ptr).reserved = reserved
    ____ptr