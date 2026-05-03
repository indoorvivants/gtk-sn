package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTraverseNodeFunc: : a #GTreeNode
*/
opaque type GTraverseNodeFunc = CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
object GTraverseNodeFunc:
  given _tag: Tag[GTraverseNodeFunc] = Tag.materializeCFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTraverseNodeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean]): GTraverseNodeFunc = o
  extension (v: GTraverseNodeFunc)
    inline def value: CFuncPtr2[Ptr[GTreeNode], gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)