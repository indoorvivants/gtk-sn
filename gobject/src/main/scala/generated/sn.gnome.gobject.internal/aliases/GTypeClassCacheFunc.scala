package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeClassCacheFunc: _data: data that was given to the g_type_add_class_cache_func() call _class: (type GObject.TypeClass): The #GTypeClass structure which is unreferenced
*/
opaque type GTypeClassCacheFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GTypeClass], _root_.sn.gnome.glib.internal.gboolean]
object GTypeClassCacheFunc:
  given _tag: Tag[GTypeClassCacheFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GTypeClass], _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypeClassCacheFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GTypeClass], _root_.sn.gnome.glib.internal.gboolean]): GTypeClassCacheFunc = o
  extension (v: GTypeClassCacheFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GTypeClass], _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)