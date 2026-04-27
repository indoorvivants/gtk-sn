package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBoxLayoutClass_autoptr = Ptr[GtkBoxLayoutClass]
object GtkBoxLayoutClass_autoptr:
  given _tag: Tag[GtkBoxLayoutClass_autoptr] = Tag.Ptr[GtkBoxLayoutClass](GtkBoxLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkBoxLayoutClass]): GtkBoxLayoutClass_autoptr = o
  extension (v: GtkBoxLayoutClass_autoptr)
    inline def value: Ptr[GtkBoxLayoutClass] = v