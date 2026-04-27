package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkProgressBar_autoptr = Ptr[GtkProgressBar]
object GtkProgressBar_autoptr:
  given _tag: Tag[GtkProgressBar_autoptr] = Tag.Ptr[GtkProgressBar](GtkProgressBar._tag)
  inline def apply(inline o: Ptr[GtkProgressBar]): GtkProgressBar_autoptr = o
  extension (v: GtkProgressBar_autoptr)
    inline def value: Ptr[GtkProgressBar] = v