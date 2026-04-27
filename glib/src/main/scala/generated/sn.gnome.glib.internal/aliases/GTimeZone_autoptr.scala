package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTimeZone_autoptr = Ptr[GTimeZone]
object GTimeZone_autoptr:
  given _tag: Tag[GTimeZone_autoptr] = Tag.Ptr[GTimeZone](GTimeZone._tag)
  inline def apply(inline o: Ptr[GTimeZone]): GTimeZone_autoptr = o
  extension (v: GTimeZone_autoptr)
    inline def value: Ptr[GTimeZone] = v