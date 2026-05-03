package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNamedAction_autoptr = Ptr[GtkNamedAction]
object GtkNamedAction_autoptr:
  given _tag: Tag[GtkNamedAction_autoptr] = Tag.Ptr[GtkNamedAction](GtkNamedAction._tag)
  inline def apply(inline o: Ptr[GtkNamedAction]): GtkNamedAction_autoptr = o
  extension (v: GtkNamedAction_autoptr)
    inline def value: Ptr[GtkNamedAction] = v