package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_rectangle_list_t: : Error status of the rectangle list : Array containing the rectangles
*/
opaque type cairo_rectangle_list_t = CStruct3[cairo_status_t, Ptr[cairo_rectangle_t], CInt]

object cairo_rectangle_list_t:
  given _tag: Tag[cairo_rectangle_list_t] = Tag.materializeCStruct3Tag[cairo_status_t, Ptr[cairo_rectangle_t], CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: cairo_rectangle_list_t)
      inline def status : cairo_status_t = struct._1
      inline def status_=(value: cairo_status_t): Unit = (!struct.at1 = value)
      inline def rectangles : Ptr[cairo_rectangle_t] = struct._2
      inline def rectangles_=(value: Ptr[cairo_rectangle_t]): Unit = (!struct.at2 = value)
      inline def num_rectangles : CInt = struct._3
      inline def num_rectangles_=(value: CInt): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates cairo_rectangle_list_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[cairo_rectangle_list_t] = scala.scalanative.unsafe.alloc[cairo_rectangle_list_t](1)
  def apply(status : cairo_status_t, rectangles : Ptr[cairo_rectangle_t], num_rectangles : CInt)(using Zone): Ptr[cairo_rectangle_list_t] =
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).rectangles = rectangles
    (!____ptr).num_rectangles = num_rectangles
    ____ptr