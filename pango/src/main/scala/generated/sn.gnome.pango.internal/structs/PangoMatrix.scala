package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoMatrix: : 1st component of the transformation matrix : 2nd component of the transformation matrix : 3rd component of the transformation matrix : 4th component of the transformation matrix : x translation : y translation
*/
opaque type PangoMatrix = CStruct6[Double, Double, Double, Double, Double, Double]

object PangoMatrix:
  given _tag: Tag[PangoMatrix] = Tag.materializeCStruct6Tag[Double, Double, Double, Double, Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoMatrix)
      inline def xx : Double = struct._1
      inline def xx_=(value: Double): Unit = (!struct.at1 = value)
      inline def xy : Double = struct._2
      inline def xy_=(value: Double): Unit = (!struct.at2 = value)
      inline def yx : Double = struct._3
      inline def yx_=(value: Double): Unit = (!struct.at3 = value)
      inline def yy : Double = struct._4
      inline def yy_=(value: Double): Unit = (!struct.at4 = value)
      inline def x0 : Double = struct._5
      inline def x0_=(value: Double): Unit = (!struct.at5 = value)
      inline def y0 : Double = struct._6
      inline def y0_=(value: Double): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates PangoMatrix on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoMatrix] = scala.scalanative.unsafe.alloc[PangoMatrix](1)
  def apply(xx : Double, xy : Double, yx : Double, yy : Double, x0 : Double, y0 : Double)(using Zone): Ptr[PangoMatrix] =
    val ____ptr = apply()
    (!____ptr).xx = xx
    (!____ptr).xy = xy
    (!____ptr).yx = yx
    (!____ptr).yy = yy
    (!____ptr).x0 = x0
    (!____ptr).y0 = y0
    ____ptr