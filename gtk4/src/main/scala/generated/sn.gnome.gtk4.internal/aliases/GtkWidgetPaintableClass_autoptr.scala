package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWidgetPaintableClass_autoptr = Ptr[GtkWidgetPaintableClass]
object GtkWidgetPaintableClass_autoptr:
  given _tag: Tag[GtkWidgetPaintableClass_autoptr] = Tag.Ptr[GtkWidgetPaintableClass](GtkWidgetPaintableClass._tag)
  inline def apply(inline o: Ptr[GtkWidgetPaintableClass]): GtkWidgetPaintableClass_autoptr = o
  extension (v: GtkWidgetPaintableClass_autoptr)
    inline def value: Ptr[GtkWidgetPaintableClass] = v