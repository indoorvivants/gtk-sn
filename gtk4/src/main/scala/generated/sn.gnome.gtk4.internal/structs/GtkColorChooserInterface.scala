package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorChooserInterface = CStruct6[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]

object GtkColorChooserInterface:
  given _tag: Tag[GtkColorChooserInterface] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkColorChooserInterface)
      inline def base_interface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def base_interface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._2
      inline def get_rgba_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = (!struct.at2 = value)
      inline def set_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._3
      inline def set_rgba_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = (!struct.at3 = value)
      inline def add_palette : CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit] = struct._4
      inline def add_palette_=(value: CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit]): Unit = (!struct.at4 = value)
      inline def color_activated : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit] = struct._5
      inline def color_activated_=(value: CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit]): Unit = (!struct.at5 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]] = struct._6
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GtkColorChooserInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkColorChooserInterface] = scala.scalanative.unsafe.alloc[GtkColorChooserInterface](1)
  def apply(base_interface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], set_rgba : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], add_palette : CFuncPtr5[Ptr[GtkColorChooser], GtkOrientation, CInt, CInt, Ptr[GdkRGBA], Unit], color_activated : CFuncPtr2[Ptr[GtkColorChooser], Ptr[GdkRGBA], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[GtkColorChooserInterface] =
    val ____ptr = apply()
    (!____ptr).base_interface = base_interface
    (!____ptr).get_rgba = get_rgba
    (!____ptr).set_rgba = set_rgba
    (!____ptr).add_palette = add_palette
    (!____ptr).color_activated = color_activated
    (!____ptr).padding = padding
    ____ptr