package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_box_t:
*/
opaque type graphene_box_t = CStruct2[graphene_vec3_t, graphene_vec3_t]

object graphene_box_t:
  given _tag: Tag[graphene_box_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_vec3_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_box_t)
      inline def __graphene_private_min : graphene_vec3_t = struct._1
      inline def __graphene_private_min_=(value: graphene_vec3_t): Unit = (!struct.at1 = value)
      inline def __graphene_private_max : graphene_vec3_t = struct._2
      inline def __graphene_private_max_=(value: graphene_vec3_t): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates graphene_box_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_box_t] = scala.scalanative.unsafe.alloc[graphene_box_t](1)
  def apply(__graphene_private_min : graphene_vec3_t, __graphene_private_max : graphene_vec3_t)(using Zone): Ptr[graphene_box_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_min = __graphene_private_min
    (!____ptr).__graphene_private_max = __graphene_private_max
    ____ptr