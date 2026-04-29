package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_rectangle_int_t: : X coordinate of the left side of the rectangle : Y coordinate of the top side of the rectangle : width of the rectangle : height of the rectangle
*/
opaque type _cairo_rectangle_int = CStruct4[CInt, CInt, CInt, CInt]

object _cairo_rectangle_int:
  given _tag: Tag[_cairo_rectangle_int] = Tag.materializeCStruct4Tag[CInt, CInt, CInt, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_rectangle_int)
      inline def x : CInt = struct._1
      inline def x_=(value: CInt): Unit = (!struct.at1 = value)
      inline def y : CInt = struct._2
      inline def y_=(value: CInt): Unit = (!struct.at2 = value)
      inline def width : CInt = struct._3
      inline def width_=(value: CInt): Unit = (!struct.at3 = value)
      inline def height : CInt = struct._4
      inline def height_=(value: CInt): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _cairo_rectangle_int on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_rectangle_int] = scala.scalanative.unsafe.alloc[_cairo_rectangle_int](1)
  def apply(x : CInt, y : CInt, width : CInt, height : CInt)(using Zone): Ptr[_cairo_rectangle_int] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr