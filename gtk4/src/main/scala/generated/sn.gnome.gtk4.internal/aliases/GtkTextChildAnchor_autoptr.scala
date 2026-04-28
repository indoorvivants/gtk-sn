package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextChildAnchor_autoptr = Ptr[GtkTextChildAnchor]
object GtkTextChildAnchor_autoptr:
  given _tag: Tag[GtkTextChildAnchor_autoptr] = Tag.Ptr[GtkTextChildAnchor](GtkTextChildAnchor._tag)
  inline def apply(inline o: Ptr[GtkTextChildAnchor]): GtkTextChildAnchor_autoptr = o
  extension (v: GtkTextChildAnchor_autoptr)
    inline def value: Ptr[GtkTextChildAnchor] = v