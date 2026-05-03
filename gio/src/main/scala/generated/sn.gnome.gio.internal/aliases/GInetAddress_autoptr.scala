package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInetAddress_autoptr = Ptr[GInetAddress]
object GInetAddress_autoptr:
  given _tag: Tag[GInetAddress_autoptr] = Tag.Ptr[GInetAddress](GInetAddress._tag)
  inline def apply(inline o: Ptr[GInetAddress]): GInetAddress_autoptr = o
  extension (v: GInetAddress_autoptr)
    inline def value: Ptr[GInetAddress] = v