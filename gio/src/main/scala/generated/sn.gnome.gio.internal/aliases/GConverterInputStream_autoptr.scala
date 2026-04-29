package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GConverterInputStream_autoptr = Ptr[GConverterInputStream]
object GConverterInputStream_autoptr:
  given _tag: Tag[GConverterInputStream_autoptr] = Tag.Ptr[GConverterInputStream](GConverterInputStream._tag)
  inline def apply(inline o: Ptr[GConverterInputStream]): GConverterInputStream_autoptr = o
  extension (v: GConverterInputStream_autoptr)
    inline def value: Ptr[GConverterInputStream] = v