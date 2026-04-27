package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_point3d_t: : the X coordinate : the Y coordinate : the Z coordinate
*/
opaque type _graphene_point3d_t = CStruct3[Float, Float, Float]

object _graphene_point3d_t:
  given _tag: Tag[_graphene_point3d_t] = Tag.materializeCStruct3Tag[Float, Float, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _graphene_point3d_t)
      inline def x : Float = struct._1
      inline def x_=(value: Float): Unit = (!struct.at1 = value)
      inline def y : Float = struct._2
      inline def y_=(value: Float): Unit = (!struct.at2 = value)
      inline def z : Float = struct._3
      inline def z_=(value: Float): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _graphene_point3d_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_graphene_point3d_t] = scala.scalanative.unsafe.alloc[_graphene_point3d_t](1)
  def apply(x : Float, y : Float, z : Float)(using Zone): Ptr[_graphene_point3d_t] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    (!____ptr).z = z
    ____ptr