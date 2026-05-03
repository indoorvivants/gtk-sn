package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusInterfaceSkeleton_autoptr = Ptr[GDBusInterfaceSkeleton]
object GDBusInterfaceSkeleton_autoptr:
  given _tag: Tag[GDBusInterfaceSkeleton_autoptr] = Tag.Ptr[GDBusInterfaceSkeleton](GDBusInterfaceSkeleton._tag)
  inline def apply(inline o: Ptr[GDBusInterfaceSkeleton]): GDBusInterfaceSkeleton_autoptr = o
  extension (v: GDBusInterfaceSkeleton_autoptr)
    inline def value: Ptr[GDBusInterfaceSkeleton] = v