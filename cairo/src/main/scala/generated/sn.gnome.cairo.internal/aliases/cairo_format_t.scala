package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_format_t: _FORMAT_INVALID: no such format exists or is supported. _FORMAT_ARGB32: each pixel is a 32-bit quantity, with alpha in the upper 8 bits, then red, then green, then blue. The 32-bit quantities are stored native-endian. Pre-multiplied alpha is used. (That is, 50% transparent red is 0x80800000, not 0x80ff0000.) (Since 1.0) _FORMAT_RGB24: each pixel is a 32-bit quantity, with the upper 8 bits unused. Red, Green, and Blue are stored in the remaining 24 bits in that order. (Since 1.0) _FORMAT_A8: each pixel is a 8-bit quantity holding an alpha value. (Since 1.0) _FORMAT_A1: each pixel is a 1-bit quantity holding an alpha value. Pixels are packed together into 32-bit quantities. The ordering of the bits matches the endianness of the platform. On a big-endian machine, the first pixel is in the uppermost bit, on a little-endian machine the first pixel is in the least-significant bit. (Since 1.0) _FORMAT_RGB16_565: each pixel is a 16-bit quantity with red in the upper 5 bits, then green in the middle 6 bits, and blue in the lower 5 bits. (Since 1.2) _FORMAT_RGB30: like RGB24 but with 10bpc. (Since 1.12) _FORMAT_RGB96F: 3 floats, R, G, B. (Since 1.17.2) _FORMAT_RGBA128F: 4 floats, R, G, B, A. (Since 1.17.2)
*/
type cairo_format_t = _cairo_format
object cairo_format_t:
  given _tag: Tag[cairo_format_t] = _cairo_format._tag
  inline def apply(inline o: _cairo_format): cairo_format_t = o
  extension (v: cairo_format_t)
    inline def value: _cairo_format = v