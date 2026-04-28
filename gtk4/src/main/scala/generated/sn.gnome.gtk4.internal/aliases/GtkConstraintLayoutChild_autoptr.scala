package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraintLayoutChild_autoptr = Ptr[GtkConstraintLayoutChild]
object GtkConstraintLayoutChild_autoptr:
  given _tag: Tag[GtkConstraintLayoutChild_autoptr] = Tag.Ptr[GtkConstraintLayoutChild](GtkConstraintLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutChild]): GtkConstraintLayoutChild_autoptr = o
  extension (v: GtkConstraintLayoutChild_autoptr)
    inline def value: Ptr[GtkConstraintLayoutChild] = v