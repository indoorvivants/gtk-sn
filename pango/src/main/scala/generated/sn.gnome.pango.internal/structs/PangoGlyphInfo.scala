package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyphInfo: : the glyph itself. : the positional information about the glyph. : the visual attributes of the glyph.
*/
opaque type PangoGlyphInfo = CStruct3[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]

object PangoGlyphInfo:
  given _tag: Tag[PangoGlyphInfo] = Tag.materializeCStruct3Tag[PangoGlyph, PangoGlyphGeometry, PangoGlyphVisAttr]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoGlyphInfo)
      inline def glyph : PangoGlyph = struct._1
      inline def glyph_=(value: PangoGlyph): Unit = (!struct.at1 = value)
      inline def geometry : PangoGlyphGeometry = struct._2
      inline def geometry_=(value: PangoGlyphGeometry): Unit = (!struct.at2 = value)
      inline def attr : PangoGlyphVisAttr = struct._3
      inline def attr_=(value: PangoGlyphVisAttr): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates PangoGlyphInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoGlyphInfo] = scala.scalanative.unsafe.alloc[PangoGlyphInfo](1)
  def apply(glyph : PangoGlyph, geometry : PangoGlyphGeometry, attr : PangoGlyphVisAttr)(using Zone): Ptr[PangoGlyphInfo] =
    val ____ptr = apply()
    (!____ptr).glyph = glyph
    (!____ptr).geometry = geometry
    (!____ptr).attr = attr
    ____ptr