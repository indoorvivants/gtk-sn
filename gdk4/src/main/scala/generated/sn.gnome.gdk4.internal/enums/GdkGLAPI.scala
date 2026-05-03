package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkGLAPI: _GL_API_GL: The OpenGL API _GL_API_GLES: The OpenGL ES API
*/
opaque type GdkGLAPI = CUnsignedInt
object GdkGLAPI extends _BindgenEnumCUnsignedInt[GdkGLAPI]:
  given _tag: Tag[GdkGLAPI] = Tag.UInt
  inline def define(inline a: Long): GdkGLAPI = a.toUInt
  val GDK_GL_API_GL = define(1)
  val GDK_GL_API_GLES = define(2)
  def getName(value: GdkGLAPI): Option[String] =
    value match
      case `GDK_GL_API_GL` => Some("GDK_GL_API_GL")
      case `GDK_GL_API_GLES` => Some("GDK_GL_API_GLES")
      case _ => _root_.scala.None
  extension (a: GdkGLAPI)
    inline def &(b: GdkGLAPI): GdkGLAPI = a & b
    inline def |(b: GdkGLAPI): GdkGLAPI = a | b
    inline def is(b: GdkGLAPI): Boolean = (a & b) == b