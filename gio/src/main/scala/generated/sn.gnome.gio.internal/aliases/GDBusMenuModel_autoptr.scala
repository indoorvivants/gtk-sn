package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusMenuModel_autoptr = Ptr[GDBusMenuModel]
object GDBusMenuModel_autoptr:
  given _tag: Tag[GDBusMenuModel_autoptr] = Tag.Ptr[GDBusMenuModel](GDBusMenuModel._tag)
  inline def apply(inline o: Ptr[GDBusMenuModel]): GDBusMenuModel_autoptr = o
  extension (v: GDBusMenuModel_autoptr)
    inline def value: Ptr[GDBusMenuModel] = v