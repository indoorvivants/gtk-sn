package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GdkRectangle = _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t
object GdkRectangle:
  inline def apply(inline o: _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t): GdkRectangle = o
  export _root_.sn.gnome.cairo.internal.cairo_rectangle_int_t.{apply => _, *, given}