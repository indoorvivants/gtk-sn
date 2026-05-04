package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.GskGLUniformType

/** This defines the types of the uniforms that `GskGLShaders` declare.
  *
  * It defines both what the type is called in the GLSL shader code, and what
  * the corresponding C type is on the Gtk side.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum GLUniformType(val raw: GskGLUniformType):
  /** No type, used for uninitialized or unspecified values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_NONE)

  /** A float uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FLOAT extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_FLOAT)

  /** A GLSL int / gint32 uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INT extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_INT)

  /** A GLSL uint / guint32 uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UINT extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_UINT)

  /** A GLSL bool / gboolean uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOOL extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_BOOL)

  /** A GLSL vec2 / graphene_vec2_t uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VEC2 extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC2)

  /** A GLSL vec3 / graphene_vec3_t uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VEC3 extends GLUniformType(GskGLUniformType.GSK_GL_UNIFORM_TYPE_VEC3)

  /** A GLSL vec4 / graphene_vec4_t uniform
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
