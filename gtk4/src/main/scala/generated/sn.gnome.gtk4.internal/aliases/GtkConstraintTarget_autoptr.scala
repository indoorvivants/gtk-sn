package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraintTarget_autoptr = Ptr[GtkConstraintTarget]
object GtkConstraintTarget_autoptr:
  given _tag: Tag[GtkConstraintTarget_autoptr] = Tag.Ptr[GtkConstraintTarget](GtkConstraintTarget._tag)
  inline def apply(inline o: Ptr[GtkConstraintTarget]): GtkConstraintTarget_autoptr = o
  extension (v: GtkConstraintTarget_autoptr)
    inline def value: Ptr[GtkConstraintTarget] = v