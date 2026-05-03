package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskGLUniformType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This defines the types of the uniforms that `GskGLShaders` declare.
  *
  * It defines both what the type is called in the GLSL shader code, and what
  * the corresponding C type is on the Gtk side.
  */
enum GLUniformType(val raw: GskGLUniformType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No type, used for uninitialized or unspecified values.
    */
  case NONE extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A float uniform
    */
  case FLOAT extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_FLOAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A GLSL int / gint32 uniform
    */
  case INT extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_INT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A GLSL uint / guint32 uniform
    */
  case UINT extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_UINT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A GLSL bool / gboolean uniform
    */
  case BOOL extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_BOOL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A GLSL vec2 / graphene_vec2_t uniform
    */
  case VEC2 extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC2)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A GLSL vec3 / graphene_vec3_t uniform
    */
  case VEC3 extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC3)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A GLSL vec4 / graphene_vec4_t uniform
    */
  case VEC4 extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC4)
end GLUniformType

object GLUniformType:
  def fromRaw(raw: GskGLUniformType): GLUniformType =
    raw match
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_NONE  => GLUniformType.NONE
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_FLOAT => GLUniformType.FLOAT
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_INT   => GLUniformType.INT
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_UINT  => GLUniformType.UINT
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_BOOL  => GLUniformType.BOOL
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC2  => GLUniformType.VEC2
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC3  => GLUniformType.VEC3
      case GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC4  => GLUniformType.VEC4
  end fromRaw
end GLUniformType
