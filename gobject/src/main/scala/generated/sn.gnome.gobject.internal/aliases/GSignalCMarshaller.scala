package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalCMarshaller:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
type GSignalCMarshaller = GClosureMarshal
object GSignalCMarshaller:
  inline def apply(inline o: GClosureMarshal): GSignalCMarshaller = o
  export GClosureMarshal.{apply => _, *, given}