package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCustomFilterClass_autoptr = Ptr[GtkCustomFilterClass]
object GtkCustomFilterClass_autoptr:
  given _tag: Tag[GtkCustomFilterClass_autoptr] = Tag.Ptr[GtkCustomFilterClass](GtkCustomFilterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomFilterClass]): GtkCustomFilterClass_autoptr = o
  extension (v: GtkCustomFilterClass_autoptr)
    inline def value: Ptr[GtkCustomFilterClass] = v