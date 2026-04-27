package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOverlay_autoptr = Ptr[GtkOverlay]
object GtkOverlay_autoptr:
  given _tag: Tag[GtkOverlay_autoptr] = Tag.Ptr[GtkOverlay](GtkOverlay._tag)
  inline def apply(inline o: Ptr[GtkOverlay]): GtkOverlay_autoptr = o
  extension (v: GtkOverlay_autoptr)
    inline def value: Ptr[GtkOverlay] = v