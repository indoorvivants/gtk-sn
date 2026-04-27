package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyphUnit:
*/
type PangoGlyphUnit = _root_.sn.gnome.glib.internal.gint32
object PangoGlyphUnit:
  given _tag: Tag[PangoGlyphUnit] = _root_.sn.gnome.glib.internal.gint32._tag
  inline def apply(inline o: _root_.sn.gnome.glib.internal.gint32): PangoGlyphUnit = o
  extension (v: PangoGlyphUnit)
    inline def value: _root_.sn.gnome.glib.internal.gint32 = v