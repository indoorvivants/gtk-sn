package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIconView_autoptr = Ptr[GtkIconView]
object GtkIconView_autoptr:
  given _tag: Tag[GtkIconView_autoptr] = Tag.Ptr[GtkIconView](GtkIconView._tag)
  inline def apply(inline o: Ptr[GtkIconView]): GtkIconView_autoptr = o
  extension (v: GtkIconView_autoptr)
    inline def value: Ptr[GtkIconView] = v