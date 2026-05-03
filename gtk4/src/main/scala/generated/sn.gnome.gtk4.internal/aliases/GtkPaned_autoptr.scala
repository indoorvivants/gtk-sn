package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPaned_autoptr = Ptr[GtkPaned]
object GtkPaned_autoptr:
  given _tag: Tag[GtkPaned_autoptr] = Tag.Ptr[GtkPaned](GtkPaned._tag)
  inline def apply(inline o: Ptr[GtkPaned]): GtkPaned_autoptr = o
  extension (v: GtkPaned_autoptr)
    inline def value: Ptr[GtkPaned] = v