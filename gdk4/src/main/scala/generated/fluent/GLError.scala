package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkGLError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error enumeration for `GdkGLContext`.
  */
enum GLError(val raw: GdkGLError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * OpenGL support is not available
    */
  case NOT_AVAILABLE extends GLError(GdkGLError.GDK_GL_ERROR_NOT_AVAILABLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The requested visual format is not supported
    */
  case UNSUPPORTED_FORMAT
      extends GLError(GdkGLError.GDK_GL_ERROR_UNSUPPORTED_FORMAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The requested profile is not supported
    */
  case UNSUPPORTED_PROFILE
      extends GLError(GdkGLError.GDK_GL_ERROR_UNSUPPORTED_PROFILE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shader compilation failed
    */
  case COMPILATION_FAILED
      extends GLError(GdkGLError.GDK_GL_ERROR_COMPILATION_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The shader linking failed
    */
  case LINK_FAILED extends GLError(GdkGLError.GDK_GL_ERROR_LINK_FAILED)
end GLError

object GLError:
  def fromRaw(raw: GdkGLError): GLError =
    raw match
      case GdkGLError.GDK_GL_ERROR_NOT_AVAILABLE      => GLError.NOT_AVAILABLE
      case GdkGLError.GDK_GL_ERROR_UNSUPPORTED_FORMAT =>
        GLError.UNSUPPORTED_FORMAT
      case GdkGLError.GDK_GL_ERROR_UNSUPPORTED_PROFILE =>
        GLError.UNSUPPORTED_PROFILE
      case GdkGLError.GDK_GL_ERROR_COMPILATION_FAILED =>
        GLError.COMPILATION_FAILED
      case GdkGLError.GDK_GL_ERROR_LINK_FAILED => GLError.LINK_FAILED
  end fromRaw
end GLError
