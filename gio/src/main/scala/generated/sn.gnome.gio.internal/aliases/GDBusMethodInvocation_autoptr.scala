package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusMethodInvocation_autoptr = Ptr[GDBusMethodInvocation]
object GDBusMethodInvocation_autoptr:
  given _tag: Tag[GDBusMethodInvocation_autoptr] = Tag.Ptr[GDBusMethodInvocation](GDBusMethodInvocation._tag)
  inline def apply(inline o: Ptr[GDBusMethodInvocation]): GDBusMethodInvocation_autoptr = o
  extension (v: GDBusMethodInvocation_autoptr)
    inline def value: Ptr[GDBusMethodInvocation] = v