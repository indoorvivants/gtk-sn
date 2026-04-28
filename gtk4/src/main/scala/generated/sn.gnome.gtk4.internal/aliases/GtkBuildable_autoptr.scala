package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBuildable_autoptr = Ptr[GtkBuildable]
object GtkBuildable_autoptr:
  given _tag: Tag[GtkBuildable_autoptr] = Tag.Ptr[GtkBuildable](GtkBuildable._tag)
  inline def apply(inline o: Ptr[GtkBuildable]): GtkBuildable_autoptr = o
  extension (v: GtkBuildable_autoptr)
    inline def value: Ptr[GtkBuildable] = v