package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_point_t: : the X coordinate of the point : the Y coordinate of the point
*/
opaque type _graphene_point_t = CStruct2[Float, Float]

object _graphene_point_t:
  given _tag: Tag[_graphene_point_t] = Tag.materializeCStruct2Tag[Float, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _graphene_point_t)
      inline def x : Float = struct._1
      inline def x_=(value: Float): Unit = (!struct.at1 = value)
      inline def y : Float = struct._2
      inline def y_=(value: Float): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _graphene_point_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_graphene_point_t] = scala.scalanative.unsafe.alloc[_graphene_point_t](1)
  def apply(x : Float, y : Float)(using Zone): Ptr[_graphene_point_t] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr