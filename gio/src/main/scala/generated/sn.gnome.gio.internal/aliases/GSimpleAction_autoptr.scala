package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSimpleAction_autoptr = Ptr[GSimpleAction]
object GSimpleAction_autoptr:
  given _tag: Tag[GSimpleAction_autoptr] = Tag.Ptr[GSimpleAction](GSimpleAction._tag)
  inline def apply(inline o: Ptr[GSimpleAction]): GSimpleAction_autoptr = o
  extension (v: GSimpleAction_autoptr)
    inline def value: Ptr[GSimpleAction] = v