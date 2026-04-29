package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAsyncResult_autoptr = Ptr[GAsyncResult]
object GAsyncResult_autoptr:
  given _tag: Tag[GAsyncResult_autoptr] = Tag.Ptr[GAsyncResult](GAsyncResult._tag)
  inline def apply(inline o: Ptr[GAsyncResult]): GAsyncResult_autoptr = o
  extension (v: GAsyncResult_autoptr)
    inline def value: Ptr[GAsyncResult] = v