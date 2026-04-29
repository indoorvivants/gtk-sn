package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAsyncQueue_autoptr = Ptr[GAsyncQueue]
object GAsyncQueue_autoptr:
  given _tag: Tag[GAsyncQueue_autoptr] = Tag.Ptr[GAsyncQueue](GAsyncQueue._tag)
  inline def apply(inline o: Ptr[GAsyncQueue]): GAsyncQueue_autoptr = o
  extension (v: GAsyncQueue_autoptr)
    inline def value: Ptr[GAsyncQueue] = v