package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColumnViewRowClass_autoptr = Ptr[GtkColumnViewRowClass]
object GtkColumnViewRowClass_autoptr:
  given _tag: Tag[GtkColumnViewRowClass_autoptr] = Tag.Ptr[GtkColumnViewRowClass](GtkColumnViewRowClass._tag)
  inline def apply(inline o: Ptr[GtkColumnViewRowClass]): GtkColumnViewRowClass_autoptr = o
  extension (v: GtkColumnViewRowClass_autoptr)
    inline def value: Ptr[GtkColumnViewRowClass] = v