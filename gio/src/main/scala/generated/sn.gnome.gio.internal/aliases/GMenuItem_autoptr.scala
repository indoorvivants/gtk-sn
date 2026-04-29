package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMenuItem_autoptr = Ptr[GMenuItem]
object GMenuItem_autoptr:
  given _tag: Tag[GMenuItem_autoptr] = Tag.Ptr[GMenuItem](GMenuItem._tag)
  inline def apply(inline o: Ptr[GMenuItem]): GMenuItem_autoptr = o
  extension (v: GMenuItem_autoptr)
    inline def value: Ptr[GMenuItem] = v