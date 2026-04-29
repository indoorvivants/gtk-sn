package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbufAnimation_autoptr = Ptr[GdkPixbufAnimation]
object GdkPixbufAnimation_autoptr:
  given _tag: Tag[GdkPixbufAnimation_autoptr] = Tag.Ptr[GdkPixbufAnimation](GdkPixbufAnimation._tag)
  inline def apply(inline o: Ptr[GdkPixbufAnimation]): GdkPixbufAnimation_autoptr = o
  extension (v: GdkPixbufAnimation_autoptr)
    inline def value: Ptr[GdkPixbufAnimation] = v