package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemoryInputStream_autoptr = Ptr[GMemoryInputStream]
object GMemoryInputStream_autoptr:
  given _tag: Tag[GMemoryInputStream_autoptr] = Tag.Ptr[GMemoryInputStream](GMemoryInputStream._tag)
  inline def apply(inline o: Ptr[GMemoryInputStream]): GMemoryInputStream_autoptr = o
  extension (v: GMemoryInputStream_autoptr)
    inline def value: Ptr[GMemoryInputStream] = v