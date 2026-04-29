package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNetworkService_autoptr = Ptr[GNetworkService]
object GNetworkService_autoptr:
  given _tag: Tag[GNetworkService_autoptr] = Tag.Ptr[GNetworkService](GNetworkService._tag)
  inline def apply(inline o: Ptr[GNetworkService]): GNetworkService_autoptr = o
  extension (v: GNetworkService_autoptr)
    inline def value: Ptr[GNetworkService] = v