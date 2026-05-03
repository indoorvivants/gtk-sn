package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_rectangle_int_t: : X coordinate of the left side of the rectangle : Y coordinate of the top side of the rectangle : width of the rectangle : height of the rectangle
*/
opaque type cairo_rectangle_int_t = CStruct4[CInt, CInt, CInt, CInt]

object cairo_rectangle_int_t:
  given _tag: Tag[cairo_rectangle_int_t] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_rectangle_int_t)
      inline def x : CInt = struct._1
      inline def x_=(value: CInt): Unit = (!struct.at1 = value)
      inline def y : CInt = struct._2
      inline def y_=(value: CInt): Unit = (!struct.at2 = value)
      inline def width : CInt = struct._3
      inline def width_=(value: CInt): Unit = (!struct.at3 = value)
      inline def height : CInt = struct._4
      inline def height_=(value: CInt): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates cairo_rectangle_int_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_rectangle_int_t] = scala.scalanative.unsafe.alloc[cairo_rectangle_int_t](1)
  def apply(x : CInt, y : CInt, width : CInt, height : CInt)(using Zone): Ptr[cairo_rectangle_int_t] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr