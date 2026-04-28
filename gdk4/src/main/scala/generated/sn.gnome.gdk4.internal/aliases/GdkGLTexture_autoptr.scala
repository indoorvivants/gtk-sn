package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkGLTexture_autoptr = Ptr[GdkGLTexture]
object GdkGLTexture_autoptr:
  given _tag: Tag[GdkGLTexture_autoptr] = Tag.Ptr[GdkGLTexture](GdkGLTexture._tag)
  inline def apply(inline o: Ptr[GdkGLTexture]): GdkGLTexture_autoptr = o
  extension (v: GdkGLTexture_autoptr)
    inline def value: Ptr[GdkGLTexture] = v