package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPopover_autoptr = Ptr[GtkPopover]
object GtkPopover_autoptr:
  given _tag: Tag[GtkPopover_autoptr] = Tag.Ptr[GtkPopover](GtkPopover._tag)
  inline def apply(inline o: Ptr[GtkPopover]): GtkPopover_autoptr = o
  extension (v: GtkPopover_autoptr)
    inline def value: Ptr[GtkPopover] = v