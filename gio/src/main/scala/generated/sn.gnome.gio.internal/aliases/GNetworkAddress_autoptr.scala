package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNetworkAddress_autoptr = Ptr[GNetworkAddress]
object GNetworkAddress_autoptr:
  given _tag: Tag[GNetworkAddress_autoptr] = Tag.Ptr[GNetworkAddress](GNetworkAddress._tag)
  inline def apply(inline o: Ptr[GNetworkAddress]): GNetworkAddress_autoptr = o
  extension (v: GNetworkAddress_autoptr)
    inline def value: Ptr[GNetworkAddress] = v