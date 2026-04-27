package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCheckButton_autoptr = Ptr[GtkCheckButton]
object GtkCheckButton_autoptr:
  given _tag: Tag[GtkCheckButton_autoptr] = Tag.Ptr[GtkCheckButton](GtkCheckButton._tag)
  inline def apply(inline o: Ptr[GtkCheckButton]): GtkCheckButton_autoptr = o
  extension (v: GtkCheckButton_autoptr)
    inline def value: Ptr[GtkCheckButton] = v