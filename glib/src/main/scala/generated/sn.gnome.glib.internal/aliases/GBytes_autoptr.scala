package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBytes_autoptr = Ptr[GBytes]
object GBytes_autoptr:
  given _tag: Tag[GBytes_autoptr] = Tag.Ptr[GBytes](GBytes._tag)
  inline def apply(inline o: Ptr[GBytes]): GBytes_autoptr = o
  extension (v: GBytes_autoptr)
    inline def value: Ptr[GBytes] = v