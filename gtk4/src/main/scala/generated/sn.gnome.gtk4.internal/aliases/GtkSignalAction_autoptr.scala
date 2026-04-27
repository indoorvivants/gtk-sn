package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSignalAction_autoptr = Ptr[GtkSignalAction]
object GtkSignalAction_autoptr:
  given _tag: Tag[GtkSignalAction_autoptr] = Tag.Ptr[GtkSignalAction](GtkSignalAction._tag)
  inline def apply(inline o: Ptr[GtkSignalAction]): GtkSignalAction_autoptr = o
  extension (v: GtkSignalAction_autoptr)
    inline def value: Ptr[GtkSignalAction] = v