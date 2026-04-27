package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCustomLayoutClass_autoptr = Ptr[GtkCustomLayoutClass]
object GtkCustomLayoutClass_autoptr:
  given _tag: Tag[GtkCustomLayoutClass_autoptr] = Tag.Ptr[GtkCustomLayoutClass](GtkCustomLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkCustomLayoutClass]): GtkCustomLayoutClass_autoptr = o
  extension (v: GtkCustomLayoutClass_autoptr)
    inline def value: Ptr[GtkCustomLayoutClass] = v