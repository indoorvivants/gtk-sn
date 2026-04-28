package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDropDown_autoptr = Ptr[GtkDropDown]
object GtkDropDown_autoptr:
  given _tag: Tag[GtkDropDown_autoptr] = Tag.Ptr[GtkDropDown](GtkDropDown._tag)
  inline def apply(inline o: Ptr[GtkDropDown]): GtkDropDown_autoptr = o
  extension (v: GtkDropDown_autoptr)
    inline def value: Ptr[GtkDropDown] = v