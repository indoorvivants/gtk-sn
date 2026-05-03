package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkShortcut_autoptr = Ptr[GtkShortcut]
object GtkShortcut_autoptr:
  given _tag: Tag[GtkShortcut_autoptr] = Tag.Ptr[GtkShortcut](GtkShortcut._tag)
  inline def apply(inline o: Ptr[GtkShortcut]): GtkShortcut_autoptr = o
  extension (v: GtkShortcut_autoptr)
    inline def value: Ptr[GtkShortcut] = v