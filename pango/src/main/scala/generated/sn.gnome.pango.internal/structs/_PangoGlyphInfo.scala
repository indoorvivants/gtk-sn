package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyphInfo: : the glyph itself. : the positional information about the glyph. : the visual attributes of the glyph.
*/
opaque type _PangoGlyphInfo = CStruct3[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]

object _PangoGlyphInfo:
  given _tag: Tag[_PangoGlyphInfo] = Tag.materializeCStruct3Tag[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoGlyphInfo)
      inline def glyph : PangoGlyph = struct._1
      inline def glyph_=(value: PangoGlyph): Unit = (!struct.at1 = value)
      inline def geometry : PangoGlyphGeometry = struct._2
      inline def geometry_=(value: PangoGlyphGeometry): Unit = (!struct.at2 = value)
      inline def attr : PangoGlyphVisAttr = struct._3
      inline def attr_=(value: PangoGlyphVisAttr): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _PangoGlyphInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoGlyphInfo] = scala.scalanative.unsafe.alloc[_PangoGlyphInfo](1)
  def apply(glyph : PangoGlyph, geometry : PangoGlyphGeometry, attr : PangoGlyphVisAttr)(using Zone): Ptr[_PangoGlyphInfo] =
    val ____ptr = apply()
    (!____ptr).glyph = glyph
    (!____ptr).geometry = geometry
    (!____ptr).attr = attr
    ____ptr