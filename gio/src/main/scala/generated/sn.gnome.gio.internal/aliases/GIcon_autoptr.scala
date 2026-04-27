package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIcon_autoptr = Ptr[GIcon]
object GIcon_autoptr:
  given _tag: Tag[GIcon_autoptr] = Tag.Ptr[GIcon](GIcon._tag)
  inline def apply(inline o: Ptr[GIcon]): GIcon_autoptr = o
  extension (v: GIcon_autoptr)
    inline def value: Ptr[GIcon] = v