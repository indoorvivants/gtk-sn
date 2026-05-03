package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSimpleActionGroup_autoptr = Ptr[GSimpleActionGroup]
object GSimpleActionGroup_autoptr:
  given _tag: Tag[GSimpleActionGroup_autoptr] = Tag.Ptr[GSimpleActionGroup](GSimpleActionGroup._tag)
  inline def apply(inline o: Ptr[GSimpleActionGroup]): GSimpleActionGroup_autoptr = o
  extension (v: GSimpleActionGroup_autoptr)
    inline def value: Ptr[GSimpleActionGroup] = v