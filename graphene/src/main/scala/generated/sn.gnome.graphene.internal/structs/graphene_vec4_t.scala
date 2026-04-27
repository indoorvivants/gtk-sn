package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_vec4_t:
*/
opaque type graphene_vec4_t = CStruct1[graphene_simd4f_t]

object graphene_vec4_t:
  given _tag: Tag[graphene_vec4_t] = Tag.materializeCStruct1Tag[graphene_simd4f_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_vec4_t)
      inline def __graphene_private_value : graphene_simd4f_t = struct._1
      inline def __graphene_private_value_=(value: graphene_simd4f_t): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates graphene_vec4_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_vec4_t] = scala.scalanative.unsafe.alloc[graphene_vec4_t](1)
  def apply(__graphene_private_value : graphene_simd4f_t)(using Zone): Ptr[graphene_vec4_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr