package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngineShapeClass: _shape: Given a font, a piece of text, and a `PangoAnalysis` structure, converts characters to glyphs and positions the resulting glyphs. The results are stored in the `PangoGlyphString` that is passed in. (The implementation should resize it appropriately using pango_glyph_string_set_size()). All fields of the _clusters and array must be filled in, with the exception that Pango will automatically generate `glyphs->glyphs[i].attr.is_cluster_start` using the _clusters array. Each input character must occur in one of the output logical clusters; if no rendering is desired for a character, this may involve inserting glyphs with the `PangoGlyph` ID %PANGO_GLYPH_EMPTY, which is guaranteed never to render. If the shaping fails for any reason, the shaper should return with an empty (zero-size) glyph string. If the shaper has not set the size on the glyph string yet, simply returning signals the failure too. : Returns the characters that this engine can cover with a given font for a given language. If not overridden, the default implementation simply returns the coverage information for the font itself unmodified.
*/
opaque type PangoEngineShapeClass = CStruct3[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]]

object PangoEngineShapeClass:
  given _tag: Tag[PangoEngineShapeClass] = Tag.materializeCStruct3Tag[PangoEngineClass, CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoEngineShapeClass)
      inline def parent_class : PangoEngineClass = struct._1
      inline def parent_class_=(value: PangoEngineClass): Unit = (!struct.at1 = value)
      inline def script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit] = struct._2.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]]
      inline def script_shape_=(value: CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[Byte], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit]])
      inline def covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel] = struct._3
      inline def covers_=(value: CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates PangoEngineShapeClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoEngineShapeClass] = scala.scalanative.unsafe.alloc[PangoEngineShapeClass](1)
  def apply(parent_class : PangoEngineClass, script_shape : CFuncPtr8[Ptr[PangoEngineShape], Ptr[PangoFont], CString, CUnsignedInt, Ptr[PangoAnalysis], Ptr[PangoGlyphString], CString, CUnsignedInt, Unit], covers : CFuncPtr4[Ptr[PangoEngineShape], Ptr[PangoFont], Ptr[PangoLanguage], _root_.sn.gnome.glib.internal.gunichar, PangoCoverageLevel])(using Zone): Ptr[PangoEngineShapeClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_shape = script_shape
    (!____ptr).covers = covers
    ____ptr