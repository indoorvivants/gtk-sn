package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_rect_t: : the coordinates of the origin of the rectangle : the size of the rectangle
*/
opaque type graphene_rect_t = CStruct2[_root_.sn.gnome.graphene.internal.graphene_point_t, _root_.sn.gnome.graphene.internal.graphene_size_t]

object graphene_rect_t:
  given _tag: Tag[graphene_rect_t] = Tag.materializeCStruct2Tag[_root_.sn.gnome.graphene.internal.graphene_point_t, _root_.sn.gnome.graphene.internal.graphene_size_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_rect_t)
      inline def origin : _root_.sn.gnome.graphene.internal.graphene_point_t = struct._1
      inline def origin_=(value: _root_.sn.gnome.graphene.internal.graphene_point_t): Unit = (!struct.at1 = value)
      inline def size : _root_.sn.gnome.graphene.internal.graphene_size_t = struct._2
      inline def size_=(value: _root_.sn.gnome.graphene.internal.graphene_size_t): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates graphene_rect_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_rect_t] = scala.scalanative.unsafe.alloc[graphene_rect_t](1)
  def apply(origin : _root_.sn.gnome.graphene.internal.graphene_point_t, size : _root_.sn.gnome.graphene.internal.graphene_size_t)(using Zone): Ptr[graphene_rect_t] =
    val ____ptr = apply()
    (!____ptr).origin = origin
    (!____ptr).size = size
    ____ptr