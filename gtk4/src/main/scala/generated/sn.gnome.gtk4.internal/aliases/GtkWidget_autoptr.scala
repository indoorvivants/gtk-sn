package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWidget_autoptr = Ptr[GtkWidget]
object GtkWidget_autoptr:
  given _tag: Tag[GtkWidget_autoptr] = Tag.Ptr[GtkWidget](GtkWidget._tag)
  inline def apply(inline o: Ptr[GtkWidget]): GtkWidget_autoptr = o
  extension (v: GtkWidget_autoptr)
    inline def value: Ptr[GtkWidget] = v