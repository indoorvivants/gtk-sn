package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GLoadableIcon_autoptr = Ptr[GLoadableIcon]
object GLoadableIcon_autoptr:
  given _tag: Tag[GLoadableIcon_autoptr] = Tag.Ptr[GLoadableIcon](GLoadableIcon._tag)
  inline def apply(inline o: Ptr[GLoadableIcon]): GLoadableIcon_autoptr = o
  extension (v: GLoadableIcon_autoptr)
    inline def value: Ptr[GLoadableIcon] = v