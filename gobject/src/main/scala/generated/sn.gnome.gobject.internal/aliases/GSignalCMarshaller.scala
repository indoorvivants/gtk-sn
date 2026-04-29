package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalCMarshaller:
*/
type GSignalCMarshaller = GClosureMarshal
object GSignalCMarshaller:
  given _tag: Tag[GSignalCMarshaller] = GClosureMarshal._tag
  inline def apply(inline o: GClosureMarshal): GSignalCMarshaller = o
  extension (v: GSignalCMarshaller)
    inline def value: GClosureMarshal = v