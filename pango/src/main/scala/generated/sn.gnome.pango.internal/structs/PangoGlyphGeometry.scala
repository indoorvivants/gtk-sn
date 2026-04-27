package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyphGeometry: : the logical width to use for the the character. _offset: horizontal offset from nominal character position. _offset: vertical offset from nominal character position.
*/
opaque type PangoGlyphGeometry = CStruct3[PangoGlyphUnit, PangoGlyphUnit, PangoGlyphUnit]

object PangoGlyphGeometry:
  given _tag: Tag[PangoGlyphGeometry] = Tag.materializeCStruct3Tag[PangoGlyphUnit, PangoGlyphUnit, PangoGlyphUnit]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoGlyphGeometry)
      inline def width : PangoGlyphUnit = struct._1
      inline def width_=(value: PangoGlyphUnit): Unit = (!struct.at1 = value)
      inline def x_offset : PangoGlyphUnit = struct._2
      inline def x_offset_=(value: PangoGlyphUnit): Unit = (!struct.at2 = value)
      inline def y_offset : PangoGlyphUnit = struct._3
      inline def y_offset_=(value: PangoGlyphUnit): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates PangoGlyphGeometry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoGlyphGeometry] = scala.scalanative.unsafe.alloc[PangoGlyphGeometry](1)
  def apply(width : PangoGlyphUnit, x_offset : PangoGlyphUnit, y_offset : PangoGlyphUnit)(using Zone): Ptr[PangoGlyphGeometry] =
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).x_offset = x_offset
    (!____ptr).y_offset = y_offset
    ____ptr