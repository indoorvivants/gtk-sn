package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoCoverage_autoptr = Ptr[PangoCoverage]
object PangoCoverage_autoptr:
  given _tag: Tag[PangoCoverage_autoptr] = Tag.Ptr[PangoCoverage](PangoCoverage._tag)
  inline def apply(inline o: Ptr[PangoCoverage]): PangoCoverage_autoptr = o
  extension (v: PangoCoverage_autoptr)
    inline def value: Ptr[PangoCoverage] = v