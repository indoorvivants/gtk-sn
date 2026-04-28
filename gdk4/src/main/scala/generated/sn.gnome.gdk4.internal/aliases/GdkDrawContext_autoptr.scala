package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDrawContext_autoptr = Ptr[GdkDrawContext]
object GdkDrawContext_autoptr:
  given _tag: Tag[GdkDrawContext_autoptr] = Tag.Ptr[GdkDrawContext](GdkDrawContext._tag)
  inline def apply(inline o: Ptr[GdkDrawContext]): GdkDrawContext_autoptr = o
  extension (v: GdkDrawContext_autoptr)
    inline def value: Ptr[GdkDrawContext] = v