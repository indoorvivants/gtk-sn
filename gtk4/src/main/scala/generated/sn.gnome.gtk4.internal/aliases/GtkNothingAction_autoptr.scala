package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNothingAction_autoptr = Ptr[GtkNothingAction]
object GtkNothingAction_autoptr:
  given _tag: Tag[GtkNothingAction_autoptr] = Tag.Ptr[GtkNothingAction](GtkNothingAction._tag)
  inline def apply(inline o: Ptr[GtkNothingAction]): GtkNothingAction_autoptr = o
  extension (v: GtkNothingAction_autoptr)
    inline def value: Ptr[GtkNothingAction] = v