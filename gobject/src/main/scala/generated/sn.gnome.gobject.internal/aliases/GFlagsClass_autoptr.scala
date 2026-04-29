package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFlagsClass_autoptr = Ptr[GFlagsClass]
object GFlagsClass_autoptr:
  given _tag: Tag[GFlagsClass_autoptr] = Tag.Ptr[GFlagsClass](GFlagsClass._tag)
  inline def apply(inline o: Ptr[GFlagsClass]): GFlagsClass_autoptr = o
  extension (v: GFlagsClass_autoptr)
    inline def value: Ptr[GFlagsClass] = v