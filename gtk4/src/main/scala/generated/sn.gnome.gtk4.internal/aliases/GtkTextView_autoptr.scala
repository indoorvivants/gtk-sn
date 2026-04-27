package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextView_autoptr = Ptr[GtkTextView]
object GtkTextView_autoptr:
  given _tag: Tag[GtkTextView_autoptr] = Tag.Ptr[GtkTextView](GtkTextView._tag)
  inline def apply(inline o: Ptr[GtkTextView]): GtkTextView_autoptr = o
  extension (v: GtkTextView_autoptr)
    inline def value: Ptr[GtkTextView] = v