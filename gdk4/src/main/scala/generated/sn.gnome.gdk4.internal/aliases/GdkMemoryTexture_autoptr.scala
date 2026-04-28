package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkMemoryTexture_autoptr = Ptr[GdkMemoryTexture]
object GdkMemoryTexture_autoptr:
  given _tag: Tag[GdkMemoryTexture_autoptr] = Tag.Ptr[GdkMemoryTexture](GdkMemoryTexture._tag)
  inline def apply(inline o: Ptr[GdkMemoryTexture]): GdkMemoryTexture_autoptr = o
  extension (v: GdkMemoryTexture_autoptr)
    inline def value: Ptr[GdkMemoryTexture] = v