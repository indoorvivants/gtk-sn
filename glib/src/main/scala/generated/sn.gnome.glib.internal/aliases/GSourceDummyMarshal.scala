package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSourceDummyMarshal:
*/
opaque type GSourceDummyMarshal = CFuncPtr0[Unit]
object GSourceDummyMarshal:
  given _tag: Tag[GSourceDummyMarshal] = Tag.materializeCFuncPtr0[Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSourceDummyMarshal = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr0[Unit]): GSourceDummyMarshal = o
  extension (v: GSourceDummyMarshal)
    inline def value: CFuncPtr0[Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)