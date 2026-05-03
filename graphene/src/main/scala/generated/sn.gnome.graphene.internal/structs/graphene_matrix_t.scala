package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_matrix_t:
*/
opaque type graphene_matrix_t = CStruct1[graphene_simd4x4f_t]

object graphene_matrix_t:
  given _tag: Tag[graphene_matrix_t] = Tag.materializeCStruct1Tag[graphene_simd4x4f_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_matrix_t)
      inline def __graphene_private_value : graphene_simd4x4f_t = struct._1
      inline def __graphene_private_value_=(value: graphene_simd4x4f_t): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates graphene_matrix_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_matrix_t] = scala.scalanative.unsafe.alloc[graphene_matrix_t](1)
  def apply(__graphene_private_value : graphene_simd4x4f_t)(using Zone): Ptr[graphene_matrix_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_value = __graphene_private_value
    ____ptr