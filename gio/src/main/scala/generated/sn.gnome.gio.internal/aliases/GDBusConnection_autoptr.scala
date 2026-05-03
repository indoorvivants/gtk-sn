package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusConnection_autoptr = Ptr[GDBusConnection]
object GDBusConnection_autoptr:
  given _tag: Tag[GDBusConnection_autoptr] = Tag.Ptr[GDBusConnection](GDBusConnection._tag)
  inline def apply(inline o: Ptr[GDBusConnection]): GDBusConnection_autoptr = o
  extension (v: GDBusConnection_autoptr)
    inline def value: Ptr[GDBusConnection] = v