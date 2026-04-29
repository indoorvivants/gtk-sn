package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThemedIcon_autoptr = Ptr[GThemedIcon]
object GThemedIcon_autoptr:
  given _tag: Tag[GThemedIcon_autoptr] = Tag.Ptr[GThemedIcon](GThemedIcon._tag)
  inline def apply(inline o: Ptr[GThemedIcon]): GThemedIcon_autoptr = o
  extension (v: GThemedIcon_autoptr)
    inline def value: Ptr[GThemedIcon] = v