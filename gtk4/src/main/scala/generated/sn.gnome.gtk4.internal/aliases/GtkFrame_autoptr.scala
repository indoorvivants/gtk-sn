package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFrame_autoptr = Ptr[GtkFrame]
object GtkFrame_autoptr:
  given _tag: Tag[GtkFrame_autoptr] = Tag.Ptr[GtkFrame](GtkFrame._tag)
  inline def apply(inline o: Ptr[GtkFrame]): GtkFrame_autoptr = o
  extension (v: GtkFrame_autoptr)
    inline def value: Ptr[GtkFrame] = v