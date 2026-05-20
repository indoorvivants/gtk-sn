package sn.gnome.gsk4

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Bytes
import sn.gnome.glib.internal.{gboolean, gint, gint32, guint32}
import sn.gnome.graphene.{Vec2, Vec3, Vec4}
import sn.gnome.gsk4.ShaderArgsBuilder
import sn.gnome.gsk4.internal.GskShaderArgsBuilder

/** An object to build the uniforms data for a `GskGLShader`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ShaderArgsBuilder private[gnome] (raw: Ptr[GskShaderArgsBuilder]):

  def getUnsafeRawPointer(): Ptr[GskShaderArgsBuilder] = this.raw

  /** Creates a new `GBytes` args from the current state of the given @builder,
    * and frees the @builder instance.
    *
    * Any uniforms of the shader that have not been explicitly set on the @builder
    * are zero-initialized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeToArgs(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      gsk_shader_args_builder_free_to_args(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]]
      )
    )
  end freeToArgs

  /** Increases the reference count of a `GskShaderArgsBuilder` by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gsk4.ShaderArgsBuilder /* None */ =
    sn.gnome.gsk4.ShaderArgsBuilder.fromRaw(
      gsk_shader_args_builder_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]]
      )
    )
  end ref

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of bool type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBool(
      idx: Int /* Some(CInt) */,
      value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_bool(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      gboolean(gint((if value == true then 1 else 0)))
    )
  end setBool

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of float type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFloat(
      idx: Int /* Some(CInt) */,
      value: Float /* Some(Float) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_float(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      value.asInstanceOf
    )
  end setFloat

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of int type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInt(
      idx: Int /* Some(CInt) */,
      value: CInt /* Some(_root_.sn.gnome.glib.internal.gint32) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_int(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      gint32(value)
    )
  end setInt

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of uint type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUint(
      idx: Int /* Some(CInt) */,
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_uint(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      guint32(value)
    )
  end setUint

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of vec2 type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVec2(
      idx: Int /* Some(CInt) */,
      value: sn.gnome.graphene.Vec2 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec2_t]) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_vec2(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      value.getUnsafeRawPointer().asInstanceOf
    )
  end setVec2

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of vec3 type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVec3(
      idx: Int /* Some(CInt) */,
      value: sn.gnome.graphene.Vec3 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec3_t]) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_vec3(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      value.getUnsafeRawPointer().asInstanceOf
    )
  end setVec3

  /** Sets the value of the uniform @idx.
    *
    * The uniform must be of vec4 type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVec4(
      idx: Int /* Some(CInt) */,
      value: sn.gnome.graphene.Vec4 /* Some(Ptr[_root_.sn.gnome.graphene.internal.graphene_vec4_t]) */
  ): Unit /* None */ =
    gsk_shader_args_builder_set_vec4(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]],
      idx,
      value.getUnsafeRawPointer().asInstanceOf
    )
  end setVec4

  /** Creates a new `GBytes` args from the current state of the given @builder.
    *
    * Any uniforms of the shader that have not been explicitly set on the @builder
    * are zero-initialized.
    *
    * The given `GskShaderArgsBuilder` is reset once this function returns; you
    * cannot call this function multiple times on the same @builder instance.
    *
    * This function is intended primarily for bindings. C code should use
    * [method@Gsk.ShaderArgsBuilder.free_to_args].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toArgs(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      gsk_shader_args_builder_to_args(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]]
      )
    )
  end toArgs

  /** Decreases the reference count of a `GskShaderArgBuilder` by one.
    *
    * If the resulting reference count is zero, frees the builder.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    gsk_shader_args_builder_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskShaderArgsBuilder]]
    )
  end unref

end ShaderArgsBuilder

object ShaderArgsBuilder:
  def fromRaw(ptr: Ptr[GskShaderArgsBuilder]): ShaderArgsBuilder =
    new ShaderArgsBuilder(ptr)
end ShaderArgsBuilder
