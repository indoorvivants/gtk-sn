package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskPath_autoptr = Ptr[GskPath]
object GskPath_autoptr:
  given _tag: Tag[GskPath_autoptr] = Tag.Ptr[GskPath](GskPath._tag)
  inline def apply(inline o: Ptr[GskPath]): GskPath_autoptr = o
  extension (v: GskPath_autoptr)
    inline def value: Ptr[GskPath] = v