package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkActivateActionClass_autoptr = Ptr[GtkActivateActionClass]
object GtkActivateActionClass_autoptr:
  given _tag: Tag[GtkActivateActionClass_autoptr] = Tag.Ptr[GtkActivateActionClass](GtkActivateActionClass._tag)
  inline def apply(inline o: Ptr[GtkActivateActionClass]): GtkActivateActionClass_autoptr = o
  extension (v: GtkActivateActionClass_autoptr)
    inline def value: Ptr[GtkActivateActionClass] = v