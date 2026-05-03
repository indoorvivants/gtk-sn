package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxy_autoptr = Ptr[GProxy]
object GProxy_autoptr:
  given _tag: Tag[GProxy_autoptr] = Tag.Ptr[GProxy](GProxy._tag)
  inline def apply(inline o: Ptr[GProxy]): GProxy_autoptr = o
  extension (v: GProxy_autoptr)
    inline def value: Ptr[GProxy] = v