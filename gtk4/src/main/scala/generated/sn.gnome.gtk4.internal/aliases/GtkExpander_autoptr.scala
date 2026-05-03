package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkExpander_autoptr = Ptr[GtkExpander]
object GtkExpander_autoptr:
  given _tag: Tag[GtkExpander_autoptr] = Tag.Ptr[GtkExpander](GtkExpander._tag)
  inline def apply(inline o: Ptr[GtkExpander]): GtkExpander_autoptr = o
  extension (v: GtkExpander_autoptr)
    inline def value: Ptr[GtkExpander] = v