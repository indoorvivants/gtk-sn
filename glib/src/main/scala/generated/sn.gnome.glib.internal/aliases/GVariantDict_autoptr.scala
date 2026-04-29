package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantDict_autoptr = Ptr[GVariantDict]
object GVariantDict_autoptr:
  given _tag: Tag[GVariantDict_autoptr] = Tag.Ptr[GVariantDict](GVariantDict._tag)
  inline def apply(inline o: Ptr[GVariantDict]): GVariantDict_autoptr = o
  extension (v: GVariantDict_autoptr)
    inline def value: Ptr[GVariantDict] = v