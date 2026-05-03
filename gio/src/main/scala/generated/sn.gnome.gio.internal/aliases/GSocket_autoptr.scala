package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocket_autoptr = Ptr[GSocket]
object GSocket_autoptr:
  given _tag: Tag[GSocket_autoptr] = Tag.Ptr[GSocket](GSocket._tag)
  inline def apply(inline o: Ptr[GSocket]): GSocket_autoptr = o
  extension (v: GSocket_autoptr)
    inline def value: Ptr[GSocket] = v