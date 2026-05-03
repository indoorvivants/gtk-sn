package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkFontChooserIface = CStruct9[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]], CFuncPtr1[Ptr[GtkFontChooser], CInt], CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap], Unit], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]

object _GtkFontChooserIface:
  given _tag: Tag[_GtkFontChooserIface] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]], CFuncPtr1[Ptr[GtkFontChooser], CInt], CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap], Unit], CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkFontChooserIface)
      inline def base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def base_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_font_family : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]] = struct._2
      inline def get_font_family_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]]): Unit = (!struct.at2 = value)
      inline def get_font_face : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]] = struct._3
      inline def get_font_face_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]]): Unit = (!struct.at3 = value)
      inline def get_font_size : CFuncPtr1[Ptr[GtkFontChooser], CInt] = struct._4
      inline def get_font_size_=(value: CFuncPtr1[Ptr[GtkFontChooser], CInt]): Unit = (!struct.at4 = value)
      inline def set_filter_func : CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit] = struct._5
      inline def set_filter_func_=(value: CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]): Unit = (!struct.at5 = value)
      inline def font_activated : CFuncPtr2[Ptr[GtkFontChooser], CString, Unit] = struct._6
      inline def font_activated_=(value: CFuncPtr2[Ptr[GtkFontChooser], CString, Unit]): Unit = (!struct.at6 = value)
      inline def set_font_map : CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap], Unit] = struct._7
      inline def set_font_map_=(value: CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap], Unit]): Unit = (!struct.at7 = value)
      inline def get_font_map : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]] = struct._8
      inline def get_font_map_=(value: CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]]): Unit = (!struct.at8 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._9
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _GtkFontChooserIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkFontChooserIface] = scala.scalanative.unsafe.alloc[_GtkFontChooserIface](1)
  def apply(base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_font_family : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFamily]], get_font_face : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontFace]], get_font_size : CFuncPtr1[Ptr[GtkFontChooser], CInt], set_filter_func : CFuncPtr4[Ptr[GtkFontChooser], GtkFontFilterFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], font_activated : CFuncPtr2[Ptr[GtkFontChooser], CString, Unit], set_font_map : CFuncPtr2[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap], Unit], get_font_map : CFuncPtr1[Ptr[GtkFontChooser], Ptr[_root_.sn.gnome.pango.internal.PangoFontMap]], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[_GtkFontChooserIface] =
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).get_font_family = get_font_family
    (!____ptr).get_font_face = get_font_face
    (!____ptr).get_font_size = get_font_size
    (!____ptr).set_filter_func = set_filter_func
    (!____ptr).font_activated = font_activated
    (!____ptr).set_font_map = set_font_map
    (!____ptr).get_font_map = get_font_map
    (!____ptr).padding = padding
    ____ptr