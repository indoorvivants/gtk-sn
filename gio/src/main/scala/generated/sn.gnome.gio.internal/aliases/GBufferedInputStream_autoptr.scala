package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBufferedInputStream_autoptr = Ptr[GBufferedInputStream]
object GBufferedInputStream_autoptr:
  given _tag: Tag[GBufferedInputStream_autoptr] = Tag.Ptr[GBufferedInputStream](GBufferedInputStream._tag)
  inline def apply(inline o: Ptr[GBufferedInputStream]): GBufferedInputStream_autoptr = o
  extension (v: GBufferedInputStream_autoptr)
    inline def value: Ptr[GBufferedInputStream] = v