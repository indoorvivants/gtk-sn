package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GResource_autoptr = Ptr[GResource]
object GResource_autoptr:
  given _tag: Tag[GResource_autoptr] = Tag.Ptr[GResource](GResource._tag)
  inline def apply(inline o: Ptr[GResource]): GResource_autoptr = o
  extension (v: GResource_autoptr)
    inline def value: Ptr[GResource] = v