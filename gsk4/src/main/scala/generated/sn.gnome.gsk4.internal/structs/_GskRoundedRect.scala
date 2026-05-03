package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GskRoundedRect = CStruct2[_root_.sn.gnome.graphene.internal.graphene_rect_t, CArray[_root_.sn.gnome.graphene.internal.graphene_size_t, Nat._4]]

object _GskRoundedRect:
  given _tag: Tag[_GskRoundedRect] = Tag.materializeCStruct2Tag[_root_.sn.gnome.graphene.internal.graphene_rect_t, CArray[_root_.sn.gnome.graphene.internal.graphene_size_t, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GskRoundedRect)
      inline def bounds : _root_.sn.gnome.graphene.internal.graphene_rect_t = struct._1
      inline def bounds_=(value: _root_.sn.gnome.graphene.internal.graphene_rect_t): Unit = (!struct.at1 = value)
      inline def corner : CArray[_root_.sn.gnome.graphene.internal.graphene_size_t, Nat._4] = struct._2
      inline def corner_=(value: CArray[_root_.sn.gnome.graphene.internal.graphene_size_t, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GskRoundedRect on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GskRoundedRect] = scala.scalanative.unsafe.alloc[_GskRoundedRect](1)
  def apply(bounds : _root_.sn.gnome.graphene.internal.graphene_rect_t, corner : CArray[_root_.sn.gnome.graphene.internal.graphene_size_t, Nat._4])(using Zone): Ptr[_GskRoundedRect] =
    val ____ptr = apply()
    (!____ptr).bounds = bounds
    (!____ptr).corner = corner
    ____ptr