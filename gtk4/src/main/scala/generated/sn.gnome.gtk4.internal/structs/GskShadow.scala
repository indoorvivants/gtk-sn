package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskShadow: : the color of the shadow : the horizontal offset of the shadow : the vertical offset of the shadow : the radius of the shadow
*/
opaque type GskShadow = CStruct4[GdkRGBA, Float, Float, Float]

object GskShadow:
  given _tag: Tag[GskShadow] = Tag.materializeCStruct4Tag[GdkRGBA, Float, Float, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GskShadow)
      inline def color : GdkRGBA = struct._1
      inline def color_=(value: GdkRGBA): Unit = (!struct.at1 = value)
      inline def dx : Float = struct._2
      inline def dx_=(value: Float): Unit = (!struct.at2 = value)
      inline def dy : Float = struct._3
      inline def dy_=(value: Float): Unit = (!struct.at3 = value)
      inline def radius : Float = struct._4
      inline def radius_=(value: Float): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GskShadow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GskShadow] = scala.scalanative.unsafe.alloc[GskShadow](1)
  def apply(color : GdkRGBA, dx : Float, dy : Float, radius : Float)(using Zone): Ptr[GskShadow] =
    val ____ptr = apply()
    (!____ptr).color = color
    (!____ptr).dx = dx
    (!____ptr).dy = dy
    (!____ptr).radius = radius
    ____ptr