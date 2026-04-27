package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFilterClass_autoptr = Ptr[GtkFilterClass]
object GtkFilterClass_autoptr:
  given _tag: Tag[GtkFilterClass_autoptr] = Tag.Ptr[GtkFilterClass](GtkFilterClass._tag)
  inline def apply(inline o: Ptr[GtkFilterClass]): GtkFilterClass_autoptr = o
  extension (v: GtkFilterClass_autoptr)
    inline def value: Ptr[GtkFilterClass] = v