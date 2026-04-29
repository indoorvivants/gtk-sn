package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoFontDescription_autoptr = Ptr[PangoFontDescription]
object PangoFontDescription_autoptr:
  given _tag: Tag[PangoFontDescription_autoptr] = Tag.Ptr[PangoFontDescription](PangoFontDescription._tag)
  inline def apply(inline o: Ptr[PangoFontDescription]): PangoFontDescription_autoptr = o
  extension (v: PangoFontDescription_autoptr)
    inline def value: Ptr[PangoFontDescription] = v