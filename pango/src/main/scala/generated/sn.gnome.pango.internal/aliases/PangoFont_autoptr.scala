package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoFont_autoptr = Ptr[PangoFont]
object PangoFont_autoptr:
  given _tag: Tag[PangoFont_autoptr] = Tag.Ptr[PangoFont](PangoFont._tag)
  inline def apply(inline o: Ptr[PangoFont]): PangoFont_autoptr = o
  extension (v: PangoFont_autoptr)
    inline def value: Ptr[PangoFont] = v