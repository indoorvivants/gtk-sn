package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcutClass_autoptr = Ptr[GtkShortcutClass]
object GtkShortcutClass_autoptr:
  given _tag: Tag[GtkShortcutClass_autoptr] = Tag.Ptr[GtkShortcutClass](GtkShortcutClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutClass]): GtkShortcutClass_autoptr = o
  extension (v: GtkShortcutClass_autoptr)
    inline def value: Ptr[GtkShortcutClass] = v