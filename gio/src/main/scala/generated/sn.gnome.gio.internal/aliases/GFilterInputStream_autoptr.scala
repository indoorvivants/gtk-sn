package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFilterInputStream_autoptr = Ptr[GFilterInputStream]
object GFilterInputStream_autoptr:
  given _tag: Tag[GFilterInputStream_autoptr] = Tag.Ptr[GFilterInputStream](GFilterInputStream._tag)
  inline def apply(inline o: Ptr[GFilterInputStream]): GFilterInputStream_autoptr = o
  extension (v: GFilterInputStream_autoptr)
    inline def value: Ptr[GFilterInputStream] = v