package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GLogWriterFunc: _level: log level of the message : (array length=n_fields): fields forming the message _fields: number of _data: user data passed to g_log_set_writer_func()
*/
opaque type GLogWriterFunc = CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
object GLogWriterFunc:
  given _tag: Tag[GLogWriterFunc] = Tag.materializeCFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GLogWriterFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput]): GLogWriterFunc = o
  extension (v: GLogWriterFunc)
    inline def value: CFuncPtr4[GLogLevelFlags, Ptr[GLogField], gsize, gpointer, GLogWriterOutput] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)