package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcutManager_autoptr = Ptr[GtkShortcutManager]
object GtkShortcutManager_autoptr:
  given _tag: Tag[GtkShortcutManager_autoptr] = Tag.Ptr[GtkShortcutManager](GtkShortcutManager._tag)
  inline def apply(inline o: Ptr[GtkShortcutManager]): GtkShortcutManager_autoptr = o
  extension (v: GtkShortcutManager_autoptr)
    inline def value: Ptr[GtkShortcutManager] = v