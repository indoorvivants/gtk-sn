package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GChildWatchFunc: : the process id of the child process _status: Status information about the child process, encoded in a platform-specific manner _data: user data passed to g_child_watch_add()
*/
opaque type GChildWatchFunc = CFuncPtr3[GPid, gint, gpointer, Unit]
object GChildWatchFunc:
  given _tag: Tag[GChildWatchFunc] = Tag.materializeCFuncPtr3[GPid, gint, gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GChildWatchFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[GPid, gint, gpointer, Unit]): GChildWatchFunc = o
  extension (v: GChildWatchFunc)
    inline def value: CFuncPtr3[GPid, gint, gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)