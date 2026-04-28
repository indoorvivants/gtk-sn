package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskGLShaderClass_autoptr = Ptr[GskGLShaderClass]
object GskGLShaderClass_autoptr:
  given _tag: Tag[GskGLShaderClass_autoptr] = Tag.Ptr[GskGLShaderClass](GskGLShaderClass._tag)
  inline def apply(inline o: Ptr[GskGLShaderClass]): GskGLShaderClass_autoptr = o
  extension (v: GskGLShaderClass_autoptr)
    inline def value: Ptr[GskGLShaderClass] = v