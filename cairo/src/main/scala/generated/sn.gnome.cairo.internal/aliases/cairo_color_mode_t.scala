package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_color_mode_t: _COLOR_MODE_DEFAULT: Use the default color mode for font backend and target device, since 1.18. _COLOR_MODE_NO_COLOR: Disable rendering color glyphs. Glyphs are always rendered as outline glyphs, since 1.18. _COLOR_MODE_COLOR: Enable rendering color glyphs. If the font contains a color presentation for a glyph, and when supported by the font backend, the glyph will be rendered in color, since 1.18.
*/
type cairo_color_mode_t = _cairo_color_mode
object cairo_color_mode_t:
  inline def apply(inline o: _cairo_color_mode): cairo_color_mode_t = o
  export _cairo_color_mode.{apply => _, *, given}