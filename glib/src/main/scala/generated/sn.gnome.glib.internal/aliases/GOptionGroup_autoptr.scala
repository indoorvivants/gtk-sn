package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOptionGroup_autoptr = Ptr[GOptionGroup]
object GOptionGroup_autoptr:
  given _tag: Tag[GOptionGroup_autoptr] = Tag.Ptr[GOptionGroup](GOptionGroup._tag)
  inline def apply(inline o: Ptr[GOptionGroup]): GOptionGroup_autoptr = o
  extension (v: GOptionGroup_autoptr)
    inline def value: Ptr[GOptionGroup] = v