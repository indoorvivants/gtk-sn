package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererPixbuf_autoptr = Ptr[GtkCellRendererPixbuf]
object GtkCellRendererPixbuf_autoptr:
  given _tag: Tag[GtkCellRendererPixbuf_autoptr] = Tag.Ptr[GtkCellRendererPixbuf](GtkCellRendererPixbuf._tag)
  inline def apply(inline o: Ptr[GtkCellRendererPixbuf]): GtkCellRendererPixbuf_autoptr = o
  extension (v: GtkCellRendererPixbuf_autoptr)
    inline def value: Ptr[GtkCellRendererPixbuf] = v