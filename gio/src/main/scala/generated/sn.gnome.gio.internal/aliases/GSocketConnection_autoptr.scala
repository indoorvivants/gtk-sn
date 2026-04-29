package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketConnection_autoptr = Ptr[GSocketConnection]
object GSocketConnection_autoptr:
  given _tag: Tag[GSocketConnection_autoptr] = Tag.Ptr[GSocketConnection](GSocketConnection._tag)
  inline def apply(inline o: Ptr[GSocketConnection]): GSocketConnection_autoptr = o
  extension (v: GSocketConnection_autoptr)
    inline def value: Ptr[GSocketConnection] = v