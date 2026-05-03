package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSpinner_autoptr = Ptr[GtkSpinner]
object GtkSpinner_autoptr:
  given _tag: Tag[GtkSpinner_autoptr] = Tag.Ptr[GtkSpinner](GtkSpinner._tag)
  inline def apply(inline o: Ptr[GtkSpinner]): GtkSpinner_autoptr = o
  extension (v: GtkSpinner_autoptr)
    inline def value: Ptr[GtkSpinner] = v