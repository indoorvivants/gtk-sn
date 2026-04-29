package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileOutputStream_autoptr = Ptr[GFileOutputStream]
object GFileOutputStream_autoptr:
  given _tag: Tag[GFileOutputStream_autoptr] = Tag.Ptr[GFileOutputStream](GFileOutputStream._tag)
  inline def apply(inline o: Ptr[GFileOutputStream]): GFileOutputStream_autoptr = o
  extension (v: GFileOutputStream_autoptr)
    inline def value: Ptr[GFileOutputStream] = v