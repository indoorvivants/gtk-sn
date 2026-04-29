package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_rectangle_t: : X coordinate of the left side of the rectangle : Y coordinate of the top side of the rectangle : width of the rectangle : height of the rectangle
*/
opaque type _cairo_rectangle = CStruct4[Double, Double, Double, Double]

object _cairo_rectangle:
  given _tag: Tag[_cairo_rectangle] = Tag.materializeCStruct4Tag[Double, Double, Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_rectangle)
      inline def x : Double = struct._1
      inline def x_=(value: Double): Unit = (!struct.at1 = value)
      inline def y : Double = struct._2
      inline def y_=(value: Double): Unit = (!struct.at2 = value)
      inline def width : Double = struct._3
      inline def width_=(value: Double): Unit = (!struct.at3 = value)
      inline def height : Double = struct._4
      inline def height_=(value: Double): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _cairo_rectangle on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_rectangle] = scala.scalanative.unsafe.alloc[_cairo_rectangle](1)
  def apply(x : Double, y : Double, width : Double, height : Double)(using Zone): Ptr[_cairo_rectangle] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr