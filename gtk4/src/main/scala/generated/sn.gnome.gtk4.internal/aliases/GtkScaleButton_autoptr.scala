package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkScaleButton_autoptr = Ptr[GtkScaleButton]
object GtkScaleButton_autoptr:
  given _tag: Tag[GtkScaleButton_autoptr] = Tag.Ptr[GtkScaleButton](GtkScaleButton._tag)
  inline def apply(inline o: Ptr[GtkScaleButton]): GtkScaleButton_autoptr = o
  extension (v: GtkScaleButton_autoptr)
    inline def value: Ptr[GtkScaleButton] = v