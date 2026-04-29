package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInputStream_autoptr = Ptr[GInputStream]
object GInputStream_autoptr:
  given _tag: Tag[GInputStream_autoptr] = Tag.Ptr[GInputStream](GInputStream._tag)
  inline def apply(inline o: Ptr[GInputStream]): GInputStream_autoptr = o
  extension (v: GInputStream_autoptr)
    inline def value: Ptr[GInputStream] = v