package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkScrollInfo_autoptr = Ptr[GtkScrollInfo]
object GtkScrollInfo_autoptr:
  given _tag: Tag[GtkScrollInfo_autoptr] = Tag.Ptr[GtkScrollInfo](GtkScrollInfo._tag)
  inline def apply(inline o: Ptr[GtkScrollInfo]): GtkScrollInfo_autoptr = o
  extension (v: GtkScrollInfo_autoptr)
    inline def value: Ptr[GtkScrollInfo] = v