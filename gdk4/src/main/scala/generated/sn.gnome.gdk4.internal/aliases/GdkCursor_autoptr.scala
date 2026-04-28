package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkCursor_autoptr = Ptr[GdkCursor]
object GdkCursor_autoptr:
  given _tag: Tag[GdkCursor_autoptr] = Tag.Ptr[GdkCursor](GdkCursor._tag)
  inline def apply(inline o: Ptr[GdkCursor]): GdkCursor_autoptr = o
  extension (v: GdkCursor_autoptr)
    inline def value: Ptr[GdkCursor] = v