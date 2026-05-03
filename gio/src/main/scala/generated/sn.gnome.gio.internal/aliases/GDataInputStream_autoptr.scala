package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDataInputStream_autoptr = Ptr[GDataInputStream]
object GDataInputStream_autoptr:
  given _tag: Tag[GDataInputStream_autoptr] = Tag.Ptr[GDataInputStream](GDataInputStream._tag)
  inline def apply(inline o: Ptr[GDataInputStream]): GDataInputStream_autoptr = o
  extension (v: GDataInputStream_autoptr)
    inline def value: Ptr[GDataInputStream] = v