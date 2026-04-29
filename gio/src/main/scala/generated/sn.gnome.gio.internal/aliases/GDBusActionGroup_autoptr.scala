package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusActionGroup_autoptr = Ptr[GDBusActionGroup]
object GDBusActionGroup_autoptr:
  given _tag: Tag[GDBusActionGroup_autoptr] = Tag.Ptr[GDBusActionGroup](GDBusActionGroup._tag)
  inline def apply(inline o: Ptr[GDBusActionGroup]): GDBusActionGroup_autoptr = o
  extension (v: GDBusActionGroup_autoptr)
    inline def value: Ptr[GDBusActionGroup] = v