package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_quaternion_t:
*/
opaque type _graphene_quaternion_t = CStruct4[Float, Float, Float, Float]

object _graphene_quaternion_t:
  given _tag: Tag[_graphene_quaternion_t] = Tag.materializeCStruct4Tag[Float, Float, Float, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _graphene_quaternion_t)
      inline def __graphene_private_x : Float = struct._1
      inline def __graphene_private_x_=(value: Float): Unit = (!struct.at1 = value)
      inline def __graphene_private_y : Float = struct._2
      inline def __graphene_private_y_=(value: Float): Unit = (!struct.at2 = value)
      inline def __graphene_private_z : Float = struct._3
      inline def __graphene_private_z_=(value: Float): Unit = (!struct.at3 = value)
      inline def __graphene_private_w : Float = struct._4
      inline def __graphene_private_w_=(value: Float): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _graphene_quaternion_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_graphene_quaternion_t] = scala.scalanative.unsafe.alloc[_graphene_quaternion_t](1)
  def apply(__graphene_private_x : Float, __graphene_private_y : Float, __graphene_private_z : Float, __graphene_private_w : Float)(using Zone): Ptr[_graphene_quaternion_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_x = __graphene_private_x
    (!____ptr).__graphene_private_y = __graphene_private_y
    (!____ptr).__graphene_private_z = __graphene_private_z
    (!____ptr).__graphene_private_w = __graphene_private_w
    ____ptr