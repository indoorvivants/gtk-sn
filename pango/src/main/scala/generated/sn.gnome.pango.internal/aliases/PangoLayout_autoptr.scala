package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoLayout_autoptr = Ptr[PangoLayout]
object PangoLayout_autoptr:
  given _tag: Tag[PangoLayout_autoptr] = Tag.Ptr[PangoLayout](PangoLayout._tag)
  inline def apply(inline o: Ptr[PangoLayout]): PangoLayout_autoptr = o
  extension (v: PangoLayout_autoptr)
    inline def value: Ptr[PangoLayout] = v