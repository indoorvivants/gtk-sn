package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPixbufSimpleAnim_autoptr = Ptr[GdkPixbufSimpleAnim]
object GdkPixbufSimpleAnim_autoptr:
  given _tag: Tag[GdkPixbufSimpleAnim_autoptr] = Tag.Ptr[GdkPixbufSimpleAnim](GdkPixbufSimpleAnim._tag)
  inline def apply(inline o: Ptr[GdkPixbufSimpleAnim]): GdkPixbufSimpleAnim_autoptr = o
  extension (v: GdkPixbufSimpleAnim_autoptr)
    inline def value: Ptr[GdkPixbufSimpleAnim] = v