package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypePluginCompleteInterfaceInfo: : the #GTypePlugin _type: the #GType of an instantiatable type to which the interface is added : the #GInterfaceInfo to fill in
*/
opaque type GTypePluginCompleteInterfaceInfo = CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]
object GTypePluginCompleteInterfaceInfo:
  given _tag: Tag[GTypePluginCompleteInterfaceInfo] = Tag.materializeCFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypePluginCompleteInterfaceInfo = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit]): GTypePluginCompleteInterfaceInfo = o
  extension (v: GTypePluginCompleteInterfaceInfo)
    inline def value: CFuncPtr4[Ptr[GTypePlugin], GType, GType, Ptr[GInterfaceInfo], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)