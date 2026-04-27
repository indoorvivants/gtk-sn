package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_triangle_t:
*/
opaque type graphene_triangle_t = CStruct3[graphene_vec3_t, graphene_vec3_t, graphene_vec3_t]

object graphene_triangle_t:
  given _tag: Tag[graphene_triangle_t] = Tag.materializeCStruct3Tag[graphene_vec3_t, graphene_vec3_t, graphene_vec3_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_triangle_t)
      inline def __graphene_private_a : graphene_vec3_t = struct._1
      inline def __graphene_private_a_=(value: graphene_vec3_t): Unit = (!struct.at1 = value)
      inline def __graphene_private_b : graphene_vec3_t = struct._2
      inline def __graphene_private_b_=(value: graphene_vec3_t): Unit = (!struct.at2 = value)
      inline def __graphene_private_c : graphene_vec3_t = struct._3
      inline def __graphene_private_c_=(value: graphene_vec3_t): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates graphene_triangle_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_triangle_t] = scala.scalanative.unsafe.alloc[graphene_triangle_t](1)
  def apply(__graphene_private_a : graphene_vec3_t, __graphene_private_b : graphene_vec3_t, __graphene_private_c : graphene_vec3_t)(using Zone): Ptr[graphene_triangle_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_a = __graphene_private_a
    (!____ptr).__graphene_private_b = __graphene_private_b
    (!____ptr).__graphene_private_c = __graphene_private_c
    ____ptr