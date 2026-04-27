package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDialog_autoptr = Ptr[GtkDialog]
object GtkDialog_autoptr:
  given _tag: Tag[GtkDialog_autoptr] = Tag.Ptr[GtkDialog](GtkDialog._tag)
  inline def apply(inline o: Ptr[GtkDialog]): GtkDialog_autoptr = o
  extension (v: GtkDialog_autoptr)
    inline def value: Ptr[GtkDialog] = v