package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalCVaMarshaller:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
type GSignalCVaMarshaller = GVaClosureMarshal
object GSignalCVaMarshaller:
  inline def apply(inline o: GVaClosureMarshal): GSignalCVaMarshaller = o
  export GVaClosureMarshal.{apply => _, *, given}