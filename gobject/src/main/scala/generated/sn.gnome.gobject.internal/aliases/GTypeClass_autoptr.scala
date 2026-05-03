package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTypeClass_autoptr = Ptr[GTypeClass]
object GTypeClass_autoptr:
  given _tag: Tag[GTypeClass_autoptr] = Tag.Ptr[GTypeClass](GTypeClass._tag)
  inline def apply(inline o: Ptr[GTypeClass]): GTypeClass_autoptr = o
  extension (v: GTypeClass_autoptr)
    inline def value: Ptr[GTypeClass] = v