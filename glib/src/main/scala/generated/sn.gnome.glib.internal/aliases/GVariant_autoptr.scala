package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariant_autoptr = Ptr[GVariant]
object GVariant_autoptr:
  given _tag: Tag[GVariant_autoptr] = Tag.Ptr[GVariant](GVariant._tag)
  inline def apply(inline o: Ptr[GVariant]): GVariant_autoptr = o
  extension (v: GVariant_autoptr)
    inline def value: Ptr[GVariant] = v