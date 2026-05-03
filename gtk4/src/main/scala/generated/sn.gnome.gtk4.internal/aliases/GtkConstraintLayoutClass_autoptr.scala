package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraintLayoutClass_autoptr = Ptr[GtkConstraintLayoutClass]
object GtkConstraintLayoutClass_autoptr:
  given _tag: Tag[GtkConstraintLayoutClass_autoptr] = Tag.Ptr[GtkConstraintLayoutClass](GtkConstraintLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintLayoutClass]): GtkConstraintLayoutClass_autoptr = o
  extension (v: GtkConstraintLayoutClass_autoptr)
    inline def value: Ptr[GtkConstraintLayoutClass] = v