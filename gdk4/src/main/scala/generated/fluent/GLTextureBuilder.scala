package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{GLContext, MemoryFormat, Texture}
import sn.gnome.gdk4.internal.GdkGLTextureBuilder
import sn.gnome.glib.internal.{gboolean, gint, gpointer, guint}
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkGLTextureBuilder` is a buider used to construct [class@Gdk.Texture]
  * objects from GL textures.
  *
  * The operation is quite simple: Create a texture builder, set all the
  * necessary properties - keep in mind that the properties
  * [property@Gdk.GLTextureBuilder:context], [property@Gdk.GLTextureBuilder:id],
  * [property@Gdk.GLTextureBuilder:width], and
  * [property@Gdk.GLTextureBuilder:height] are mandatory - and then call
  * [method@Gdk.GLTextureBuilder.build] to create the new texture.
  *
  * `GdkGLTextureBuilder` can be used for quick one-shot construction of
  * textures as well as kept around and reused to construct multiple textures.
  */
class GLTextureBuilder(raw: Ptr[GdkGLTextureBuilder])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Builds a new `GdkTexture` with the values set up in the builder.
    *
    * The `destroy` function gets called when the returned texture gets
    * released; either when the texture is finalized or by an explicit call to
    * [method@Gdk.GLTexture.release]. It should release all GL resources
    * associated with the texture, such as the
    * [property@Gdk.GLTextureBuilder:id] and the
    * [property@Gdk.GLTextureBuilder:sync].
    *
    * Note that it is a programming error to call this function if any mandatory
    * property has not been set.
    *
    * It is possible to call this function multiple times to create multiple
    * textures, possibly with changing properties in between.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  def build__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the context previously set via gdk_gl_texture_builder_set_context()
    * or %NULL if none was set.
    */
  def getContext(): GLContext /* None */ = new GLContext(
    gdk_gl_texture_builder_get_context(
      this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the format previously set via gdk_gl_texture_builder_set_format().
    */
  def getFormat(): MemoryFormat /* None */ = MemoryFormat.fromRaw(
    gdk_gl_texture_builder_get_format(
      this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the texture has a mipmap.
    */
  def getHasMipmap(): Boolean /* None */ =
    gdk_gl_texture_builder_get_has_mipmap(
      this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the height previously set via gdk_gl_texture_builder_set_height() or
    * 0 if the height wasn't set.
    */
  def getHeight(): Int /* None */ = gdk_gl_texture_builder_get_height(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the texture id previously set via gdk_gl_texture_builder_set_id() or
    * 0 if the id wasn't set.
    */
  def getId(): UInt /* None */ = gdk_gl_texture_builder_get_id(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GLsync` previously set via gdk_gl_texture_builder_set_sync().
    */
  def getSync(): Ptr[Byte] /* None */ = gdk_gl_texture_builder_get_sync(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the region previously set via
    * gdk_gl_texture_builder_set_update_region() or %NULL if none was set.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))"
  )
  def getUpdateRegion__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the texture previously set via
    * gdk_gl_texture_builder_set_update_texture() or %NULL if none was set.
    */
  def getUpdateTexture(): Texture /* None */ = new Texture(
    gdk_gl_texture_builder_get_update_texture(
      this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the width previously set via gdk_gl_texture_builder_set_width() or 0
    * if the width wasn't set.
    */
  def getWidth(): Int /* None */ = gdk_gl_texture_builder_get_width(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the context to be used for the texture. This is the context that owns
    * the texture.
    *
    * The context must be set before calling
    * [method@Gdk.GLTextureBuilder.build].
    */
  def setContext(
      context: Option[GLContext /* Some(Ptr[GdkGLContext]) */ ]
  ): Unit /* None */ = gdk_gl_texture_builder_set_context(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
    context
      .map[Ptr[GdkGLContext]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GdkGLContext]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the format of the texture. The default is
    * `GDK_MEMORY_R8G8B8A8_PREMULTIPLIED`.
    *
    * The format is the preferred format the texture data should be downloaded
    * to. The format must be supported by the GL version of
    * [property@Gdk.GLTextureBuilder:context].
    *
    * GDK's texture download code assumes that the format corresponds to the
    * storage parameters of the GL texture in an obvious way. For example, a
    * format of `GDK_MEMORY_R16G16B16A16_PREMULTIPLIED` is expected to be stored
    * as `GL_RGBA16` texture, and `GDK_MEMORY_G8A8` is expected to be stored as
    * `GL_RG8` texture.
    *
    * Setting the right format is particularly useful when using high bit depth
    * textures to preserve the bit depth, to set the correct value for
    * unpremultiplied textures and to make sure opaque textures are treated as
    * such.
    *
    * Non-RGBA textures need to have swizzling parameters set up properly to be
    * usable in GSK's shaders.
    */
  def setFormat(
      format: MemoryFormat /* Some(GdkMemoryFormat) */
  ): Unit /* None */ = gdk_gl_texture_builder_set_format(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
    format.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the texture has a mipmap. This allows the renderer and other
    * users of the generated texture to use a higher quality downscaling.
    *
    * Typically, the `glGenerateMipmap` function is used to generate a mimap.
    */
  def setHasMipmap(
      has_mipmap: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gdk_gl_texture_builder_set_has_mipmap(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
    gboolean(gint((if has_mipmap == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the height of the texture.
    *
    * The height must be set before calling [method@Gdk.GLTextureBuilder.build].
    */
  def setHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    gdk_gl_texture_builder_set_height(
      this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
      height
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the texture id of the texture. The texture id must remain unmodified
    * until the texture was finalized. See [method@Gdk.GLTextureBuilder.build]
    * for a longer discussion.
    *
    * The id must be set before calling [method@Gdk.GLTextureBuilder.build].
    */
  def setId(
      id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gdk_gl_texture_builder_set_id(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
    guint(id)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the GLSync object to use for the texture.
    *
    * GTK will wait on this object before using the created `GdkTexture`.
    *
    * The `destroy` function that is passed to
    * [method@Gdk.GLTextureBuilder.build] is responsible for freeing the sync
    * object when it is no longer needed. The texture builder does not destroy
    * it and it is the callers responsibility to make sure it doesn't leak.
    */
  def setSync(
      sync: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = gdk_gl_texture_builder_set_sync(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
    sync
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the region to be updated by this texture. Together with
    * [property@Gdk.GLTextureBuilder:update-texture] this describes an update of
    * a previous texture.
    *
    * When rendering animations of large textures, it is possible that
    * consecutive textures are only updating contents in parts of the texture.
    * It is then possible to describe this update via these two properties, so
    * that GTK can avoid rerendering parts that did not change.
    *
    * An example would be a screen recording where only the mouse pointer moves.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Region), @type -> DataRecord(cairo_region_t*)))"
  )
  def setUpdateRegion__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the texture to be updated by this texture. See
    * [method@Gdk.GLTextureBuilder.set_update_region] for an explanation.
    */
  def setUpdateTexture(
      texture: Option[Texture /* Some(Ptr[GdkTexture]) */ ]
  ): Unit /* None */ = gdk_gl_texture_builder_set_update_texture(
    this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
    texture
      .map[Ptr[GdkTexture]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GdkTexture]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the width of the texture.
    *
    * The width must be set before calling [method@Gdk.GLTextureBuilder.build].
    */
  def setWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    gdk_gl_texture_builder_set_width(
      this.raw.asInstanceOf[Ptr[GdkGLTextureBuilder]],
      width
    )

end GLTextureBuilder

object GLTextureBuilder:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new texture builder.
    */
  def apply(): GLTextureBuilder = new GLTextureBuilder(
    gdk_gl_texture_builder_new().asInstanceOf
  )
end GLTextureBuilder
