package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gdouble = Double
object gdouble:
  given _tag: Tag[gdouble] = Tag.Double
  inline def apply(inline o: Double): gdouble = o
  extension (v: gdouble)
    inline def value: Double = v