package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_extents_t: : the distance that the font extends above the baseline. Note that this is not always exactly equal to the maximum of the extents of all the glyphs in the font, but rather is picked to express the font designer's intent as to how the font should align with elements above it. : the distance that the font extends below the baseline. This value is positive for typical fonts that include portions below the baseline. Note that this is not always exactly equal to the maximum of the extents of all the glyphs in the font, but rather is picked to express the font designer's intent as to how the font should align with elements below it. : the recommended vertical distance between baselines when setting consecutive lines of text with the font. This is greater than + by a quantity known as the <firstterm>line spacing</firstterm> or <firstterm>external leading</firstterm>. When space is at a premium, most fonts can be set with only a distance of + between lines. _x_advance: the maximum distance in the X direction that the origin is advanced for any glyph in the font. _y_advance: the maximum distance in the Y direction that the origin is advanced for any glyph in the font. This will be zero for normal fonts used for horizontal writing. (The scripts of East Asia are sometimes written vertically.)
*/
opaque type cairo_font_extents_t = CStruct5[Double, Double, Double, Double, Double]

object cairo_font_extents_t:
  given _tag: Tag[cairo_font_extents_t] = Tag.materializeCStruct5Tag[Double, Double, Double, Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_font_extents_t)
      inline def ascent : Double = struct._1
      inline def ascent_=(value: Double): Unit = (!struct.at1 = value)
      inline def descent : Double = struct._2
      inline def descent_=(value: Double): Unit = (!struct.at2 = value)
      inline def height : Double = struct._3
      inline def height_=(value: Double): Unit = (!struct.at3 = value)
      inline def max_x_advance : Double = struct._4
      inline def max_x_advance_=(value: Double): Unit = (!struct.at4 = value)
      inline def max_y_advance : Double = struct._5
      inline def max_y_advance_=(value: Double): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates cairo_font_extents_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_font_extents_t] = scala.scalanative.unsafe.alloc[cairo_font_extents_t](1)
  def apply(ascent : Double, descent : Double, height : Double, max_x_advance : Double, max_y_advance : Double)(using Zone): Ptr[cairo_font_extents_t] =
    val ____ptr = apply()
    (!____ptr).ascent = ascent
    (!____ptr).descent = descent
    (!____ptr).height = height
    (!____ptr).max_x_advance = max_x_advance
    (!____ptr).max_y_advance = max_y_advance
    ____ptr