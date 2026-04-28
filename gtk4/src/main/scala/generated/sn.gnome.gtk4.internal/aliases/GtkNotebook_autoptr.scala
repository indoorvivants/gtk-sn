package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNotebook_autoptr = Ptr[GtkNotebook]
object GtkNotebook_autoptr:
  given _tag: Tag[GtkNotebook_autoptr] = Tag.Ptr[GtkNotebook](GtkNotebook._tag)
  inline def apply(inline o: Ptr[GtkNotebook]): GtkNotebook_autoptr = o
  extension (v: GtkNotebook_autoptr)
    inline def value: Ptr[GtkNotebook] = v