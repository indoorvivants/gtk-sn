package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStrvBuilder_autoptr = Ptr[GStrvBuilder]
object GStrvBuilder_autoptr:
  given _tag: Tag[GStrvBuilder_autoptr] = Tag.Ptr[GStrvBuilder](GStrvBuilder._tag)
  inline def apply(inline o: Ptr[GStrvBuilder]): GStrvBuilder_autoptr = o
  extension (v: GStrvBuilder_autoptr)
    inline def value: Ptr[GStrvBuilder] = v