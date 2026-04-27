package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAllocation: : the X position of the widget’s area relative to its parents allocation. : the Y position of the widget’s area relative to its parents allocation. : the width of the widget’s allocated area. : the height of the widget’s allocated area.
*/
type GtkAllocation = GdkRectangle
object GtkAllocation:
  given _tag: Tag[GtkAllocation] = GdkRectangle._tag
  inline def apply(inline o: GdkRectangle): GtkAllocation = o
  extension (v: GtkAllocation)
    inline def value: GdkRectangle = v