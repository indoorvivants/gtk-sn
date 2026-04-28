package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeExpanderClass_autoptr = Ptr[GtkTreeExpanderClass]
object GtkTreeExpanderClass_autoptr:
  given _tag: Tag[GtkTreeExpanderClass_autoptr] = Tag.Ptr[GtkTreeExpanderClass](GtkTreeExpanderClass._tag)
  inline def apply(inline o: Ptr[GtkTreeExpanderClass]): GtkTreeExpanderClass_autoptr = o
  extension (v: GtkTreeExpanderClass_autoptr)
    inline def value: Ptr[GtkTreeExpanderClass] = v