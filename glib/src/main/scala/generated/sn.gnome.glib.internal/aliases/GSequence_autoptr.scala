package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSequence_autoptr = Ptr[GSequence]
object GSequence_autoptr:
  given _tag: Tag[GSequence_autoptr] = Tag.Ptr[GSequence](GSequence._tag)
  inline def apply(inline o: Ptr[GSequence]): GSequence_autoptr = o
  extension (v: GSequence_autoptr)
    inline def value: Ptr[GSequence] = v