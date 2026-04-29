package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gssize = CLongInt
object gssize:
  given _tag: Tag[gssize] = Tag.Size
  inline def apply(inline o: CLongInt): gssize = o
  extension (v: gssize)
    inline def value: CLongInt = v