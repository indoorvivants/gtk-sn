package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbufAnimationIter_autoptr = Ptr[GdkPixbufAnimationIter]
object GdkPixbufAnimationIter_autoptr:
  given _tag: Tag[GdkPixbufAnimationIter_autoptr] = Tag.Ptr[GdkPixbufAnimationIter](GdkPixbufAnimationIter._tag)
  inline def apply(inline o: Ptr[GdkPixbufAnimationIter]): GdkPixbufAnimationIter_autoptr = o
  extension (v: GdkPixbufAnimationIter_autoptr)
    inline def value: Ptr[GdkPixbufAnimationIter] = v