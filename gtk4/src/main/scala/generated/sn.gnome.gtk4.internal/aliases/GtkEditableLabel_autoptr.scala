package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkEditableLabel_autoptr = Ptr[GtkEditableLabel]
object GtkEditableLabel_autoptr:
  given _tag: Tag[GtkEditableLabel_autoptr] = Tag.Ptr[GtkEditableLabel](GtkEditableLabel._tag)
  inline def apply(inline o: Ptr[GtkEditableLabel]): GtkEditableLabel_autoptr = o
  extension (v: GtkEditableLabel_autoptr)
    inline def value: Ptr[GtkEditableLabel] = v