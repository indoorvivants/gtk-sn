package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_sphere_t:
*/
opaque type graphene_sphere_t = CStruct2[graphene_vec3_t, Float]

object graphene_sphere_t:
  given _tag: Tag[graphene_sphere_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_sphere_t)
      inline def __graphene_private_center : graphene_vec3_t = struct._1
      inline def __graphene_private_center_=(value: graphene_vec3_t): Unit = (!struct.at1 = value)
      inline def __graphene_private_radius : Float = struct._2
      inline def __graphene_private_radius_=(value: Float): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates graphene_sphere_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_sphere_t] = scala.scalanative.unsafe.alloc[graphene_sphere_t](1)
  def apply(__graphene_private_center : graphene_vec3_t, __graphene_private_radius : Float)(using Zone): Ptr[graphene_sphere_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_center = __graphene_private_center
    (!____ptr).__graphene_private_radius = __graphene_private_radius
    ____ptr