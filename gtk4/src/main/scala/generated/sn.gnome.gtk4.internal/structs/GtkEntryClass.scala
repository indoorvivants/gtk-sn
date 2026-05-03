package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkEntryClass: _class: The parent class. : Class handler for the `GtkEntry::activate` signal. The default implementation activates the gtk.activate-default action.
*/
opaque type GtkEntryClass = CStruct3[GtkWidgetClass, CFuncPtr1[Ptr[GtkEntry], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkEntryClass:
  given _tag: Tag[GtkEntryClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkEntry], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkEntryClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def activate : CFuncPtr1[Ptr[GtkEntry], Unit] = struct._2
      inline def activate_=(value: CFuncPtr1[Ptr[GtkEntry], Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GtkEntryClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkEntryClass] = scala.scalanative.unsafe.alloc[GtkEntryClass](1)
  def apply(parent_class : GtkWidgetClass, activate : CFuncPtr1[Ptr[GtkEntry], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkEntryClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr