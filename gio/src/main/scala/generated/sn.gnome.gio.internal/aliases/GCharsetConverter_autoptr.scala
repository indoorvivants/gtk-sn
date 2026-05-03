package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCharsetConverter_autoptr = Ptr[GCharsetConverter]
object GCharsetConverter_autoptr:
  given _tag: Tag[GCharsetConverter_autoptr] = Tag.Ptr[GCharsetConverter](GCharsetConverter._tag)
  inline def apply(inline o: Ptr[GCharsetConverter]): GCharsetConverter_autoptr = o
  extension (v: GCharsetConverter_autoptr)
    inline def value: Ptr[GCharsetConverter] = v