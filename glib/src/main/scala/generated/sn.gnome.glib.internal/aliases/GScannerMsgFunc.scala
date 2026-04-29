package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GScannerMsgFunc = CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]
object GScannerMsgFunc:
  given _tag: Tag[GScannerMsgFunc] = Tag.materializeCFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GScannerMsgFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit]): GScannerMsgFunc = o
  extension (v: GScannerMsgFunc)
    inline def value: CFuncPtr3[Ptr[GScanner], Ptr[gchar], gboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)