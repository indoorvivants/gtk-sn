package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAction_autoptr = Ptr[GAction]
object GAction_autoptr:
  given _tag: Tag[GAction_autoptr] = Tag.Ptr[GAction](GAction._tag)
  inline def apply(inline o: Ptr[GAction]): GAction_autoptr = o
  extension (v: GAction_autoptr)
    inline def value: Ptr[GAction] = v