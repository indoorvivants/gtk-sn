package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreePath_autoptr = Ptr[GtkTreePath]
object GtkTreePath_autoptr:
  given _tag: Tag[GtkTreePath_autoptr] = Tag.Ptr[GtkTreePath](GtkTreePath._tag)
  inline def apply(inline o: Ptr[GtkTreePath]): GtkTreePath_autoptr = o
  extension (v: GtkTreePath_autoptr)
    inline def value: Ptr[GtkTreePath] = v