package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSnapshot_autoptr = Ptr[GtkSnapshot]
object GtkSnapshot_autoptr:
  given _tag: Tag[GtkSnapshot_autoptr] = Tag.Ptr[GtkSnapshot](GtkSnapshot._tag)
  inline def apply(inline o: Ptr[GtkSnapshot]): GtkSnapshot_autoptr = o
  extension (v: GtkSnapshot_autoptr)
    inline def value: Ptr[GtkSnapshot] = v