package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcutActionClass_autoptr = Ptr[GtkShortcutActionClass]
object GtkShortcutActionClass_autoptr:
  given _tag: Tag[GtkShortcutActionClass_autoptr] = Tag.Ptr[GtkShortcutActionClass](GtkShortcutActionClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutActionClass]): GtkShortcutActionClass_autoptr = o
  extension (v: GtkShortcutActionClass_autoptr)
    inline def value: Ptr[GtkShortcutActionClass] = v