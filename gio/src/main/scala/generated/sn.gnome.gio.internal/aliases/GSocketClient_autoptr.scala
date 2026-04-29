package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketClient_autoptr = Ptr[GSocketClient]
object GSocketClient_autoptr:
  given _tag: Tag[GSocketClient_autoptr] = Tag.Ptr[GSocketClient](GSocketClient._tag)
  inline def apply(inline o: Ptr[GSocketClient]): GSocketClient_autoptr = o
  extension (v: GSocketClient_autoptr)
    inline def value: Ptr[GSocketClient] = v