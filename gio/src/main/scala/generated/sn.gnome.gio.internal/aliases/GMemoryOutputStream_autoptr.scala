package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemoryOutputStream_autoptr = Ptr[GMemoryOutputStream]
object GMemoryOutputStream_autoptr:
  given _tag: Tag[GMemoryOutputStream_autoptr] = Tag.Ptr[GMemoryOutputStream](GMemoryOutputStream._tag)
  inline def apply(inline o: Ptr[GMemoryOutputStream]): GMemoryOutputStream_autoptr = o
  extension (v: GMemoryOutputStream_autoptr)
    inline def value: Ptr[GMemoryOutputStream] = v