package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMenuAttributeIter_autoptr = Ptr[GMenuAttributeIter]
object GMenuAttributeIter_autoptr:
  given _tag: Tag[GMenuAttributeIter_autoptr] = Tag.Ptr[GMenuAttributeIter](GMenuAttributeIter._tag)
  inline def apply(inline o: Ptr[GMenuAttributeIter]): GMenuAttributeIter_autoptr = o
  extension (v: GMenuAttributeIter_autoptr)
    inline def value: Ptr[GMenuAttributeIter] = v