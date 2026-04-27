package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoFontMap_autoptr = Ptr[PangoFontMap]
object PangoFontMap_autoptr:
  given _tag: Tag[PangoFontMap_autoptr] = Tag.Ptr[PangoFontMap](PangoFontMap._tag)
  inline def apply(inline o: Ptr[PangoFontMap]): PangoFontMap_autoptr = o
  extension (v: PangoFontMap_autoptr)
    inline def value: Ptr[PangoFontMap] = v