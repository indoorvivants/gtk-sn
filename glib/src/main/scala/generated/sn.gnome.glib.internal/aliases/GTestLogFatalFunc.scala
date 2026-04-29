package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTestLogFatalFunc: _domain: the log domain of the message _level: the log level of the message (including the fatal and recursion flags) : the message to process _data: user data, set in g_test_log_set_fatal_handler()
*/
opaque type GTestLogFatalFunc = CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
object GTestLogFatalFunc:
  given _tag: Tag[GTestLogFatalFunc] = Tag.materializeCFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTestLogFatalFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean]): GTestLogFatalFunc = o
  extension (v: GTestLogFatalFunc)
    inline def value: CFuncPtr4[Ptr[gchar], GLogLevelFlags, Ptr[gchar], gpointer, gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)