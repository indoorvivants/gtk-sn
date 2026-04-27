package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFileDialog_autoptr = Ptr[GtkFileDialog]
object GtkFileDialog_autoptr:
  given _tag: Tag[GtkFileDialog_autoptr] = Tag.Ptr[GtkFileDialog](GtkFileDialog._tag)
  inline def apply(inline o: Ptr[GtkFileDialog]): GtkFileDialog_autoptr = o
  extension (v: GtkFileDialog_autoptr)
    inline def value: Ptr[GtkFileDialog] = v