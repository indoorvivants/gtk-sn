package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererText_autoptr = Ptr[GtkCellRendererText]
object GtkCellRendererText_autoptr:
  given _tag: Tag[GtkCellRendererText_autoptr] = Tag.Ptr[GtkCellRendererText](GtkCellRendererText._tag)
  inline def apply(inline o: Ptr[GtkCellRendererText]): GtkCellRendererText_autoptr = o
  extension (v: GtkCellRendererText_autoptr)
    inline def value: Ptr[GtkCellRendererText] = v