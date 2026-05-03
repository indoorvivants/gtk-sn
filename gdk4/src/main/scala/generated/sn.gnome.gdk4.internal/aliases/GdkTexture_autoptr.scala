package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkTexture_autoptr = Ptr[GdkTexture]
object GdkTexture_autoptr:
  given _tag: Tag[GdkTexture_autoptr] = Tag.Ptr[GdkTexture](GdkTexture._tag)
  inline def apply(inline o: Ptr[GdkTexture]): GdkTexture_autoptr = o
  extension (v: GdkTexture_autoptr)
    inline def value: Ptr[GdkTexture] = v