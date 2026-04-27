package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontsetClass: _class: parent `GObjectClass` _font: a function to get the font in the fontset that contains the best glyph for the given Unicode character; see [method.Fontset.get_font] _metrics: a function to get overall metric information for the fonts in the fontset; see [method.Fontset.get_metrics] _language: a function to get the language of the fontset. : a function to loop over the fonts in the fontset. See [method.Fontset.foreach]
*/
opaque type PangoFontsetClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object PangoFontsetClass:
  given _tag: Tag[PangoFontsetClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoFontsetClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_font : CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]] = struct._2
      inline def get_font_=(value: CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]]): Unit = (!struct.at2 = value)
      inline def get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]] = struct._3
      inline def get_metrics_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]]): Unit = (!struct.at3 = value)
      inline def get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]] = struct._4
      inline def get_language_=(value: CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]]): Unit = (!struct.at4 = value)
      inline def foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._5
      inline def foreach_=(value: CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at5 = value)
      inline def _pango_reserved1 : CFuncPtr0[Unit] = struct._6
      inline def _pango_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
      inline def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _pango_reserved3 : CFuncPtr0[Unit] = struct._8
      inline def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _pango_reserved4 : CFuncPtr0[Unit] = struct._9
      inline def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates PangoFontsetClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoFontsetClass] = scala.scalanative.unsafe.alloc[PangoFontsetClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_font : CFuncPtr2[Ptr[PangoFontset], _root_.sn.gnome.glib.internal.guint, Ptr[PangoFont]], get_metrics : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoFontMetrics]], get_language : CFuncPtr1[Ptr[PangoFontset], Ptr[PangoLanguage]], foreach : CFuncPtr3[Ptr[PangoFontset], PangoFontsetForeachFunc, _root_.sn.gnome.glib.internal.gpointer, Unit], _pango_reserved1 : CFuncPtr0[Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontsetClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_font = get_font
    (!____ptr).get_metrics = get_metrics
    (!____ptr).get_language = get_language
    (!____ptr).foreach = foreach
    (!____ptr)._pango_reserved1 = _pango_reserved1
    (!____ptr)._pango_reserved2 = _pango_reserved2
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr