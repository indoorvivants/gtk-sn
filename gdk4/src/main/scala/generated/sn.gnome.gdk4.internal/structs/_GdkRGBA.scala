package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GdkRGBA = CStruct4[Float, Float, Float, Float]

object _GdkRGBA:
  given _tag: Tag[_GdkRGBA] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkRGBA)
      inline def red : Float = struct._1
      inline def red_=(value: Float): Unit = (!struct.at1 = value)
      inline def green : Float = struct._2
      inline def green_=(value: Float): Unit = (!struct.at2 = value)
      inline def blue : Float = struct._3
      inline def blue_=(value: Float): Unit = (!struct.at3 = value)
      inline def alpha : Float = struct._4
      inline def alpha_=(value: Float): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GdkRGBA on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkRGBA] = scala.scalanative.unsafe.alloc[_GdkRGBA](1)
  def apply(red : Float, green : Float, blue : Float, alpha : Float)(using Zone): Ptr[_GdkRGBA] =
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    (!____ptr).alpha = alpha
    ____ptr