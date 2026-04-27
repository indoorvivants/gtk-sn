package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyph:
*/
type PangoGlyph = _root_.sn.gnome.glib.internal.guint32
object PangoGlyph:
  given _tag: Tag[PangoGlyph] = _root_.sn.gnome.glib.internal.guint32._tag
  inline def apply(inline o: _root_.sn.gnome.glib.internal.guint32): PangoGlyph = o
  extension (v: PangoGlyph)
    inline def value: _root_.sn.gnome.glib.internal.guint32 = v