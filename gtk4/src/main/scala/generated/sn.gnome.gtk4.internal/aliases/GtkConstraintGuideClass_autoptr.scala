package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraintGuideClass_autoptr = Ptr[GtkConstraintGuideClass]
object GtkConstraintGuideClass_autoptr:
  given _tag: Tag[GtkConstraintGuideClass_autoptr] = Tag.Ptr[GtkConstraintGuideClass](GtkConstraintGuideClass._tag)
  inline def apply(inline o: Ptr[GtkConstraintGuideClass]): GtkConstraintGuideClass_autoptr = o
  extension (v: GtkConstraintGuideClass_autoptr)
    inline def value: Ptr[GtkConstraintGuideClass] = v