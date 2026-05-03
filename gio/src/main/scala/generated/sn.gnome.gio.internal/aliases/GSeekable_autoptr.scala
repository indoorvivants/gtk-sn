package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSeekable_autoptr = Ptr[GSeekable]
object GSeekable_autoptr:
  given _tag: Tag[GSeekable_autoptr] = Tag.Ptr[GSeekable](GSeekable._tag)
  inline def apply(inline o: Ptr[GSeekable]): GSeekable_autoptr = o
  extension (v: GSeekable_autoptr)
    inline def value: Ptr[GSeekable] = v