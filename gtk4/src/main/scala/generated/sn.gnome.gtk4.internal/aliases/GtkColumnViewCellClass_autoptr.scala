package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColumnViewCellClass_autoptr = Ptr[GtkColumnViewCellClass]
object GtkColumnViewCellClass_autoptr:
  given _tag: Tag[GtkColumnViewCellClass_autoptr] = Tag.Ptr[GtkColumnViewCellClass](GtkColumnViewCellClass._tag)
  inline def apply(inline o: Ptr[GtkColumnViewCellClass]): GtkColumnViewCellClass_autoptr = o
  extension (v: GtkColumnViewCellClass_autoptr)
    inline def value: Ptr[GtkColumnViewCellClass] = v