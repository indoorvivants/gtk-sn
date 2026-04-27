package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDir_autoptr = Ptr[GDir]
object GDir_autoptr:
  given _tag: Tag[GDir_autoptr] = Tag.Ptr[GDir](GDir._tag)
  inline def apply(inline o: Ptr[GDir]): GDir_autoptr = o
  extension (v: GDir_autoptr)
    inline def value: Ptr[GDir] = v