package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNoSelection_autoptr = Ptr[GtkNoSelection]
object GtkNoSelection_autoptr:
  given _tag: Tag[GtkNoSelection_autoptr] = Tag.Ptr[GtkNoSelection](GtkNoSelection._tag)
  inline def apply(inline o: Ptr[GtkNoSelection]): GtkNoSelection_autoptr = o
  extension (v: GtkNoSelection_autoptr)
    inline def value: Ptr[GtkNoSelection] = v