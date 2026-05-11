package sn.gnome.gsk4.fluent

import _root_.sn.gnome.gsk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, gsize}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gsk4.fluent.{GLUniformType, Renderer}
import sn.gnome.gsk4.internal.GskGLShader

/** A `GskGLShader` is a snippet of GLSL that is meant to run in the fragment
  * shader of the rendering pipeline.
  *
  * A fragment shader gets the coordinates being rendered as input and produces
  * the pixel values for that particular pixel. Additionally, the shader can
  * declare a set of other input arguments, called uniforms (as they are uniform
  * over all the calls to your shader in each instance of use). A shader can
  * also receive up to 4 textures that it can use as input when producing the
  * pixel data.
  *
  * `GskGLShader` is usually used with gtk_snapshot_push_gl_shader() to produce
  * a [class@Gsk.GLShaderNode] in the rendering hierarchy, and then its input
  * textures are constructed by rendering the child nodes to textures before
  * rendering the shader node itself. (You can pass texture nodes as children if
  * you want to directly use a texture as input).
  *
  * The actual shader code is GLSL code that gets combined with some other code
  * into the fragment shader. Since the exact capabilities of the GPU driver
  * differs between different OpenGL drivers and hardware, GTK adds some defines
  * that you can use to ensure your GLSL code runs on as many drivers as it can.
  *
  * If the OpenGL driver is GLES, then the shader language version is set to
  * 100, and GSK_GLES will be defined in the shader.
  *
  * Otherwise, if the OpenGL driver does not support the 3.2 core profile, then
  * the shader will run with language version 110 for GL2 and 130 for GL3, and
  * GSK_LEGACY will be defined in the shader.
  *
  * If the OpenGL driver supports the 3.2 code profile, it will be used, the
  * shader language version is set to 150, and GSK_GL3 will be defined in the
  * shader.
  *
  * The main function the shader must implement is:
  *
  * ```glsl
  *  void mainImage(out vec4 fragColor,
  *                 in vec2 fragCoord,
  *                 in vec2 resolution,
  *                 in vec2 uv)
  * ```
  *
  * Where the input @fragCoord is the coordinate of the pixel we're currently
  * rendering, relative to the boundary rectangle that was specified in the
  * `GskGLShaderNode`, and @resolution is the width and height of that
  * rectangle. This is in the typical GTK coordinate system with the origin in
  * the top left. @uv contains the u and v coordinates that can be used to index
  * a texture at the corresponding point. These coordinates are in the
  * [0..1]x[0..1] region, with 0, 0 being in the lower left corder (which is
  * typical for OpenGL).
  *
  * The output @fragColor should be a RGBA color (with premultiplied alpha) that
  * will be used as the output for the specified pixel location. Note that this
  * output will be automatically clipped to the clip region of the glshader
  * node.
  *
  * In addition to the function arguments the shader can define up to 4 uniforms
  * for textures which must be called u_textureN (i.e. u_texture1 to u_texture4)
  * as well as any custom uniforms you want of types int, uint, bool, float,
  * vec2, vec3 or vec4.
  *
  * All textures sources contain premultiplied alpha colors, but if some there
  * are outer sources of colors there is a gsk_premultiply() helper to compute
  * premultiplication when needed.
  *
  * Note that GTK parses the uniform declarations, so each uniform has to be on
  * a line by itself with no other code, like so:
  *
  * ```glsl
  * uniform float u_time;
  * uniform vec3 u_color;
  * uniform sampler2D u_texture1;
  * uniform sampler2D u_texture2;
  * ```
  *
  * GTK uses the "gsk" namespace in the symbols it uses in the shader, so your
  * code should not use any symbols with the prefix gsk or GSK. There are some
  * helper functions declared that you can use:
  *
  * ```glsl
  * vec4 GskTexture(sampler2D sampler, vec2 texCoords);
  * ```
  *
  * This samples a texture (e.g. u_texture1) at the specified coordinates, and
  * contains some helper ifdefs to ensure that it works on all OpenGL versions.
  *
  * You can compile the shader yourself using [method@Gsk.GLShader.compile],
  * otherwise the GSK renderer will do it when it handling the glshader node. If
  * errors occurs, the returned @error will include the glsl sources, so you can
  * see what GSK was passing to the compiler. You can also set GSK_DEBUG=shaders
  * in the environment to see the sources and other relevant information about
  * all shaders that GSK is handling.
  *
  * # An example shader
  *
  * ```glsl
  * uniform float position;
  * uniform sampler2D u_texture1;
  * uniform sampler2D u_texture2;
  *
  * void mainImage(out vec4 fragColor,
  *                in vec2 fragCoord,
  *                in vec2 resolution,
  *                in vec2 uv) {
  *   vec4 source1 = GskTexture(u_texture1, uv);
  *   vec4 source2 = GskTexture(u_texture2, uv);
  *
  *   fragColor = position * source1 + (1.0 - position) * source2;
  * }
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GLShader private[gnome] (raw: Ptr[GskGLShader])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Tries to compile the @shader for the given @renderer.
    *
    * If there is a problem, this function returns %FALSE and reports an error.
    * You should use this function before relying on the shader for rendering
    * and use a fallback with a simpler shader or without shaders if it fails.
    *
    * Note that this will modify the rendering state (for example change the
    * current GL context) and requires the renderer to be set up. This means
    * that the widget has to be realized. Commonly you want to call this from
    * the realize signal of a widget, or during widget snapshot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compile(
      renderer: sn.gnome.gsk4.fluent.Renderer /* Some(Ptr[GskRenderer]) */
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gsk_gl_shader_compile(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]],
        renderer.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end compile

  /** Looks for a uniform by the name @name, and returns the index of the
    * uniform, or -1 if it was not found.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findUniformByName(
      name: String /* Some(CString) */
  )(using Zone): Int /* None */ =
    gsk_gl_shader_find_uniform_by_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]],
      toCString(name)
    )
  end findUniformByName

  /** Formats the uniform data as needed for feeding the named uniforms values
    * into the shader.
    *
    * The argument list is a list of pairs of names, and values for the types
    * that match the declared uniforms (i.e. double/int/guint/gboolean for
    * primitive values and `graphene_vecN_t *` for vecN uniforms).
    *
    * Any uniforms of the shader that are not included in the argument list are
    * zero-initialized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method format_args/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def formatArgs__ = ???

  /** Formats the uniform data as needed for feeding the named uniforms values
    * into the shader.
    *
    * The argument list is a list of pairs of names, and values for the types
    * that match the declared uniforms (i.e. double/int/guint/gboolean for
    * primitive values and `graphene_vecN_t *` for vecN uniforms).
    *
    * It is an error to pass a uniform name that is not declared by the shader.
    *
    * Any uniforms of the shader that are not included in the argument list are
    * zero-initialized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method format_args_va/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def formatArgsVa__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of bool type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_bool/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgBool__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of float type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_float/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgFloat__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of int type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_int/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgInt__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of uint type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_uint/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgUint__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of vec2 type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_vec2/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgVec2__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of vec3 type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_vec3/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgVec3__ = ???

  /** Gets the value of the uniform @idx in the @args block.
    *
    * The uniform must be of vec4 type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_arg_vec4/<method parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getArgVec4__ = ???

  /** Get the size of the data block used to specify arguments for this shader.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getArgsSize(): CUnsignedLongInt /* None */ =
    gsk_gl_shader_get_args_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]]
    ).value
  end getArgsSize

  /** Returns the number of textures that the shader requires.
    *
    * This can be used to check that the a passed shader works in your usecase.
    * It is determined by looking at the highest u_textureN value that the
    * shader defines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNTextures(): Int /* None */ =
    gsk_gl_shader_get_n_textures(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]]
    )
  end getNTextures

  /** Get the number of declared uniforms for this shader.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNUniforms(): Int /* None */ =
    gsk_gl_shader_get_n_uniforms(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]]
    )
  end getNUniforms

  /** Gets the resource path for the GLSL sourcecode being used to render this
    * shader.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResource()(using Zone): String /* None */ =
    fromCString(
      gsk_gl_shader_get_resource(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]]
      ).asInstanceOf
    )
  end getResource

  /** Gets the GLSL sourcecode being used to render this shader.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_source/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def getSource__ = ???

  /** Get the name of the declared uniform for this shader at index @idx.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUniformName(
      idx: Int /* Some(CInt) */
  )(using Zone): String /* None */ =
    fromCString(
      gsk_gl_shader_get_uniform_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]],
        idx
      ).asInstanceOf
    )
  end getUniformName

  /** Get the offset into the data block where data for this uniforms is stored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUniformOffset(idx: Int /* Some(CInt) */ ): Int /* None */ =
    gsk_gl_shader_get_uniform_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]],
      idx
    )
  end getUniformOffset

  /** Get the type of the declared uniform for this shader at index @idx.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUniformType(idx: Int /* Some(CInt) */ ): GLUniformType /* None */ =
    GLUniformType.fromRaw(
      gsk_gl_shader_get_uniform_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GskGLShader]],
        idx
      )
    )
  end getUniformType

end GLShader

object GLShader:
  def applyUnsafe(ptr: Ptr[GskGLShader])(using Runtime) = summon[Runtime]
    .getOrCreate[GLShader](ptr.asInstanceOf[Ptr[Byte]], p => new GLShader(ptr))

  /** Creates a `GskGLShader` that will render pixels using the specified code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sourcecode]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def new_from_bytes() = ???

  /** Creates a `GskGLShader` that will render pixels using the specified code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromResource(
      resource_path: String /* Some(CString) */
  )(using Zone, Runtime): GLShader =
    val raw: Ptr[Byte] = gsk_gl_shader_new_from_resource(
      toCString(resource_path)
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[GLShader](raw, r => GLShader.applyUnsafe(r.asInstanceOf))
  end fromResource
end GLShader
