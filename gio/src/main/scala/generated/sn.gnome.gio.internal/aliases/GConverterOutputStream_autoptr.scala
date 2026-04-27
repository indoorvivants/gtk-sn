package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GConverterOutputStream_autoptr = Ptr[GConverterOutputStream]
object GConverterOutputStream_autoptr:
  given _tag: Tag[GConverterOutputStream_autoptr] = Tag.Ptr[GConverterOutputStream](GConverterOutputStream._tag)
  inline def apply(inline o: Ptr[GConverterOutputStream]): GConverterOutputStream_autoptr = o
  extension (v: GConverterOutputStream_autoptr)
    inline def value: Ptr[GConverterOutputStream] = v