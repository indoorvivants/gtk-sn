package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRefString_autoptr = Ptr[GRefString]
object GRefString_autoptr:
  given _tag: Tag[GRefString_autoptr] = Tag.Ptr[GRefString](GRefString._tag)
  inline def apply(inline o: Ptr[GRefString]): GRefString_autoptr = o
  extension (v: GRefString_autoptr)
    inline def value: Ptr[GRefString] = v