package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkEditable_autoptr = Ptr[GtkEditable]
object GtkEditable_autoptr:
  given _tag: Tag[GtkEditable_autoptr] = Tag.Ptr[GtkEditable](GtkEditable._tag)
  inline def apply(inline o: Ptr[GtkEditable]): GtkEditable_autoptr = o
  extension (v: GtkEditable_autoptr)
    inline def value: Ptr[GtkEditable] = v