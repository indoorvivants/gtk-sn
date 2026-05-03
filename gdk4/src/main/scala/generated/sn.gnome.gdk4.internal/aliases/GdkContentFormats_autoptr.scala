package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkContentFormats_autoptr = Ptr[GdkContentFormats]
object GdkContentFormats_autoptr:
  given _tag: Tag[GdkContentFormats_autoptr] = Tag.Ptr[GdkContentFormats](GdkContentFormats._tag)
  inline def apply(inline o: Ptr[GdkContentFormats]): GdkContentFormats_autoptr = o
  extension (v: GdkContentFormats_autoptr)
    inline def value: Ptr[GdkContentFormats] = v