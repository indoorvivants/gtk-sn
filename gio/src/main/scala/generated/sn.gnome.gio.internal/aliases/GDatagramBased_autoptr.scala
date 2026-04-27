package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDatagramBased_autoptr = Ptr[GDatagramBased]
object GDatagramBased_autoptr:
  given _tag: Tag[GDatagramBased_autoptr] = Tag.Ptr[GDatagramBased](GDatagramBased._tag)
  inline def apply(inline o: Ptr[GDatagramBased]): GDatagramBased_autoptr = o
  extension (v: GDatagramBased_autoptr)
    inline def value: Ptr[GDatagramBased] = v