package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColumnViewRow_autoptr = Ptr[GtkColumnViewRow]
object GtkColumnViewRow_autoptr:
  given _tag: Tag[GtkColumnViewRow_autoptr] = Tag.Ptr[GtkColumnViewRow](GtkColumnViewRow._tag)
  inline def apply(inline o: Ptr[GtkColumnViewRow]): GtkColumnViewRow_autoptr = o
  extension (v: GtkColumnViewRow_autoptr)
    inline def value: Ptr[GtkColumnViewRow] = v