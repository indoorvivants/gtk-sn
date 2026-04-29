package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketAddress_autoptr = Ptr[GSocketAddress]
object GSocketAddress_autoptr:
  given _tag: Tag[GSocketAddress_autoptr] = Tag.Ptr[GSocketAddress](GSocketAddress._tag)
  inline def apply(inline o: Ptr[GSocketAddress]): GSocketAddress_autoptr = o
  extension (v: GSocketAddress_autoptr)
    inline def value: Ptr[GSocketAddress] = v