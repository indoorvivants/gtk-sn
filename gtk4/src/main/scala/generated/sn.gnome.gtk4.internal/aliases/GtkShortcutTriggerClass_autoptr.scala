package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcutTriggerClass_autoptr = Ptr[GtkShortcutTriggerClass]
object GtkShortcutTriggerClass_autoptr:
  given _tag: Tag[GtkShortcutTriggerClass_autoptr] = Tag.Ptr[GtkShortcutTriggerClass](GtkShortcutTriggerClass._tag)
  inline def apply(inline o: Ptr[GtkShortcutTriggerClass]): GtkShortcutTriggerClass_autoptr = o
  extension (v: GtkShortcutTriggerClass_autoptr)
    inline def value: Ptr[GtkShortcutTriggerClass] = v