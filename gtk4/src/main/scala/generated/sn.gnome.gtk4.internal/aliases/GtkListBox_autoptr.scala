package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListBox_autoptr = Ptr[GtkListBox]
object GtkListBox_autoptr:
  given _tag: Tag[GtkListBox_autoptr] = Tag.Ptr[GtkListBox](GtkListBox._tag)
  inline def apply(inline o: Ptr[GtkListBox]): GtkListBox_autoptr = o
  extension (v: GtkListBox_autoptr)
    inline def value: Ptr[GtkListBox] = v