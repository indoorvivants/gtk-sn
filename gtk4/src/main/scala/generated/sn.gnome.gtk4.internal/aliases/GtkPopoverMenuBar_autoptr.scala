package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPopoverMenuBar_autoptr = Ptr[GtkPopoverMenuBar]
object GtkPopoverMenuBar_autoptr:
  given _tag: Tag[GtkPopoverMenuBar_autoptr] = Tag.Ptr[GtkPopoverMenuBar](GtkPopoverMenuBar._tag)
  inline def apply(inline o: Ptr[GtkPopoverMenuBar]): GtkPopoverMenuBar_autoptr = o
  extension (v: GtkPopoverMenuBar_autoptr)
    inline def value: Ptr[GtkPopoverMenuBar] = v