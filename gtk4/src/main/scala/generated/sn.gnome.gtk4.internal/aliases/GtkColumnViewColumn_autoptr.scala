package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColumnViewColumn_autoptr = Ptr[GtkColumnViewColumn]
object GtkColumnViewColumn_autoptr:
  given _tag: Tag[GtkColumnViewColumn_autoptr] = Tag.Ptr[GtkColumnViewColumn](GtkColumnViewColumn._tag)
  inline def apply(inline o: Ptr[GtkColumnViewColumn]): GtkColumnViewColumn_autoptr = o
  extension (v: GtkColumnViewColumn_autoptr)
    inline def value: Ptr[GtkColumnViewColumn] = v