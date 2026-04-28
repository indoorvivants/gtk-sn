package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererAccel_autoptr = Ptr[GtkCellRendererAccel]
object GtkCellRendererAccel_autoptr:
  given _tag: Tag[GtkCellRendererAccel_autoptr] = Tag.Ptr[GtkCellRendererAccel](GtkCellRendererAccel._tag)
  inline def apply(inline o: Ptr[GtkCellRendererAccel]): GtkCellRendererAccel_autoptr = o
  extension (v: GtkCellRendererAccel_autoptr)
    inline def value: Ptr[GtkCellRendererAccel] = v