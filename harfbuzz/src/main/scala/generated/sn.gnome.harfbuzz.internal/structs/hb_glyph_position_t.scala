package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_glyph_position_t: _advance: how much the line advances after drawing this glyph when setting text in horizontal direction. _advance: how much the line advances after drawing this glyph when setting text in vertical direction. _offset: how much the glyph moves on the X-axis before drawing it, this should not affect how much the line advances. _offset: how much the glyph moves on the Y-axis before drawing it, this should not affect how much the line advances.
*/
opaque type hb_glyph_position_t = CStruct5[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_var_int_t]

object hb_glyph_position_t:
  given _tag: Tag[hb_glyph_position_t] = Tag.materializeCStruct5Tag[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_var_int_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_glyph_position_t)
      inline def x_advance : hb_position_t = struct._1
      inline def x_advance_=(value: hb_position_t): Unit = (!struct.at1 = value)
      inline def y_advance : hb_position_t = struct._2
      inline def y_advance_=(value: hb_position_t): Unit = (!struct.at2 = value)
      inline def x_offset : hb_position_t = struct._3
      inline def x_offset_=(value: hb_position_t): Unit = (!struct.at3 = value)
      inline def y_offset : hb_position_t = struct._4
      inline def y_offset_=(value: hb_position_t): Unit = (!struct.at4 = value)
      inline def `var` : hb_var_int_t = struct._5
      inline def var_=(value: hb_var_int_t): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates hb_glyph_position_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_glyph_position_t] = scala.scalanative.unsafe.alloc[hb_glyph_position_t](1)
  def apply(x_advance : hb_position_t, y_advance : hb_position_t, x_offset : hb_position_t, y_offset : hb_position_t, `var` : hb_var_int_t)(using Zone): Ptr[hb_glyph_position_t] =
    val ____ptr = apply()
    (!____ptr).x_advance = x_advance
    (!____ptr).y_advance = y_advance
    (!____ptr).x_offset = x_offset
    (!____ptr).y_offset = y_offset
    (!____ptr).`var` = `var`
    ____ptr