package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraint_autoptr = Ptr[GtkConstraint]
object GtkConstraint_autoptr:
  given _tag: Tag[GtkConstraint_autoptr] = Tag.Ptr[GtkConstraint](GtkConstraint._tag)
  inline def apply(inline o: Ptr[GtkConstraint]): GtkConstraint_autoptr = o
  extension (v: GtkConstraint_autoptr)
    inline def value: Ptr[GtkConstraint] = v