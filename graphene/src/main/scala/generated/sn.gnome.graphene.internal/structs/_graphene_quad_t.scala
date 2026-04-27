package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_quad_t:
*/
opaque type _graphene_quad_t = CStruct1[CArray[graphene_point_t, Nat._4]]

object _graphene_quad_t:
  given _tag: Tag[_graphene_quad_t] = Tag.materializeCStruct1Tag[CArray[graphene_point_t, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _graphene_quad_t)
      inline def __graphene_private_points : CArray[graphene_point_t, Nat._4] = struct._1
      inline def __graphene_private_points_=(value: CArray[graphene_point_t, Nat._4]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _graphene_quad_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_graphene_quad_t] = scala.scalanative.unsafe.alloc[_graphene_quad_t](1)
  def apply(__graphene_private_points : CArray[graphene_point_t, Nat._4])(using Zone): Ptr[_graphene_quad_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_points = __graphene_private_points
    ____ptr