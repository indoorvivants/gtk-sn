package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOutputStream_autoptr = Ptr[GOutputStream]
object GOutputStream_autoptr:
  given _tag: Tag[GOutputStream_autoptr] = Tag.Ptr[GOutputStream](GOutputStream._tag)
  inline def apply(inline o: Ptr[GOutputStream]): GOutputStream_autoptr = o
  extension (v: GOutputStream_autoptr)
    inline def value: Ptr[GOutputStream] = v