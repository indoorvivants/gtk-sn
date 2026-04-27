package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAnalysis: _engine: unused, reserved _engine: unused, reserved : the font for this segment. : the bidirectional level for this segment. : the glyph orientation for this segment (A `PangoGravity`). : boolean flags for this segment (Since: 1.16). : the detected script for this segment (A `PangoScript`) (Since: 1.18). : the detected language for this segment. _attrs: extra attributes for this segment.
*/
opaque type _PangoAnalysis = CStruct9[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, Ptr[PangoLanguage], Ptr[Byte]]

object _PangoAnalysis:
  given _tag: Tag[_PangoAnalysis] = Tag.materializeCStruct9Tag[Ptr[PangoEngineShape], Ptr[PangoEngineLang], Ptr[PangoFont], _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, _root_.sn.gnome.glib.internal.guint8, Ptr[PangoLanguage], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAnalysis)
      inline def shape_engine : Ptr[PangoEngineShape] = struct._1
      inline def shape_engine_=(value: Ptr[PangoEngineShape]): Unit = (!struct.at1 = value)
      inline def lang_engine : Ptr[PangoEngineLang] = struct._2
      inline def lang_engine_=(value: Ptr[PangoEngineLang]): Unit = (!struct.at2 = value)
      inline def font : Ptr[PangoFont] = struct._3
      inline def font_=(value: Ptr[PangoFont]): Unit = (!struct.at3 = value)
      inline def level : _root_.sn.gnome.glib.internal.guint8 = struct._4
      inline def level_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at4 = value)
      inline def gravity : _root_.sn.gnome.glib.internal.guint8 = struct._5
      inline def gravity_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at5 = value)
      inline def flags : _root_.sn.gnome.glib.internal.guint8 = struct._6
      inline def flags_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at6 = value)
      inline def script : _root_.sn.gnome.glib.internal.guint8 = struct._7
      inline def script_=(value: _root_.sn.gnome.glib.internal.guint8): Unit = (!struct.at7 = value)
      inline def language : Ptr[PangoLanguage] = struct._8
      inline def language_=(value: Ptr[PangoLanguage]): Unit = (!struct.at8 = value)
      inline def extra_attrs : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._9.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def extra_attrs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at9 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _PangoAnalysis on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAnalysis] = scala.scalanative.unsafe.alloc[_PangoAnalysis](1)
  def apply(shape_engine : Ptr[PangoEngineShape], lang_engine : Ptr[PangoEngineLang], font : Ptr[PangoFont], level : _root_.sn.gnome.glib.internal.guint8, gravity : _root_.sn.gnome.glib.internal.guint8, flags : _root_.sn.gnome.glib.internal.guint8, script : _root_.sn.gnome.glib.internal.guint8, language : Ptr[PangoLanguage], extra_attrs : Ptr[_root_.sn.gnome.glib.internal.GSList])(using Zone): Ptr[_PangoAnalysis] =
    val ____ptr = apply()
    (!____ptr).shape_engine = shape_engine
    (!____ptr).lang_engine = lang_engine
    (!____ptr).font = font
    (!____ptr).level = level
    (!____ptr).gravity = gravity
    (!____ptr).flags = flags
    (!____ptr).script = script
    (!____ptr).language = language
    (!____ptr).extra_attrs = extra_attrs
    ____ptr