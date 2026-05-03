package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDragIcon_autoptr = Ptr[GtkDragIcon]
object GtkDragIcon_autoptr:
  given _tag: Tag[GtkDragIcon_autoptr] = Tag.Ptr[GtkDragIcon](GtkDragIcon._tag)
  inline def apply(inline o: Ptr[GtkDragIcon]): GtkDragIcon_autoptr = o
  extension (v: GtkDragIcon_autoptr)
    inline def value: Ptr[GtkDragIcon] = v