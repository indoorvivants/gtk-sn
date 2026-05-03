package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollFunc: : an array of #GPollFD elements : the number of elements in _: the maximum time to wait for an event of the file descriptors. A negative value indicates an infinite timeout.
*/
opaque type GPollFunc = CFuncPtr3[Ptr[GPollFD], guint, gint, gint]
object GPollFunc:
  given _tag: Tag[GPollFunc] = Tag.materializeCFuncPtr3[Ptr[GPollFD], guint, gint, gint]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GPollFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GPollFD], guint, gint, gint]): GPollFunc = o
  extension (v: GPollFunc)
    inline def value: CFuncPtr3[Ptr[GPollFD], guint, gint, gint] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)