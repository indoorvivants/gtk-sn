package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskPathForeachFunc: : The operation : The points of the operation _pts: The number of points : The weight for conic curves, or unused if not a conic curve _data: The user data provided with the function
*/
opaque type GskPathForeachFunc = CFuncPtr5[GskPathOperation, Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t], _root_.sn.gnome.glib.internal.gsize, Float, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GskPathForeachFunc:
  given _tag: Tag[GskPathForeachFunc] = Tag.materializeCFuncPtr5[GskPathOperation, Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t], _root_.sn.gnome.glib.internal.gsize, Float, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GskPathForeachFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[GskPathOperation, Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t], _root_.sn.gnome.glib.internal.gsize, Float, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GskPathForeachFunc = o
  extension (v: GskPathForeachFunc)
    inline def value: CFuncPtr5[GskPathOperation, Ptr[_root_.sn.gnome.graphene.internal.graphene_point_t], _root_.sn.gnome.glib.internal.gsize, Float, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)