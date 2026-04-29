package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_glyph_extents_t: _bearing: Distance from the x-origin to the left extremum of the glyph. _bearing: Distance from the top extremum of the glyph to the y-origin. : Distance from the left extremum of the glyph to the right extremum. : Distance from the top extremum of the glyph to the bottom extremum.
*/
opaque type hb_glyph_extents_t = CStruct4[hb_position_t, hb_position_t, hb_position_t, hb_position_t]

object hb_glyph_extents_t:
  given _tag: Tag[hb_glyph_extents_t] = Tag.materializeCStruct4Tag[hb_position_t, hb_position_t, hb_position_t, hb_position_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_glyph_extents_t)
      inline def x_bearing : hb_position_t = struct._1
      inline def x_bearing_=(value: hb_position_t): Unit = (!struct.at1 = value)
      inline def y_bearing : hb_position_t = struct._2
      inline def y_bearing_=(value: hb_position_t): Unit = (!struct.at2 = value)
      inline def width : hb_position_t = struct._3
      inline def width_=(value: hb_position_t): Unit = (!struct.at3 = value)
      inline def height : hb_position_t = struct._4
      inline def height_=(value: hb_position_t): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates hb_glyph_extents_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_glyph_extents_t] = scala.scalanative.unsafe.alloc[hb_glyph_extents_t](1)
  def apply(x_bearing : hb_position_t, y_bearing : hb_position_t, width : hb_position_t, height : hb_position_t)(using Zone): Ptr[hb_glyph_extents_t] =
    val ____ptr = apply()
    (!____ptr).x_bearing = x_bearing
    (!____ptr).y_bearing = y_bearing
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr