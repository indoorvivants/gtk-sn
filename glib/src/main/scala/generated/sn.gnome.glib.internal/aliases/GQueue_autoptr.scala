package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GQueue_autoptr = Ptr[GQueue]
object GQueue_autoptr:
  given _tag: Tag[GQueue_autoptr] = Tag.Ptr[GQueue](GQueue._tag)
  inline def apply(inline o: Ptr[GQueue]): GQueue_autoptr = o
  extension (v: GQueue_autoptr)
    inline def value: Ptr[GQueue] = v