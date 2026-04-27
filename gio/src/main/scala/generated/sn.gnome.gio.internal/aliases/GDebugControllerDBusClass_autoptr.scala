package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDebugControllerDBusClass_autoptr = Ptr[GDebugControllerDBusClass]
object GDebugControllerDBusClass_autoptr:
  given _tag: Tag[GDebugControllerDBusClass_autoptr] = Tag.Ptr[GDebugControllerDBusClass](GDebugControllerDBusClass._tag)
  inline def apply(inline o: Ptr[GDebugControllerDBusClass]): GDebugControllerDBusClass_autoptr = o
  extension (v: GDebugControllerDBusClass_autoptr)
    inline def value: Ptr[GDebugControllerDBusClass] = v