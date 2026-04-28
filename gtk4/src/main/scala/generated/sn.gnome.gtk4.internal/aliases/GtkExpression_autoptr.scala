package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkExpression_autoptr = Ptr[GtkExpression]
object GtkExpression_autoptr:
  given _tag: Tag[GtkExpression_autoptr] = Tag.Ptr[GtkExpression](GtkExpression._tag)
  inline def apply(inline o: Ptr[GtkExpression]): GtkExpression_autoptr = o
  extension (v: GtkExpression_autoptr)
    inline def value: Ptr[GtkExpression] = v