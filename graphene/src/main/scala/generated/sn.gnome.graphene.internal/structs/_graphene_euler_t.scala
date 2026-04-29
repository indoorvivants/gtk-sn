package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_euler_t:
*/
opaque type _graphene_euler_t = CStruct2[graphene_vec3_t, graphene_euler_order_t]

object _graphene_euler_t:
  given _tag: Tag[_graphene_euler_t] = Tag.materializeCStruct2Tag[graphene_vec3_t, graphene_euler_order_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _graphene_euler_t)
      inline def __graphene_private_angles : graphene_vec3_t = struct._1
      inline def __graphene_private_angles_=(value: graphene_vec3_t): Unit = (!struct.at1 = value)
      inline def __graphene_private_order : graphene_euler_order_t = struct._2
      inline def __graphene_private_order_=(value: graphene_euler_order_t): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _graphene_euler_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_graphene_euler_t] = scala.scalanative.unsafe.alloc[_graphene_euler_t](1)
  def apply(__graphene_private_angles : graphene_vec3_t, __graphene_private_order : graphene_euler_order_t)(using Zone): Ptr[_graphene_euler_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_angles = __graphene_private_angles
    (!____ptr).__graphene_private_order = __graphene_private_order
    ____ptr