package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMainLoop_autoptr = Ptr[GMainLoop]
object GMainLoop_autoptr:
  given _tag: Tag[GMainLoop_autoptr] = Tag.Ptr[GMainLoop](GMainLoop._tag)
  inline def apply(inline o: Ptr[GMainLoop]): GMainLoop_autoptr = o
  extension (v: GMainLoop_autoptr)
    inline def value: Ptr[GMainLoop] = v