package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColumnViewCell_autoptr = Ptr[GtkColumnViewCell]
object GtkColumnViewCell_autoptr:
  given _tag: Tag[GtkColumnViewCell_autoptr] = Tag.Ptr[GtkColumnViewCell](GtkColumnViewCell._tag)
  inline def apply(inline o: Ptr[GtkColumnViewCell]): GtkColumnViewCell_autoptr = o
  extension (v: GtkColumnViewCell_autoptr)
    inline def value: Ptr[GtkColumnViewCell] = v