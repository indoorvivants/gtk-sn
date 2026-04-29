package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoLayoutRun:
*/
type PangoLayoutRun = PangoGlyphItem
object PangoLayoutRun:
  given _tag: Tag[PangoLayoutRun] = PangoGlyphItem._tag
  inline def apply(inline o: PangoGlyphItem): PangoLayoutRun = o
  extension (v: PangoLayoutRun)
    inline def value: PangoGlyphItem = v