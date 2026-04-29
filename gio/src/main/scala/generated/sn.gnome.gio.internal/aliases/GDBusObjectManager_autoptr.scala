package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObjectManager_autoptr = Ptr[GDBusObjectManager]
object GDBusObjectManager_autoptr:
  given _tag: Tag[GDBusObjectManager_autoptr] = Tag.Ptr[GDBusObjectManager](GDBusObjectManager._tag)
  inline def apply(inline o: Ptr[GDBusObjectManager]): GDBusObjectManager_autoptr = o
  extension (v: GDBusObjectManager_autoptr)
    inline def value: Ptr[GDBusObjectManager] = v