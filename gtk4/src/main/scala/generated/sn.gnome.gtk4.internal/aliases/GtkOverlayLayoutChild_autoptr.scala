package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOverlayLayoutChild_autoptr = Ptr[GtkOverlayLayoutChild]
object GtkOverlayLayoutChild_autoptr:
  given _tag: Tag[GtkOverlayLayoutChild_autoptr] = Tag.Ptr[GtkOverlayLayoutChild](GtkOverlayLayoutChild._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayoutChild]): GtkOverlayLayoutChild_autoptr = o
  extension (v: GtkOverlayLayoutChild_autoptr)
    inline def value: Ptr[GtkOverlayLayoutChild] = v