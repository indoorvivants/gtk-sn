package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMount_autoptr = Ptr[GMount]
object GMount_autoptr:
  given _tag: Tag[GMount_autoptr] = Tag.Ptr[GMount](GMount._tag)
  inline def apply(inline o: Ptr[GMount]): GMount_autoptr = o
  extension (v: GMount_autoptr)
    inline def value: Ptr[GMount] = v