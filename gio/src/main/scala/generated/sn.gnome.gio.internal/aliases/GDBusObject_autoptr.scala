package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObject_autoptr = Ptr[GDBusObject]
object GDBusObject_autoptr:
  given _tag: Tag[GDBusObject_autoptr] = Tag.Ptr[GDBusObject](GDBusObject._tag)
  inline def apply(inline o: Ptr[GDBusObject]): GDBusObject_autoptr = o
  extension (v: GDBusObject_autoptr)
    inline def value: Ptr[GDBusObject] = v