package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkGLError

/** Error enumeration for `GdkGLContext`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum GLError(val raw: GdkGLError):
  /** OpenGL support is not available
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_AVAILABLE extends GLError(GdkGLError.GDK_GL_ERROR_NOT_AVAILABLE)

  /** The requested visual format is not supported
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_FORMAT
      extends GLError(GdkGLError.GDK_GL_ERROR_UNSUPPORTED_FORMAT)

  /** The requested profile is not supported
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNSUPPORTED_PROFILE
      extends GLError(GdkGLError.GDK_GL_ERROR_UNSUPPORTED_PROFILE)

  /** The shader compilation failed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COMPILATION_FAILED
      extends GLError(GdkGLError.GDK_GL_ERROR_COMPILATION_FAILED)

  /** The shader linking failed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
