package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GEnumClass_autoptr = Ptr[GEnumClass]
object GEnumClass_autoptr:
  given _tag: Tag[GEnumClass_autoptr] = Tag.Ptr[GEnumClass](GEnumClass._tag)
  inline def apply(inline o: Ptr[GEnumClass]): GEnumClass_autoptr = o
  extension (v: GEnumClass_autoptr)
    inline def value: Ptr[GEnumClass] = v