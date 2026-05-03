package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObjectManagerClient_autoptr = Ptr[GDBusObjectManagerClient]
object GDBusObjectManagerClient_autoptr:
  given _tag: Tag[GDBusObjectManagerClient_autoptr] = Tag.Ptr[GDBusObjectManagerClient](GDBusObjectManagerClient._tag)
  inline def apply(inline o: Ptr[GDBusObjectManagerClient]): GDBusObjectManagerClient_autoptr = o
  extension (v: GDBusObjectManagerClient_autoptr)
    inline def value: Ptr[GDBusObjectManagerClient] = v