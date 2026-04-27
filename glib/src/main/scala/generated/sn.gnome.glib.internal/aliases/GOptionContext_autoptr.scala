package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOptionContext_autoptr = Ptr[GOptionContext]
object GOptionContext_autoptr:
  given _tag: Tag[GOptionContext_autoptr] = Tag.Ptr[GOptionContext](GOptionContext._tag)
  inline def apply(inline o: Ptr[GOptionContext]): GOptionContext_autoptr = o
  extension (v: GOptionContext_autoptr)
    inline def value: Ptr[GOptionContext] = v