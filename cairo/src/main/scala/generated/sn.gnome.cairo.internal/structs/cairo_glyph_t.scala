package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_glyph_t: : glyph index in the font. The exact interpretation of the glyph index depends on the font technology being used. : the offset in the X direction between the origin used for drawing or measuring the string and the origin of this glyph. : the offset in the Y direction between the origin used for drawing or measuring the string and the origin of this glyph.
*/
opaque type cairo_glyph_t = CStruct3[CUnsignedLongInt, Double, Double]

object cairo_glyph_t:
  given _tag: Tag[cairo_glyph_t] = Tag.materializeCStruct3Tag[CUnsignedLongInt, Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_glyph_t)
      inline def index : CUnsignedLongInt = struct._1
      inline def index_=(value: CUnsignedLongInt): Unit = (!struct.at1 = value)
      inline def x : Double = struct._2
      inline def x_=(value: Double): Unit = (!struct.at2 = value)
      inline def y : Double = struct._3
      inline def y_=(value: Double): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates cairo_glyph_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_glyph_t] = scala.scalanative.unsafe.alloc[cairo_glyph_t](1)
  def apply(index : CUnsignedLongInt, x : Double, y : Double)(using Zone): Ptr[cairo_glyph_t] =
    val ____ptr = apply()
    (!____ptr).index = index
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr