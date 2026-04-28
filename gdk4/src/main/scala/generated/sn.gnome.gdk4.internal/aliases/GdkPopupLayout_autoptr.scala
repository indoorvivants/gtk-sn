package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPopupLayout_autoptr = Ptr[GdkPopupLayout]
object GdkPopupLayout_autoptr:
  given _tag: Tag[GdkPopupLayout_autoptr] = Tag.Ptr[GdkPopupLayout](GdkPopupLayout._tag)
  inline def apply(inline o: Ptr[GdkPopupLayout]): GdkPopupLayout_autoptr = o
  extension (v: GdkPopupLayout_autoptr)
    inline def value: Ptr[GdkPopupLayout] = v