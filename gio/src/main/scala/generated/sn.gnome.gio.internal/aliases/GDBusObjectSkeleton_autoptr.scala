package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDBusObjectSkeleton_autoptr = Ptr[GDBusObjectSkeleton]
object GDBusObjectSkeleton_autoptr:
  given _tag: Tag[GDBusObjectSkeleton_autoptr] = Tag.Ptr[GDBusObjectSkeleton](GDBusObjectSkeleton._tag)
  inline def apply(inline o: Ptr[GDBusObjectSkeleton]): GDBusObjectSkeleton_autoptr = o
  extension (v: GDBusObjectSkeleton_autoptr)
    inline def value: Ptr[GDBusObjectSkeleton] = v