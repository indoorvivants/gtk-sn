package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_text_extents_t: _bearing: the horizontal distance from the origin to the leftmost part of the glyphs as drawn. Positive if the glyphs lie entirely to the right of the origin. _bearing: the vertical distance from the origin to the topmost part of the glyphs as drawn. Positive only if the glyphs lie completely below the origin; will usually be negative. : width of the glyphs as drawn : height of the glyphs as drawn _advance:distance to advance in the X direction after drawing these glyphs _advance: distance to advance in the Y direction after drawing these glyphs. Will typically be zero except for vertical text layout as found in East-Asian languages.
*/
opaque type cairo_text_extents_t = CStruct6[Double, Double, Double, Double, Double, Double]

object cairo_text_extents_t:
  given _tag: Tag[cairo_text_extents_t] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_text_extents_t)
      inline def x_bearing : Double = struct._1
      inline def x_bearing_=(value: Double): Unit = (!struct.at1 = value)
      inline def y_bearing : Double = struct._2
      inline def y_bearing_=(value: Double): Unit = (!struct.at2 = value)
      inline def width : Double = struct._3
      inline def width_=(value: Double): Unit = (!struct.at3 = value)
      inline def height : Double = struct._4
      inline def height_=(value: Double): Unit = (!struct.at4 = value)
      inline def x_advance : Double = struct._5
      inline def x_advance_=(value: Double): Unit = (!struct.at5 = value)
      inline def y_advance : Double = struct._6
      inline def y_advance_=(value: Double): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates cairo_text_extents_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_text_extents_t] = scala.scalanative.unsafe.alloc[cairo_text_extents_t](1)
  def apply(x_bearing : Double, y_bearing : Double, width : Double, height : Double, x_advance : Double, y_advance : Double)(using Zone): Ptr[cairo_text_extents_t] =
    val ____ptr = apply()
    (!____ptr).x_bearing = x_bearing
    (!____ptr).y_bearing = y_bearing
    (!____ptr).width = width
    (!____ptr).height = height
    (!____ptr).x_advance = x_advance
    (!____ptr).y_advance = y_advance
    ____ptr