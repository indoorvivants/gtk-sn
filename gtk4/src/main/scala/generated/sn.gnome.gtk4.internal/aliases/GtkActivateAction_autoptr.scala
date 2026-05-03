package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkActivateAction_autoptr = Ptr[GtkActivateAction]
object GtkActivateAction_autoptr:
  given _tag: Tag[GtkActivateAction_autoptr] = Tag.Ptr[GtkActivateAction](GtkActivateAction._tag)
  inline def apply(inline o: Ptr[GtkActivateAction]): GtkActivateAction_autoptr = o
  extension (v: GtkActivateAction_autoptr)
    inline def value: Ptr[GtkActivateAction] = v