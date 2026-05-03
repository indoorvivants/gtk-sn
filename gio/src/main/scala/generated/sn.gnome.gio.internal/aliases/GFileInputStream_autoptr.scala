package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileInputStream_autoptr = Ptr[GFileInputStream]
object GFileInputStream_autoptr:
  given _tag: Tag[GFileInputStream_autoptr] = Tag.Ptr[GFileInputStream](GFileInputStream._tag)
  inline def apply(inline o: Ptr[GFileInputStream]): GFileInputStream_autoptr = o
  extension (v: GFileInputStream_autoptr)
    inline def value: Ptr[GFileInputStream] = v