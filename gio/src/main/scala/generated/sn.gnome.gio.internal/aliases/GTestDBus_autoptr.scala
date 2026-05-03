package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestDBus_autoptr = Ptr[GTestDBus]
object GTestDBus_autoptr:
  given _tag: Tag[GTestDBus_autoptr] = Tag.Ptr[GTestDBus](GTestDBus._tag)
  inline def apply(inline o: Ptr[GTestDBus]): GTestDBus_autoptr = o
  extension (v: GTestDBus_autoptr)
    inline def value: Ptr[GTestDBus] = v