package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GPatternSpec_autoptr = Ptr[GPatternSpec]
object GPatternSpec_autoptr:
  given _tag: Tag[GPatternSpec_autoptr] = Tag.Ptr[GPatternSpec](GPatternSpec._tag)
  inline def apply(inline o: Ptr[GPatternSpec]): GPatternSpec_autoptr = o
  extension (v: GPatternSpec_autoptr)
    inline def value: Ptr[GPatternSpec] = v