package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkGLError: _GL_ERROR_NOT_AVAILABLE: OpenGL support is not available _GL_ERROR_UNSUPPORTED_FORMAT: The requested visual format is not supported _GL_ERROR_UNSUPPORTED_PROFILE: The requested profile is not supported _GL_ERROR_COMPILATION_FAILED: The shader compilation failed _GL_ERROR_LINK_FAILED: The shader linking failed
*/
opaque type GdkGLError = CUnsignedInt
object GdkGLError extends _BindgenEnumCUnsignedInt[GdkGLError]:
  given _tag: Tag[GdkGLError] = Tag.UInt
  inline def define(inline a: Long): GdkGLError = a.toUInt
  val GDK_GL_ERROR_NOT_AVAILABLE = define(0)
  val GDK_GL_ERROR_UNSUPPORTED_FORMAT = define(1)
  val GDK_GL_ERROR_UNSUPPORTED_PROFILE = define(2)
  val GDK_GL_ERROR_COMPILATION_FAILED = define(3)
  val GDK_GL_ERROR_LINK_FAILED = define(4)
  def getName(value: GdkGLError): Option[String] =
    value match
      case `GDK_GL_ERROR_NOT_AVAILABLE` => Some("GDK_GL_ERROR_NOT_AVAILABLE")
      case `GDK_GL_ERROR_UNSUPPORTED_FORMAT` => Some("GDK_GL_ERROR_UNSUPPORTED_FORMAT")
      case `GDK_GL_ERROR_UNSUPPORTED_PROFILE` => Some("GDK_GL_ERROR_UNSUPPORTED_PROFILE")
      case `GDK_GL_ERROR_COMPILATION_FAILED` => Some("GDK_GL_ERROR_COMPILATION_FAILED")
      case `GDK_GL_ERROR_LINK_FAILED` => Some("GDK_GL_ERROR_LINK_FAILED")
      case _ => _root_.scala.None
  extension (a: GdkGLError)
    inline def &(b: GdkGLError): GdkGLError = a & b
    inline def |(b: GdkGLError): GdkGLError = a | b
    inline def is(b: GdkGLError): Boolean = (a & b) == b