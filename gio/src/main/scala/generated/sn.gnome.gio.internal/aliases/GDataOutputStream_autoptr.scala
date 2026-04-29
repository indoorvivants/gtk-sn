package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDataOutputStream_autoptr = Ptr[GDataOutputStream]
object GDataOutputStream_autoptr:
  given _tag: Tag[GDataOutputStream_autoptr] = Tag.Ptr[GDataOutputStream](GDataOutputStream._tag)
  inline def apply(inline o: Ptr[GDataOutputStream]): GDataOutputStream_autoptr = o
  extension (v: GDataOutputStream_autoptr)
    inline def value: Ptr[GDataOutputStream] = v