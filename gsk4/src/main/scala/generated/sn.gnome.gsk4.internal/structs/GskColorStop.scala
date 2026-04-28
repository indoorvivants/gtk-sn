package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskColorStop: : the offset of the color stop : the color at the given offset
*/
opaque type GskColorStop = CStruct2[Float, _root_.sn.gnome.gdk4.internal.GdkRGBA]

object GskColorStop:
  given _tag: Tag[GskColorStop] = Tag.materializeCStruct2Tag[Float, _root_.sn.gnome.gdk4.internal.GdkRGBA]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GskColorStop)
      inline def offset : Float = struct._1
      inline def offset_=(value: Float): Unit = (!struct.at1 = value)
      inline def color : _root_.sn.gnome.gdk4.internal.GdkRGBA = struct._2
      inline def color_=(value: _root_.sn.gnome.gdk4.internal.GdkRGBA): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GskColorStop on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GskColorStop] = scala.scalanative.unsafe.alloc[GskColorStop](1)
  def apply(offset : Float, color : _root_.sn.gnome.gdk4.internal.GdkRGBA)(using Zone): Ptr[GskColorStop] =
    val ____ptr = apply()
    (!____ptr).offset = offset
    (!____ptr).color = color
    ____ptr