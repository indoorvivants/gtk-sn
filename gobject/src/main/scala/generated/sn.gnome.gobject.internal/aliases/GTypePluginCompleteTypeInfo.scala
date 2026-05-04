package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypePluginCompleteTypeInfo: : the #GTypePlugin _type: the #GType whose info is completed : the #GTypeInfo struct to fill in _table: the #GTypeValueTable to fill in

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type GTypePluginCompleteTypeInfo = CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]
object GTypePluginCompleteTypeInfo:
  given _tag: Tag[GTypePluginCompleteTypeInfo] = Tag.materializeCFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypePluginCompleteTypeInfo = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit]): GTypePluginCompleteTypeInfo = o
  extension (v: GTypePluginCompleteTypeInfo)
    inline def value: CFuncPtr4[Ptr[GTypePlugin], GType, Ptr[GTypeInfo], Ptr[GTypeValueTable], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)