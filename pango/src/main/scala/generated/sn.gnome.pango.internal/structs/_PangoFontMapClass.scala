package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontMapClass: _class: parent `GObjectClass` _font: a function to load a font with a given description. See pango_font_map_load_font(). _families: A function to list available font families. See pango_font_map_list_families(). _fontset: a function to load a fontset with a given given description suitable for a particular language. See pango_font_map_load_fontset(). _engine_type: the type of rendering-system-dependent engines that can handle fonts of this fonts loaded with this fontmap. _serial: a function to get the serial number of the fontmap. See pango_font_map_get_serial(). : See pango_font_map_changed()
*/
opaque type _PangoFontMapClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], CString, CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]

object _PangoFontMapClass:
  given _tag: Tag[_PangoFontMapClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], CString, CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], CFuncPtr1[Ptr[PangoFontMap], Unit], CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoFontMapClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]] = struct._2
      inline def load_font_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]]): Unit = (!struct.at2 = value)
      inline def list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit] = struct._3
      inline def list_families_=(value: CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit]): Unit = (!struct.at3 = value)
      inline def load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]] = struct._4
      inline def load_fontset_=(value: CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]]): Unit = (!struct.at4 = value)
      inline def shape_engine_type : CString = struct._5
      inline def shape_engine_type_=(value: CString): Unit = (!struct.at5 = value)
      inline def get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint] = struct._6
      inline def get_serial_=(value: CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at6 = value)
      inline def changed : CFuncPtr1[Ptr[PangoFontMap], Unit] = struct._7
      inline def changed_=(value: CFuncPtr1[Ptr[PangoFontMap], Unit]): Unit = (!struct.at7 = value)
      inline def get_family : CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]] = struct._8
      inline def get_family_=(value: CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]]): Unit = (!struct.at8 = value)
      inline def get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]] = struct._9
      inline def get_face_=(value: CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _PangoFontMapClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoFontMapClass] = scala.scalanative.unsafe.alloc[_PangoFontMapClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, load_font : CFuncPtr3[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoFont]], list_families : CFuncPtr3[Ptr[PangoFontMap], Ptr[Ptr[Ptr[PangoFontFamily]]], Ptr[CInt], Unit], load_fontset : CFuncPtr4[Ptr[PangoFontMap], Ptr[PangoContext], Ptr[PangoFontDescription], Ptr[PangoLanguage], Ptr[PangoFontset]], shape_engine_type : CString, get_serial : CFuncPtr1[Ptr[PangoFontMap], _root_.sn.gnome.glib.internal.guint], changed : CFuncPtr1[Ptr[PangoFontMap], Unit], get_family : CFuncPtr2[Ptr[PangoFontMap], CString, Ptr[PangoFontFamily]], get_face : CFuncPtr2[Ptr[PangoFontMap], Ptr[PangoFont], Ptr[PangoFontFace]])(using Zone): Ptr[_PangoFontMapClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).load_font = load_font
    (!____ptr).list_families = list_families
    (!____ptr).load_fontset = load_fontset
    (!____ptr).shape_engine_type = shape_engine_type
    (!____ptr).get_serial = get_serial
    (!____ptr).changed = changed
    (!____ptr).get_family = get_family
    (!____ptr).get_face = get_face
    ____ptr