package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskGLShader_autoptr = Ptr[GskGLShader]
object GskGLShader_autoptr:
  given _tag: Tag[GskGLShader_autoptr] = Tag.Ptr[GskGLShader](GskGLShader._tag)
  inline def apply(inline o: Ptr[GskGLShader]): GskGLShader_autoptr = o
  extension (v: GskGLShader_autoptr)
    inline def value: Ptr[GskGLShader] = v