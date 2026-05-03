package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbuf_autoptr = Ptr[GdkPixbuf]
object GdkPixbuf_autoptr:
  given _tag: Tag[GdkPixbuf_autoptr] = Tag.Ptr[GdkPixbuf](GdkPixbuf._tag)
  inline def apply(inline o: Ptr[GdkPixbuf]): GdkPixbuf_autoptr = o
  extension (v: GdkPixbuf_autoptr)
    inline def value: Ptr[GdkPixbuf] = v