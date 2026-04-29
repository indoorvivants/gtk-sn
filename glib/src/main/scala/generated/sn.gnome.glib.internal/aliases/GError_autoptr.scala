package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GError_autoptr = Ptr[GError]
object GError_autoptr:
  given _tag: Tag[GError_autoptr] = Tag.Ptr[GError](GError._tag)
  inline def apply(inline o: Ptr[GError]): GError_autoptr = o
  extension (v: GError_autoptr)
    inline def value: Ptr[GError] = v