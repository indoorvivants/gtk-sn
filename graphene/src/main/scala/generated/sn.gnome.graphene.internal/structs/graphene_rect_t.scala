package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_rect_t: : the coordinates of the origin of the rectangle : the size of the rectangle
*/
opaque type graphene_rect_t = CStruct2[graphene_point_t, graphene_size_t]

object graphene_rect_t:
  given _tag: Tag[graphene_rect_t] = Tag.materializeCStruct2Tag[graphene_point_t, graphene_size_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_rect_t)
      inline def origin : graphene_point_t = struct._1
      inline def origin_=(value: graphene_point_t): Unit = (!struct.at1 = value)
      inline def size : graphene_size_t = struct._2
      inline def size_=(value: graphene_size_t): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates graphene_rect_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_rect_t] = scala.scalanative.unsafe.alloc[graphene_rect_t](1)
  def apply(origin : graphene_point_t, size : graphene_size_t)(using Zone): Ptr[graphene_rect_t] =
    val ____ptr = apply()
    (!____ptr).origin = origin
    (!____ptr).size = size
    ____ptr