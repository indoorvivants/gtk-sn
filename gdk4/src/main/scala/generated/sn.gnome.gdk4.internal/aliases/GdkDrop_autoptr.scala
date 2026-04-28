package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDrop_autoptr = Ptr[GdkDrop]
object GdkDrop_autoptr:
  given _tag: Tag[GdkDrop_autoptr] = Tag.Ptr[GdkDrop](GdkDrop._tag)
  inline def apply(inline o: Ptr[GdkDrop]): GdkDrop_autoptr = o
  extension (v: GdkDrop_autoptr)
    inline def value: Ptr[GdkDrop] = v