package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraintClass_autoptr = Ptr[GtkConstraintClass]
object GtkConstraintClass_autoptr:
  given _tag: Tag[GtkConstraintClass_autoptr] = Tag.Ptr[GtkConstraintClass](GtkConstraintClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintClass]): GtkConstraintClass_autoptr = o
  extension (v: GtkConstraintClass_autoptr)
    inline def value: Ptr[GtkConstraintClass] = v