package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObjectManagerServer_autoptr = Ptr[GDBusObjectManagerServer]
object GDBusObjectManagerServer_autoptr:
  given _tag: Tag[GDBusObjectManagerServer_autoptr] = Tag.Ptr[GDBusObjectManagerServer](GDBusObjectManagerServer._tag)
  inline def apply(inline o: Ptr[GDBusObjectManagerServer]): GDBusObjectManagerServer_autoptr = o
  extension (v: GDBusObjectManagerServer_autoptr)
    inline def value: Ptr[GDBusObjectManagerServer] = v