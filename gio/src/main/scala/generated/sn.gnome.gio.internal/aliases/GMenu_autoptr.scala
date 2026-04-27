package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMenu_autoptr = Ptr[GMenu]
object GMenu_autoptr:
  given _tag: Tag[GMenu_autoptr] = Tag.Ptr[GMenu](GMenu._tag)
  inline def apply(inline o: Ptr[GMenu]): GMenu_autoptr = o
  extension (v: GMenu_autoptr)
    inline def value: Ptr[GMenu] = v