package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCancellable_autoptr = Ptr[GCancellable]
object GCancellable_autoptr:
  given _tag: Tag[GCancellable_autoptr] = Tag.Ptr[GCancellable](GCancellable._tag)
  inline def apply(inline o: Ptr[GCancellable]): GCancellable_autoptr = o
  extension (v: GCancellable_autoptr)
    inline def value: Ptr[GCancellable] = v