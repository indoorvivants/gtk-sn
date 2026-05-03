package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusServer_autoptr = Ptr[GDBusServer]
object GDBusServer_autoptr:
  given _tag: Tag[GDBusServer_autoptr] = Tag.Ptr[GDBusServer](GDBusServer._tag)
  inline def apply(inline o: Ptr[GDBusServer]): GDBusServer_autoptr = o
  extension (v: GDBusServer_autoptr)
    inline def value: Ptr[GDBusServer] = v