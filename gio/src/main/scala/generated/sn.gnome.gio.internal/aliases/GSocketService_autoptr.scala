package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketService_autoptr = Ptr[GSocketService]
object GSocketService_autoptr:
  given _tag: Tag[GSocketService_autoptr] = Tag.Ptr[GSocketService](GSocketService._tag)
  inline def apply(inline o: Ptr[GSocketService]): GSocketService_autoptr = o
  extension (v: GSocketService_autoptr)
    inline def value: Ptr[GSocketService] = v