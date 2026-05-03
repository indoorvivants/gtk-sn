package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_plane_t:
*/
opaque type graphene_plane_t = CStruct2[graphene_vec3_t, Float]

object graphene_plane_t:
  given _tag: Tag[graphene_plane_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_plane_t)
      inline def __graphene_private_normal : graphene_vec3_t = struct._1
      inline def __graphene_private_normal_=(value: graphene_vec3_t): Unit = (!struct.at1 = value)
      inline def __graphene_private_constant : Float = struct._2
      inline def __graphene_private_constant_=(value: Float): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates graphene_plane_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_plane_t] = scala.scalanative.unsafe.alloc[graphene_plane_t](1)
  def apply(__graphene_private_normal : graphene_vec3_t, __graphene_private_constant : Float)(using Zone): Ptr[graphene_plane_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_normal = __graphene_private_normal
    (!____ptr).__graphene_private_constant = __graphene_private_constant
    ____ptr