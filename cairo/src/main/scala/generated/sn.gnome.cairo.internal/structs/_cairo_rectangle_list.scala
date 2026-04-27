package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_rectangle_list_t: : Error status of the rectangle list : Array containing the rectangles
*/
opaque type _cairo_rectangle_list = CStruct3[cairo_status_t, Ptr[cairo_rectangle_t], CInt]

object _cairo_rectangle_list:
  given _tag: Tag[_cairo_rectangle_list] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_rectangle_t], CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_rectangle_list)
      inline def status : cairo_status_t = struct._1
      inline def status_=(value: cairo_status_t): Unit = (!struct.at1 = value)
      inline def rectangles : Ptr[cairo_rectangle_t] = struct._2
      inline def rectangles_=(value: Ptr[cairo_rectangle_t]): Unit = (!struct.at2 = value)
      inline def num_rectangles : CInt = struct._3
      inline def num_rectangles_=(value: CInt): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _cairo_rectangle_list on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_rectangle_list] = scala.scalanative.unsafe.alloc[_cairo_rectangle_list](1)
  def apply(status : cairo_status_t, rectangles : Ptr[cairo_rectangle_t], num_rectangles : CInt)(using Zone): Ptr[_cairo_rectangle_list] =
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).rectangles = rectangles
    (!____ptr).num_rectangles = num_rectangles
    ____ptr