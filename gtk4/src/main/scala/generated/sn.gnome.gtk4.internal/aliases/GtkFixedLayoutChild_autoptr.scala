package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFixedLayoutChild_autoptr = Ptr[GtkFixedLayoutChild]
object GtkFixedLayoutChild_autoptr:
  given _tag: Tag[GtkFixedLayoutChild_autoptr] = Tag.Ptr[GtkFixedLayoutChild](GtkFixedLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkFixedLayoutChild]): GtkFixedLayoutChild_autoptr = o
  extension (v: GtkFixedLayoutChild_autoptr)
    inline def value: Ptr[GtkFixedLayoutChild] = v