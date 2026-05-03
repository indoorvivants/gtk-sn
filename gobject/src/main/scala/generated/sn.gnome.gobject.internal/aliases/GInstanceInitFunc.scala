package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GInstanceInitFunc: : The instance to initialize _class: (type GObject.TypeClass): The class of the type the instance is created for
*/
opaque type GInstanceInitFunc = CFuncPtr2[Ptr[GTypeInstance], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GInstanceInitFunc:
  given _tag: Tag[GInstanceInitFunc] = Tag.materializeCFuncPtr2[Ptr[GTypeInstance], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GInstanceInitFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GTypeInstance], _root_.sn.gnome.glib.internal.gpointer, Unit]): GInstanceInitFunc = o
  extension (v: GInstanceInitFunc)
    inline def value: CFuncPtr2[Ptr[GTypeInstance], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)