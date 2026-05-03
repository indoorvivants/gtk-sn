package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkLayoutChild_autoptr = Ptr[GtkLayoutChild]
object GtkLayoutChild_autoptr:
  given _tag: Tag[GtkLayoutChild_autoptr] = Tag.Ptr[GtkLayoutChild](GtkLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkLayoutChild]): GtkLayoutChild_autoptr = o
  extension (v: GtkLayoutChild_autoptr)
    inline def value: Ptr[GtkLayoutChild] = v