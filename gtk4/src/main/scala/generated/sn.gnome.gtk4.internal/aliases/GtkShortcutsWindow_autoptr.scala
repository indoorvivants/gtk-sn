package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcutsWindow_autoptr = Ptr[GtkShortcutsWindow]
object GtkShortcutsWindow_autoptr:
  given _tag: Tag[GtkShortcutsWindow_autoptr] = Tag.Ptr[GtkShortcutsWindow](GtkShortcutsWindow._tag)
  inline def apply(inline o: Ptr[GtkShortcutsWindow]): GtkShortcutsWindow_autoptr = o
  extension (v: GtkShortcutsWindow_autoptr)
    inline def value: Ptr[GtkShortcutsWindow] = v