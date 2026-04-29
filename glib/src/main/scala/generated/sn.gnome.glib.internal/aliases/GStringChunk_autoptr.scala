package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStringChunk_autoptr = Ptr[GStringChunk]
object GStringChunk_autoptr:
  given _tag: Tag[GStringChunk_autoptr] = Tag.Ptr[GStringChunk](GStringChunk._tag)
  inline def apply(inline o: Ptr[GStringChunk]): GStringChunk_autoptr = o
  extension (v: GStringChunk_autoptr)
    inline def value: Ptr[GStringChunk] = v