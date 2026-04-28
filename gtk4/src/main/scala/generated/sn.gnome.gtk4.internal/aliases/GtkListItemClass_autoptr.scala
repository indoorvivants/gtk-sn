package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListItemClass_autoptr = Ptr[GtkListItemClass]
object GtkListItemClass_autoptr:
  given _tag: Tag[GtkListItemClass_autoptr] = Tag.Ptr[GtkListItemClass](GtkListItemClass._tag)
  inline def apply(inline o: Ptr[GtkListItemClass]): GtkListItemClass_autoptr = o
  extension (v: GtkListItemClass_autoptr)
    inline def value: Ptr[GtkListItemClass] = v