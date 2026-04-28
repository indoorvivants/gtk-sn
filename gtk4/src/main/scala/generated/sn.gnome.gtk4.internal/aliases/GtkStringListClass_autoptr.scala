package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringListClass_autoptr = Ptr[GtkStringListClass]
object GtkStringListClass_autoptr:
  given _tag: Tag[GtkStringListClass_autoptr] = Tag.Ptr[GtkStringListClass](GtkStringListClass._tag)
  inline def apply(inline o: Ptr[GtkStringListClass]): GtkStringListClass_autoptr = o
  extension (v: GtkStringListClass_autoptr)
    inline def value: Ptr[GtkStringListClass] = v