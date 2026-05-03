package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoRendererClass: _glyphs: draws a `PangoGlyphString` _rectangle: draws a rectangle _error_underline: draws a squiggly line that approximately covers the given rectangle in the style of an underline used to indicate a spelling error. _shape: draw content for a glyph shaped with `PangoAttrShape` , are the coordinates of the left edge of the baseline, in user coordinates. _trapezoid: draws a trapezoidal filled area _glyph: draws a single glyph
*/
opaque type PangoRendererClass = CStruct15[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object PangoRendererClass:
  given _tag: Tag[PangoRendererClass] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit], CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr1[Ptr[PangoRenderer], Unit], CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit], CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoRendererClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit] = struct._2
      inline def draw_glyphs_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit]): Unit = (!struct.at2 = value)
      inline def draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit] = struct._3
      inline def draw_rectangle_=(value: CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit]): Unit = (!struct.at3 = value)
      inline def draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit] = struct._4
      inline def draw_error_underline_=(value: CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit]): Unit = (!struct.at4 = value)
      inline def draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit] = struct._5.asInstanceOf[CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit]]
      inline def draw_shape_=(value: CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit]): Unit = (!struct.at5 = value.asInstanceOf[CFuncPtr4[Ptr[PangoRenderer], Ptr[Byte], CInt, CInt, Unit]])
      inline def draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit] = struct._6
      inline def draw_trapezoid_=(value: CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit]): Unit = (!struct.at6 = value)
      inline def draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit] = struct._7
      inline def draw_glyph_=(value: CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit]): Unit = (!struct.at7 = value)
      inline def part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit] = struct._8
      inline def part_changed_=(value: CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit]): Unit = (!struct.at8 = value)
      inline def begin : CFuncPtr1[Ptr[PangoRenderer], Unit] = struct._9
      inline def begin_=(value: CFuncPtr1[Ptr[PangoRenderer], Unit]): Unit = (!struct.at9 = value)
      inline def end : CFuncPtr1[Ptr[PangoRenderer], Unit] = struct._10
      inline def end_=(value: CFuncPtr1[Ptr[PangoRenderer], Unit]): Unit = (!struct.at10 = value)
      inline def prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit] = struct._11.asInstanceOf[CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit]]
      inline def prepare_run_=(value: CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit]): Unit = (!struct.at11 = value.asInstanceOf[CFuncPtr2[Ptr[PangoRenderer], Ptr[Byte], Unit]])
      inline def draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit] = struct._12.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit]]
      inline def draw_glyph_item_=(value: CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit]): Unit = (!struct.at12 = value.asInstanceOf[CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[Byte], CInt, CInt, Unit]])
      inline def _pango_reserved2 : CFuncPtr0[Unit] = struct._13
      inline def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at13 = value)
      inline def _pango_reserved3 : CFuncPtr0[Unit] = struct._14
      inline def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at14 = value)
      inline def _pango_reserved4 : CFuncPtr0[Unit] = struct._15
      inline def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates PangoRendererClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoRendererClass] = scala.scalanative.unsafe.alloc[PangoRendererClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, draw_glyphs : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], Ptr[PangoGlyphString], CInt, CInt, Unit], draw_rectangle : CFuncPtr6[Ptr[PangoRenderer], PangoRenderPart, CInt, CInt, CInt, CInt, Unit], draw_error_underline : CFuncPtr5[Ptr[PangoRenderer], CInt, CInt, CInt, CInt, Unit], draw_shape : CFuncPtr4[Ptr[PangoRenderer], Ptr[PangoAttrShape], CInt, CInt, Unit], draw_trapezoid : CFuncPtr8[Ptr[PangoRenderer], PangoRenderPart, Double, Double, Double, Double, Double, Double, Unit], draw_glyph : CFuncPtr5[Ptr[PangoRenderer], Ptr[PangoFont], PangoGlyph, Double, Double, Unit], part_changed : CFuncPtr2[Ptr[PangoRenderer], PangoRenderPart, Unit], begin : CFuncPtr1[Ptr[PangoRenderer], Unit], end : CFuncPtr1[Ptr[PangoRenderer], Unit], prepare_run : CFuncPtr2[Ptr[PangoRenderer], Ptr[PangoLayoutRun], Unit], draw_glyph_item : CFuncPtr5[Ptr[PangoRenderer], CString, Ptr[PangoGlyphItem], CInt, CInt, Unit], _pango_reserved2 : CFuncPtr0[Unit], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoRendererClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).draw_glyphs = draw_glyphs
    (!____ptr).draw_rectangle = draw_rectangle
    (!____ptr).draw_error_underline = draw_error_underline
    (!____ptr).draw_shape = draw_shape
    (!____ptr).draw_trapezoid = draw_trapezoid
    (!____ptr).draw_glyph = draw_glyph
    (!____ptr).part_changed = part_changed
    (!____ptr).begin = begin
    (!____ptr).end = end
    (!____ptr).prepare_run = prepare_run
    (!____ptr).draw_glyph_item = draw_glyph_item
    (!____ptr)._pango_reserved2 = _pango_reserved2
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr