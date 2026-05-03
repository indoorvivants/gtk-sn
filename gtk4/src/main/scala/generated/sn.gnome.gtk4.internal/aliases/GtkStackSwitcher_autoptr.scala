package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStackSwitcher_autoptr = Ptr[GtkStackSwitcher]
object GtkStackSwitcher_autoptr:
  given _tag: Tag[GtkStackSwitcher_autoptr] = Tag.Ptr[GtkStackSwitcher](GtkStackSwitcher._tag)
  inline def apply(inline o: Ptr[GtkStackSwitcher]): GtkStackSwitcher_autoptr = o
  extension (v: GtkStackSwitcher_autoptr)
    inline def value: Ptr[GtkStackSwitcher] = v