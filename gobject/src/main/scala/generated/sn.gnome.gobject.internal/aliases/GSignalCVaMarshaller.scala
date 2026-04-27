package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalCVaMarshaller:
*/
type GSignalCVaMarshaller = GVaClosureMarshal
object GSignalCVaMarshaller:
  given _tag: Tag[GSignalCVaMarshaller] = GVaClosureMarshal._tag
  inline def apply(inline o: GVaClosureMarshal): GSignalCVaMarshaller = o
  extension (v: GSignalCVaMarshaller)
    inline def value: GVaClosureMarshal = v