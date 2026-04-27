package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoFontMetrics = CStruct10[_root_.sn.gnome.glib.internal.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]

object PangoFontMetrics:
  given _tag: Tag[PangoFontMetrics] = Tag.materializeCStruct10Tag[_root_.sn.gnome.glib.internal.guint, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoFontMetrics)
      inline def ref_count : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def ascent : CInt = struct._2
      inline def ascent_=(value: CInt): Unit = (!struct.at2 = value)
      inline def descent : CInt = struct._3
      inline def descent_=(value: CInt): Unit = (!struct.at3 = value)
      inline def height : CInt = struct._4
      inline def height_=(value: CInt): Unit = (!struct.at4 = value)
      inline def approximate_char_width : CInt = struct._5
      inline def approximate_char_width_=(value: CInt): Unit = (!struct.at5 = value)
      inline def approximate_digit_width : CInt = struct._6
      inline def approximate_digit_width_=(value: CInt): Unit = (!struct.at6 = value)
      inline def underline_position : CInt = struct._7
      inline def underline_position_=(value: CInt): Unit = (!struct.at7 = value)
      inline def underline_thickness : CInt = struct._8
      inline def underline_thickness_=(value: CInt): Unit = (!struct.at8 = value)
      inline def strikethrough_position : CInt = struct._9
      inline def strikethrough_position_=(value: CInt): Unit = (!struct.at9 = value)
      inline def strikethrough_thickness : CInt = struct._10
      inline def strikethrough_thickness_=(value: CInt): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates PangoFontMetrics on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoFontMetrics] = scala.scalanative.unsafe.alloc[PangoFontMetrics](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.guint, ascent : CInt, descent : CInt, height : CInt, approximate_char_width : CInt, approximate_digit_width : CInt, underline_position : CInt, underline_thickness : CInt, strikethrough_position : CInt, strikethrough_thickness : CInt)(using Zone): Ptr[PangoFontMetrics] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).ascent = ascent
    (!____ptr).descent = descent
    (!____ptr).height = height
    (!____ptr).approximate_char_width = approximate_char_width
    (!____ptr).approximate_digit_width = approximate_digit_width
    (!____ptr).underline_position = underline_position
    (!____ptr).underline_thickness = underline_thickness
    (!____ptr).strikethrough_position = strikethrough_position
    (!____ptr).strikethrough_thickness = strikethrough_thickness
    ____ptr