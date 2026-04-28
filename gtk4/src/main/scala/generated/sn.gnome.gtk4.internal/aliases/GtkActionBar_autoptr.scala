package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkActionBar_autoptr = Ptr[GtkActionBar]
object GtkActionBar_autoptr:
  given _tag: Tag[GtkActionBar_autoptr] = Tag.Ptr[GtkActionBar](GtkActionBar._tag)
  inline def apply(inline o: Ptr[GtkActionBar]): GtkActionBar_autoptr = o
  extension (v: GtkActionBar_autoptr)
    inline def value: Ptr[GtkActionBar] = v