package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDebugControllerDBus_autoptr = Ptr[GDebugControllerDBus]
object GDebugControllerDBus_autoptr:
  given _tag: Tag[GDebugControllerDBus_autoptr] = Tag.Ptr[GDebugControllerDBus](GDebugControllerDBus._tag)
  inline def apply(inline o: Ptr[GDebugControllerDBus]): GDebugControllerDBus_autoptr = o
  extension (v: GDebugControllerDBus_autoptr)
    inline def value: Ptr[GDebugControllerDBus] = v