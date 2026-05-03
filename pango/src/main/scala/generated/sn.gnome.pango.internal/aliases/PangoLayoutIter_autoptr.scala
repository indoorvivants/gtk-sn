package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoLayoutIter_autoptr = Ptr[PangoLayoutIter]
object PangoLayoutIter_autoptr:
  given _tag: Tag[PangoLayoutIter_autoptr] = Tag.Ptr[PangoLayoutIter](PangoLayoutIter._tag)
  inline def apply(inline o: Ptr[PangoLayoutIter]): PangoLayoutIter_autoptr = o
  extension (v: PangoLayoutIter_autoptr)
    inline def value: Ptr[PangoLayoutIter] = v