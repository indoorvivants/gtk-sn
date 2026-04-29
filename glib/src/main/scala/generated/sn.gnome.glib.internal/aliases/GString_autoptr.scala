package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GString_autoptr = Ptr[GString]
object GString_autoptr:
  given _tag: Tag[GString_autoptr] = Tag.Ptr[GString](GString._tag)
  inline def apply(inline o: Ptr[GString]): GString_autoptr = o
  extension (v: GString_autoptr)
    inline def value: Ptr[GString] = v