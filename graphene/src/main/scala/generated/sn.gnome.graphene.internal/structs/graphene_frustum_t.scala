package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_frustum_t:
*/
opaque type graphene_frustum_t = CStruct1[CArray[graphene_plane_t, Nat._6]]

object graphene_frustum_t:
  given _tag: Tag[graphene_frustum_t] = Tag.materializeCStruct1Tag[CArray[graphene_plane_t, Nat._6]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_frustum_t)
      inline def __graphene_private_planes : CArray[graphene_plane_t, Nat._6] = struct._1
      inline def __graphene_private_planes_=(value: CArray[graphene_plane_t, Nat._6]): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates graphene_frustum_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_frustum_t] = scala.scalanative.unsafe.alloc[graphene_frustum_t](1)
  def apply(__graphene_private_planes : CArray[graphene_plane_t, Nat._6])(using Zone): Ptr[graphene_frustum_t] =
    val ____ptr = apply()
    (!____ptr).__graphene_private_planes = __graphene_private_planes
    ____ptr