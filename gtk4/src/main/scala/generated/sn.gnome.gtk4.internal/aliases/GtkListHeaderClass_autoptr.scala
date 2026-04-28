package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListHeaderClass_autoptr = Ptr[GtkListHeaderClass]
object GtkListHeaderClass_autoptr:
  given _tag: Tag[GtkListHeaderClass_autoptr] = Tag.Ptr[GtkListHeaderClass](GtkListHeaderClass._tag)
  inline def apply(inline o: Ptr[GtkListHeaderClass]): GtkListHeaderClass_autoptr = o
  extension (v: GtkListHeaderClass_autoptr)
    inline def value: Ptr[GtkListHeaderClass] = v