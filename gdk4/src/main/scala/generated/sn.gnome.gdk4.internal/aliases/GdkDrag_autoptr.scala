package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDrag_autoptr = Ptr[GdkDrag]
object GdkDrag_autoptr:
  given _tag: Tag[GdkDrag_autoptr] = Tag.Ptr[GdkDrag](GdkDrag._tag)
  inline def apply(inline o: Ptr[GdkDrag]): GdkDrag_autoptr = o
  extension (v: GdkDrag_autoptr)
    inline def value: Ptr[GdkDrag] = v