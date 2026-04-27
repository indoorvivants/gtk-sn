package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListItemFactory_autoptr = Ptr[GtkListItemFactory]
object GtkListItemFactory_autoptr:
  given _tag: Tag[GtkListItemFactory_autoptr] = Tag.Ptr[GtkListItemFactory](GtkListItemFactory._tag)
  inline def apply(inline o: Ptr[GtkListItemFactory]): GtkListItemFactory_autoptr = o
  extension (v: GtkListItemFactory_autoptr)
    inline def value: Ptr[GtkListItemFactory] = v