package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMenuButton_autoptr = Ptr[GtkMenuButton]
object GtkMenuButton_autoptr:
  given _tag: Tag[GtkMenuButton_autoptr] = Tag.Ptr[GtkMenuButton](GtkMenuButton._tag)
  inline def apply(inline o: Ptr[GtkMenuButton]): GtkMenuButton_autoptr = o
  extension (v: GtkMenuButton_autoptr)
    inline def value: Ptr[GtkMenuButton] = v