package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridLayoutChild_autoptr = Ptr[GtkGridLayoutChild]
object GtkGridLayoutChild_autoptr:
  given _tag: Tag[GtkGridLayoutChild_autoptr] = Tag.Ptr[GtkGridLayoutChild](GtkGridLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChild]): GtkGridLayoutChild_autoptr = o
  extension (v: GtkGridLayoutChild_autoptr)
    inline def value: Ptr[GtkGridLayoutChild] = v