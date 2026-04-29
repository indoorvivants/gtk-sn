package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRegex_autoptr = Ptr[GRegex]
object GRegex_autoptr:
  given _tag: Tag[GRegex_autoptr] = Tag.Ptr[GRegex](GRegex._tag)
  inline def apply(inline o: Ptr[GRegex]): GRegex_autoptr = o
  extension (v: GRegex_autoptr)
    inline def value: Ptr[GRegex] = v