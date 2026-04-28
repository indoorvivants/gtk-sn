package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkLevelBar_autoptr = Ptr[GtkLevelBar]
object GtkLevelBar_autoptr:
  given _tag: Tag[GtkLevelBar_autoptr] = Tag.Ptr[GtkLevelBar](GtkLevelBar._tag)
  inline def apply(inline o: Ptr[GtkLevelBar]): GtkLevelBar_autoptr = o
  extension (v: GtkLevelBar_autoptr)
    inline def value: Ptr[GtkLevelBar] = v