package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixConnection_autoptr = Ptr[GUnixConnection]
object GUnixConnection_autoptr:
  given _tag: Tag[GUnixConnection_autoptr] = Tag.Ptr[GUnixConnection](GUnixConnection._tag)
  inline def apply(inline o: Ptr[GUnixConnection]): GUnixConnection_autoptr = o
  extension (v: GUnixConnection_autoptr)
    inline def value: Ptr[GUnixConnection] = v