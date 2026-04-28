package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gint32
import sn.gnome.glib.internal.gsize
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.graphene.internal.graphene_vec2_t
import sn.gnome.graphene.internal.graphene_vec3_t
import sn.gnome.graphene.internal.graphene_vec4_t
import sn.gnome.gsk4.fluent.Renderer
import sn.gnome.gsk4.internal.GskGLShader
import sn.gnome.gsk4.internal.GskGLUniformType

class GLShader(raw: Ptr[GskGLShader]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def compile(renderer: Renderer): GResult[Boolean] = GResult.wrap(__errorPtr =>
    gsk_gl_shader_compile(
      this.raw.asInstanceOf,
      renderer.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def findUniformByName(name: String | CString)(using Zone): Int =
    gsk_gl_shader_find_uniform_by_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    )

  inline def formatArgs(args: Any*): Ptr[GBytes] =
    gsk_gl_shader_format_args(this.raw.asInstanceOf, args*)

  def formatArgsVa(uniforms: CVarArgList): Ptr[GBytes] =
    gsk_gl_shader_format_args_va(this.raw.asInstanceOf, uniforms)

  def getArgBool(args: Ptr[GBytes], idx: Int): Boolean =
    gsk_gl_shader_get_arg_bool(this.raw.asInstanceOf, args, idx).value.!=(0)

  def getArgFloat(args: Ptr[GBytes], idx: Int): Float =
    gsk_gl_shader_get_arg_float(this.raw.asInstanceOf, args, idx)

  def getArgInt(args: Ptr[GBytes], idx: Int): CInt =
    gsk_gl_shader_get_arg_int(this.raw.asInstanceOf, args, idx).value

  def getArgUint(args: Ptr[GBytes], idx: Int): UInt =
    gsk_gl_shader_get_arg_uint(this.raw.asInstanceOf, args, idx).value

  def getArgVec2(
      args: Ptr[GBytes],
      idx: Int,
      out_value: Ptr[graphene_vec2_t]
  ): Unit =
    gsk_gl_shader_get_arg_vec2(this.raw.asInstanceOf, args, idx, out_value)

  def getArgVec3(
      args: Ptr[GBytes],
      idx: Int,
      out_value: Ptr[graphene_vec3_t]
  ): Unit =
    gsk_gl_shader_get_arg_vec3(this.raw.asInstanceOf, args, idx, out_value)

  def getArgVec4(
      args: Ptr[GBytes],
      idx: Int,
      out_value: Ptr[graphene_vec4_t]
  ): Unit =
    gsk_gl_shader_get_arg_vec4(this.raw.asInstanceOf, args, idx, out_value)

  def getArgsSize(): CUnsignedLongInt = gsk_gl_shader_get_args_size(
    this.raw.asInstanceOf
  ).value

  def getNTextures(): Int = gsk_gl_shader_get_n_textures(this.raw.asInstanceOf)

  def getNUniforms(): Int = gsk_gl_shader_get_n_uniforms(this.raw.asInstanceOf)

  def getResource()(using Zone): String = fromCString(
    gsk_gl_shader_get_resource(this.raw.asInstanceOf).asInstanceOf
  )

  def getSource(): Ptr[GBytes] = gsk_gl_shader_get_source(this.raw.asInstanceOf)

  def getUniformName(idx: Int)(using Zone): String = fromCString(
    gsk_gl_shader_get_uniform_name(this.raw.asInstanceOf, idx).asInstanceOf
  )

  def getUniformOffset(idx: Int): Int =
    gsk_gl_shader_get_uniform_offset(this.raw.asInstanceOf, idx)

  def getUniformType(idx: Int): GskGLUniformType =
    gsk_gl_shader_get_uniform_type(this.raw.asInstanceOf, idx)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end GLShader

object GLShader:
  def fromBytes(sourcecode: Ptr[GBytes]): GLShader = new GLShader(
    gsk_gl_shader_new_from_bytes(sourcecode).asInstanceOf
  )
  def fromResource(resource_path: String | CString)(using Zone): GLShader =
    new GLShader(
      gsk_gl_shader_new_from_resource(
        __sn_extract_string(resource_path)
      ).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end GLShader
