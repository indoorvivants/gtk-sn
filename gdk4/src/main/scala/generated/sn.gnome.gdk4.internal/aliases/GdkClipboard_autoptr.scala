package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkClipboard_autoptr = Ptr[GdkClipboard]
object GdkClipboard_autoptr:
  given _tag: Tag[GdkClipboard_autoptr] = Tag.Ptr[GdkClipboard](GdkClipboard._tag)
  inline def apply(inline o: Ptr[GdkClipboard]): GdkClipboard_autoptr = o
  extension (v: GdkClipboard_autoptr)
    inline def value: Ptr[GdkClipboard] = v