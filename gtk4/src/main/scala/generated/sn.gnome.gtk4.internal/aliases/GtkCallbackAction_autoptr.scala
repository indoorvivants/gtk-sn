package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCallbackAction_autoptr = Ptr[GtkCallbackAction]
object GtkCallbackAction_autoptr:
  given _tag: Tag[GtkCallbackAction_autoptr] = Tag.Ptr[GtkCallbackAction](GtkCallbackAction._tag)
  inline def apply(inline o: Ptr[GtkCallbackAction]): GtkCallbackAction_autoptr = o
  extension (v: GtkCallbackAction_autoptr)
    inline def value: Ptr[GtkCallbackAction] = v