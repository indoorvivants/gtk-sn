package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GdkRectangle = _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t
object GdkRectangle:
  given _tag: Tag[GdkRectangle] = _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t._tag
  inline def apply(inline o: _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t): GdkRectangle = o
  extension (v: GdkRectangle)
    inline def value: _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t = v