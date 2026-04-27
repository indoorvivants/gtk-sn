package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkEveryFilterClass_autoptr = Ptr[GtkEveryFilterClass]
object GtkEveryFilterClass_autoptr:
  given _tag: Tag[GtkEveryFilterClass_autoptr] = Tag.Ptr[GtkEveryFilterClass](GtkEveryFilterClass._tag)
  inline def apply(inline o: Ptr[GtkEveryFilterClass]): GtkEveryFilterClass_autoptr = o
  extension (v: GtkEveryFilterClass_autoptr)
    inline def value: Ptr[GtkEveryFilterClass] = v