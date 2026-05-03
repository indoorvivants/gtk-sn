package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbufLoader_autoptr = Ptr[GdkPixbufLoader]
object GdkPixbufLoader_autoptr:
  given _tag: Tag[GdkPixbufLoader_autoptr] = Tag.Ptr[GdkPixbufLoader](GdkPixbufLoader._tag)
  inline def apply(inline o: Ptr[GdkPixbufLoader]): GdkPixbufLoader_autoptr = o
  extension (v: GdkPixbufLoader_autoptr)
    inline def value: Ptr[GdkPixbufLoader] = v