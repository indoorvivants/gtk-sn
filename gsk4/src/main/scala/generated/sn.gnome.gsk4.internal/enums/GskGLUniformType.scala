package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskGLUniformType: _GL_UNIFORM_TYPE_NONE: No type, used for uninitialized or unspecified values. _GL_UNIFORM_TYPE_FLOAT: A float uniform _GL_UNIFORM_TYPE_INT: A GLSL int / gint32 uniform _GL_UNIFORM_TYPE_UINT: A GLSL uint / guint32 uniform _GL_UNIFORM_TYPE_BOOL: A GLSL bool / gboolean uniform _GL_UNIFORM_TYPE_VEC2: A GLSL vec2 / graphene_vec2_t uniform _GL_UNIFORM_TYPE_VEC3: A GLSL vec3 / graphene_vec3_t uniform _GL_UNIFORM_TYPE_VEC4: A GLSL vec4 / graphene_vec4_t uniform
*/
opaque type GskGLUniformType = CUnsignedInt
object GskGLUniformType extends _BindgenEnumCUnsignedInt[GskGLUniformType]:
  given _tag: Tag[GskGLUniformType] = Tag.UInt
  inline def define(inline a: Long): GskGLUniformType = a.toUInt
  val GSK_GL_UNIFORM_TYPE_NONE = define(0)
  val GSK_GL_UNIFORM_TYPE_FLOAT = define(1)
  val GSK_GL_UNIFORM_TYPE_INT = define(2)
  val GSK_GL_UNIFORM_TYPE_UINT = define(3)
  val GSK_GL_UNIFORM_TYPE_BOOL = define(4)
  val GSK_GL_UNIFORM_TYPE_VEC2 = define(5)
  val GSK_GL_UNIFORM_TYPE_VEC3 = define(6)
  val GSK_GL_UNIFORM_TYPE_VEC4 = define(7)
  def getName(value: GskGLUniformType): Option[String] =
    value match
      case `GSK_GL_UNIFORM_TYPE_NONE` => Some("GSK_GL_UNIFORM_TYPE_NONE")
      case `GSK_GL_UNIFORM_TYPE_FLOAT` => Some("GSK_GL_UNIFORM_TYPE_FLOAT")
      case `GSK_GL_UNIFORM_TYPE_INT` => Some("GSK_GL_UNIFORM_TYPE_INT")
      case `GSK_GL_UNIFORM_TYPE_UINT` => Some("GSK_GL_UNIFORM_TYPE_UINT")
      case `GSK_GL_UNIFORM_TYPE_BOOL` => Some("GSK_GL_UNIFORM_TYPE_BOOL")
      case `GSK_GL_UNIFORM_TYPE_VEC2` => Some("GSK_GL_UNIFORM_TYPE_VEC2")
      case `GSK_GL_UNIFORM_TYPE_VEC3` => Some("GSK_GL_UNIFORM_TYPE_VEC3")
      case `GSK_GL_UNIFORM_TYPE_VEC4` => Some("GSK_GL_UNIFORM_TYPE_VEC4")
      case _ => _root_.scala.None
  extension (a: GskGLUniformType)
    inline def &(b: GskGLUniformType): GskGLUniformType = a & b
    inline def |(b: GskGLUniformType): GskGLUniformType = a | b
    inline def is(b: GskGLUniformType): Boolean = (a & b) == b