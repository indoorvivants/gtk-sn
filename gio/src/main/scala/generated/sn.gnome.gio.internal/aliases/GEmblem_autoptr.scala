package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GEmblem_autoptr = Ptr[GEmblem]
object GEmblem_autoptr:
  given _tag: Tag[GEmblem_autoptr] = Tag.Ptr[GEmblem](GEmblem._tag)
  inline def apply(inline o: Ptr[GEmblem]): GEmblem_autoptr = o
  extension (v: GEmblem_autoptr)
    inline def value: Ptr[GEmblem] = v