package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRand_autoptr = Ptr[GRand]
object GRand_autoptr:
  given _tag: Tag[GRand_autoptr] = Tag.Ptr[GRand](GRand._tag)
  inline def apply(inline o: Ptr[GRand]): GRand_autoptr = o
  extension (v: GRand_autoptr)
    inline def value: Ptr[GRand] = v