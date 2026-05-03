package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GChecksum_autoptr = Ptr[GChecksum]
object GChecksum_autoptr:
  given _tag: Tag[GChecksum_autoptr] = Tag.Ptr[GChecksum](GChecksum._tag)
  inline def apply(inline o: Ptr[GChecksum]): GChecksum_autoptr = o
  extension (v: GChecksum_autoptr)
    inline def value: Ptr[GChecksum] = v