package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixSocketAddress_autoptr = Ptr[GUnixSocketAddress]
object GUnixSocketAddress_autoptr:
  given _tag: Tag[GUnixSocketAddress_autoptr] = Tag.Ptr[GUnixSocketAddress](GUnixSocketAddress._tag)
  inline def apply(inline o: Ptr[GUnixSocketAddress]): GUnixSocketAddress_autoptr = o
  extension (v: GUnixSocketAddress_autoptr)
    inline def value: Ptr[GUnixSocketAddress] = v