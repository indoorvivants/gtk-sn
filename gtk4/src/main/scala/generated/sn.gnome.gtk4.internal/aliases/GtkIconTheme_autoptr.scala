package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIconTheme_autoptr = Ptr[GtkIconTheme]
object GtkIconTheme_autoptr:
  given _tag: Tag[GtkIconTheme_autoptr] = Tag.Ptr[GtkIconTheme](GtkIconTheme._tag)
  inline def apply(inline o: Ptr[GtkIconTheme]): GtkIconTheme_autoptr = o
  extension (v: GtkIconTheme_autoptr)
    inline def value: Ptr[GtkIconTheme] = v