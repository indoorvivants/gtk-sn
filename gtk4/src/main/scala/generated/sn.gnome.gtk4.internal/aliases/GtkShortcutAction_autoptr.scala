package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcutAction_autoptr = Ptr[GtkShortcutAction]
object GtkShortcutAction_autoptr:
  given _tag: Tag[GtkShortcutAction_autoptr] = Tag.Ptr[GtkShortcutAction](GtkShortcutAction._tag)
  inline def apply(inline o: Ptr[GtkShortcutAction]): GtkShortcutAction_autoptr = o
  extension (v: GtkShortcutAction_autoptr)
    inline def value: Ptr[GtkShortcutAction] = v