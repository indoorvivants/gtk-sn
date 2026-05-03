package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMainContext_autoptr = Ptr[GMainContext]
object GMainContext_autoptr:
  given _tag: Tag[GMainContext_autoptr] = Tag.Ptr[GMainContext](GMainContext._tag)
  inline def apply(inline o: Ptr[GMainContext]): GMainContext_autoptr = o
  extension (v: GMainContext_autoptr)
    inline def value: Ptr[GMainContext] = v