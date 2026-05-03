package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDateTime_autoptr = Ptr[GDateTime]
object GDateTime_autoptr:
  given _tag: Tag[GDateTime_autoptr] = Tag.Ptr[GDateTime](GDateTime._tag)
  inline def apply(inline o: Ptr[GDateTime]): GDateTime_autoptr = o
  extension (v: GDateTime_autoptr)
    inline def value: Ptr[GDateTime] = v