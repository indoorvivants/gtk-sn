package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GApplication_autoptr = Ptr[GApplication]
object GApplication_autoptr:
  given _tag: Tag[GApplication_autoptr] = Tag.Ptr[GApplication](GApplication._tag)
  inline def apply(inline o: Ptr[GApplication]): GApplication_autoptr = o
  extension (v: GApplication_autoptr)
    inline def value: Ptr[GApplication] = v