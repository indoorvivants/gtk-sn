package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GObject_autoptr = Ptr[GObject]
object GObject_autoptr:
  given _tag: Tag[GObject_autoptr] = Tag.Ptr[GObject](GObject._tag)
  inline def apply(inline o: Ptr[GObject]): GObject_autoptr = o
  extension (v: GObject_autoptr)
    inline def value: Ptr[GObject] = v