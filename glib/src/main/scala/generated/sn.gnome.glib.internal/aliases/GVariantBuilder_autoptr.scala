package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantBuilder_autoptr = Ptr[GVariantBuilder]
object GVariantBuilder_autoptr:
  given _tag: Tag[GVariantBuilder_autoptr] = Tag.Ptr[GVariantBuilder](GVariantBuilder._tag)
  inline def apply(inline o: Ptr[GVariantBuilder]): GVariantBuilder_autoptr = o
  extension (v: GVariantBuilder_autoptr)
    inline def value: Ptr[GVariantBuilder] = v