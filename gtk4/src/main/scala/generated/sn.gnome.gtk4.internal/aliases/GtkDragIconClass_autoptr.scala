package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDragIconClass_autoptr = Ptr[GtkDragIconClass]
object GtkDragIconClass_autoptr:
  given _tag: Tag[GtkDragIconClass_autoptr] = Tag.Ptr[GtkDragIconClass](GtkDragIconClass._tag)
  inline def apply(inline o: Ptr[GtkDragIconClass]): GtkDragIconClass_autoptr = o
  extension (v: GtkDragIconClass_autoptr)
    inline def value: Ptr[GtkDragIconClass] = v