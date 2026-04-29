package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_extents_t: : The height of typographic ascenders. : The depth of typographic descenders.
*/
opaque type hb_font_extents_t = CStruct12[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t]

object hb_font_extents_t:
  given _tag: Tag[hb_font_extents_t] = Tag.materializeCStruct12Tag[hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t, hb_position_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_font_extents_t)
      inline def ascender : hb_position_t = struct._1
      inline def ascender_=(value: hb_position_t): Unit = (!struct.at1 = value)
      inline def descender : hb_position_t = struct._2
      inline def descender_=(value: hb_position_t): Unit = (!struct.at2 = value)
      inline def line_gap : hb_position_t = struct._3
      inline def line_gap_=(value: hb_position_t): Unit = (!struct.at3 = value)
      inline def reserved9 : hb_position_t = struct._4
      inline def reserved9_=(value: hb_position_t): Unit = (!struct.at4 = value)
      inline def reserved8 : hb_position_t = struct._5
      inline def reserved8_=(value: hb_position_t): Unit = (!struct.at5 = value)
      inline def reserved7 : hb_position_t = struct._6
      inline def reserved7_=(value: hb_position_t): Unit = (!struct.at6 = value)
      inline def reserved6 : hb_position_t = struct._7
      inline def reserved6_=(value: hb_position_t): Unit = (!struct.at7 = value)
      inline def reserved5 : hb_position_t = struct._8
      inline def reserved5_=(value: hb_position_t): Unit = (!struct.at8 = value)
      inline def reserved4 : hb_position_t = struct._9
      inline def reserved4_=(value: hb_position_t): Unit = (!struct.at9 = value)
      inline def reserved3 : hb_position_t = struct._10
      inline def reserved3_=(value: hb_position_t): Unit = (!struct.at10 = value)
      inline def reserved2 : hb_position_t = struct._11
      inline def reserved2_=(value: hb_position_t): Unit = (!struct.at11 = value)
      inline def reserved1 : hb_position_t = struct._12
      inline def reserved1_=(value: hb_position_t): Unit = (!struct.at12 = value)
    end extension
  
  // Allocates hb_font_extents_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_font_extents_t] = scala.scalanative.unsafe.alloc[hb_font_extents_t](1)
  def apply(ascender : hb_position_t, descender : hb_position_t, line_gap : hb_position_t, reserved9 : hb_position_t, reserved8 : hb_position_t, reserved7 : hb_position_t, reserved6 : hb_position_t, reserved5 : hb_position_t, reserved4 : hb_position_t, reserved3 : hb_position_t, reserved2 : hb_position_t, reserved1 : hb_position_t)(using Zone): Ptr[hb_font_extents_t] =
    val ____ptr = apply()
    (!____ptr).ascender = ascender
    (!____ptr).descender = descender
    (!____ptr).line_gap = line_gap
    (!____ptr).reserved9 = reserved9
    (!____ptr).reserved8 = reserved8
    (!____ptr).reserved7 = reserved7
    (!____ptr).reserved6 = reserved6
    (!____ptr).reserved5 = reserved5
    (!____ptr).reserved4 = reserved4
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved1 = reserved1
    ____ptr