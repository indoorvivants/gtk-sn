package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_ray_t:
*/
opaque type _graphene_ray_t = CStruct2[graphene_vec3_t, graphene_vec3_t]

object _graphene_ray_t:
  given _tag: Tag[_graphene_ray_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_vec3_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _graphene_ray_t)
      inline def __graphene_private_origin : graphene_vec3_t = struct._1
      inline def __graphene_private_origin_=(value: graphene_vec3_t): Unit = (!struct.at1 = value)
      inline def __graphene_private_direction : graphene_vec3_t = struct._2
      inline def __graphene_private_direction_=(value: graphene_vec3_t): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _graphene_ray_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_graphene_ray_t] = scala.scalanative.unsafe.alloc[_graphene_ray_t](1)
  def apply(__graphene_private_origin : graphene_vec3_t, __graphene_private_direction : graphene_vec3_t)(using Zone): Ptr[_graphene_ray_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_origin = __graphene_private_origin
    (!____ptr).__graphene_private_direction = __graphene_private_direction
    ____ptr