package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_color_stop_t: : the offset of the color stop : the color, unpremultiplied
*/
opaque type hb_color_stop_t = CStruct3[Float, hb_bool_t, hb_color_t]

object hb_color_stop_t:
  given _tag: Tag[hb_color_stop_t] = Tag.materializeCStruct3Tag[Float, hb_bool_t, hb_color_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_color_stop_t)
      inline def offset : Float = struct._1
      inline def offset_=(value: Float): Unit = (!struct.at1 = value)
      inline def is_foreground : hb_bool_t = struct._2
      inline def is_foreground_=(value: hb_bool_t): Unit = (!struct.at2 = value)
      inline def color : hb_color_t = struct._3
      inline def color_=(value: hb_color_t): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates hb_color_stop_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_color_stop_t] = scala.scalanative.unsafe.alloc[hb_color_stop_t](1)
  def apply(offset : Float, is_foreground : hb_bool_t, color : hb_color_t)(using Zone): Ptr[hb_color_stop_t] =
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).is_foreground = is_foreground
    (!____ptr).color = color
    ____ptr