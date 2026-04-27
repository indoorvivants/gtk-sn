package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMenuModel_autoptr = Ptr[GMenuModel]
object GMenuModel_autoptr:
  given _tag: Tag[GMenuModel_autoptr] = Tag.Ptr[GMenuModel](GMenuModel._tag)
  inline def apply(inline o: Ptr[GMenuModel]): GMenuModel_autoptr = o
  extension (v: GMenuModel_autoptr)
    inline def value: Ptr[GMenuModel] = v