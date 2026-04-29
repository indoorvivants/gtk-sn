package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDate_autoptr = Ptr[GDate]
object GDate_autoptr:
  given _tag: Tag[GDate_autoptr] = Tag.Ptr[GDate](GDate._tag)
  inline def apply(inline o: Ptr[GDate]): GDate_autoptr = o
  extension (v: GDate_autoptr)
    inline def value: Ptr[GDate] = v