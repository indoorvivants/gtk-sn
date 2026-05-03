package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeExpander_autoptr = Ptr[GtkTreeExpander]
object GtkTreeExpander_autoptr:
  given _tag: Tag[GtkTreeExpander_autoptr] = Tag.Ptr[GtkTreeExpander](GtkTreeExpander._tag)
  inline def apply(inline o: Ptr[GtkTreeExpander]): GtkTreeExpander_autoptr = o
  extension (v: GtkTreeExpander_autoptr)
    inline def value: Ptr[GtkTreeExpander] = v