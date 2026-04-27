package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_matrix_t: : xx component of the affine transformation : yx component of the affine transformation : xy component of the affine transformation : yy component of the affine transformation : X translation component of the affine transformation : Y translation component of the affine transformation
*/
opaque type _cairo_matrix = CStruct6[Double, Double, Double, Double, Double, Double]

object _cairo_matrix:
  given _tag: Tag[_cairo_matrix] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_matrix)
      inline def xx : Double = struct._1
      inline def xx_=(value: Double): Unit = (!struct.at1 = value)
      inline def yx : Double = struct._2
      inline def yx_=(value: Double): Unit = (!struct.at2 = value)
      inline def xy : Double = struct._3
      inline def xy_=(value: Double): Unit = (!struct.at3 = value)
      inline def yy : Double = struct._4
      inline def yy_=(value: Double): Unit = (!struct.at4 = value)
      inline def x0 : Double = struct._5
      inline def x0_=(value: Double): Unit = (!struct.at5 = value)
      inline def y0 : Double = struct._6
      inline def y0_=(value: Double): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _cairo_matrix on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_matrix] = scala.scalanative.unsafe.alloc[_cairo_matrix](1)
  def apply(xx : Double, yx : Double, xy : Double, yy : Double, x0 : Double, y0 : Double)(using Zone): Ptr[_cairo_matrix] =
    val ____ptr = apply()
    (!____ptr).xx = xx
    (!____ptr).yx = yx
    (!____ptr).xy = xy
    (!____ptr).yy = yy
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    ____ptr