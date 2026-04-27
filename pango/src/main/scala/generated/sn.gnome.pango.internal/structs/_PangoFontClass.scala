package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _PangoFontClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]]

object _PangoFontClass:
  given _tag: Tag[_PangoFontClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoFontClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]] = struct._2
      inline def describe_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]]): Unit = (!struct.at2 = value)
      inline def get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]] = struct._3
      inline def get_coverage_=(value: CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]]): Unit = (!struct.at3 = value)
      inline def get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit] = struct._4
      inline def get_glyph_extents_=(value: CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit]): Unit = (!struct.at4 = value)
      inline def get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]] = struct._5
      inline def get_metrics_=(value: CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]]): Unit = (!struct.at5 = value)
      inline def get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]] = struct._6
      inline def get_font_map_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]]): Unit = (!struct.at6 = value)
      inline def describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]] = struct._7
      inline def describe_absolute_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]]): Unit = (!struct.at7 = value)
      inline def get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit] = struct._8
      inline def get_features_=(value: CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit]): Unit = (!struct.at8 = value)
      inline def create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]] = struct._9
      inline def create_hb_font_=(value: CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _PangoFontClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoFontClass] = scala.scalanative.unsafe.alloc[_PangoFontClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, describe : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_coverage : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoCoverage]], get_glyph_extents : CFuncPtr4[Ptr[PangoFont], PangoGlyph, Ptr[PangoRectangle], Ptr[PangoRectangle], Unit], get_metrics : CFuncPtr2[Ptr[PangoFont], Ptr[PangoLanguage], Ptr[PangoFontMetrics]], get_font_map : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontMap]], describe_absolute : CFuncPtr1[Ptr[PangoFont], Ptr[PangoFontDescription]], get_features : CFuncPtr4[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_feature_t], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.guint], Unit], create_hb_font : CFuncPtr1[Ptr[PangoFont], Ptr[_root_.sn.gnome.harfbuzz.internal.hb_font_t]])(using Zone): Ptr[_PangoFontClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).describe = describe
    (!____ptr).get_coverage = get_coverage
    (!____ptr).get_glyph_extents = get_glyph_extents
    (!____ptr).get_metrics = get_metrics
    (!____ptr).get_font_map = get_font_map
    (!____ptr).describe_absolute = describe_absolute
    (!____ptr).get_features = get_features
    (!____ptr).create_hb_font = create_hb_font
    ____ptr