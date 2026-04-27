package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketConnectable_autoptr = Ptr[GSocketConnectable]
object GSocketConnectable_autoptr:
  given _tag: Tag[GSocketConnectable_autoptr] = Tag.Ptr[GSocketConnectable](GSocketConnectable._tag)
  inline def apply(inline o: Ptr[GSocketConnectable]): GSocketConnectable_autoptr = o
  extension (v: GSocketConnectable_autoptr)
    inline def value: Ptr[GSocketConnectable] = v