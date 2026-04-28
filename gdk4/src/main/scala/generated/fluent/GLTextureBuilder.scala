package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.cairo.internal.cairo_region_t
import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkGLTextureBuilder
import sn.gnome.gdk4.internal.GdkMemoryFormat
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class GLTextureBuilder(raw: Ptr[GdkGLTextureBuilder])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def build(destroy: GDestroyNotify, data: Ptr[Byte]): Texture = new Texture(
    gdk_gl_texture_builder_build(
      this.raw.asInstanceOf,
      destroy,
      gpointer(data)
    ).asInstanceOf
  )

  def getContext(): GLContext = new GLContext(
    gdk_gl_texture_builder_get_context(this.raw.asInstanceOf).asInstanceOf
  )

  def getFormat(): GdkMemoryFormat = gdk_gl_texture_builder_get_format(
    this.raw.asInstanceOf
  )

  def getHasMipmap(): Boolean =
    gdk_gl_texture_builder_get_has_mipmap(this.raw.asInstanceOf).value.!=(0)

  def getHeight(): Int = gdk_gl_texture_builder_get_height(
    this.raw.asInstanceOf
  )

  def getId(): UInt = gdk_gl_texture_builder_get_id(this.raw.asInstanceOf).value

  def getSync(): Ptr[Byte] = gdk_gl_texture_builder_get_sync(
    this.raw.asInstanceOf
  ).value

  def getUpdateRegion(): Ptr[cairo_region_t] =
    gdk_gl_texture_builder_get_update_region(this.raw.asInstanceOf)

  def getUpdateTexture(): Texture = new Texture(
    gdk_gl_texture_builder_get_update_texture(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getWidth(): Int = gdk_gl_texture_builder_get_width(this.raw.asInstanceOf)

  def setContext(context: GLContext): Unit = gdk_gl_texture_builder_set_context(
    this.raw.asInstanceOf,
    context.getUnsafeRawPointer().asInstanceOf
  )

  def setFormat(format: GdkMemoryFormat): Unit =
    gdk_gl_texture_builder_set_format(this.raw.asInstanceOf, format)

  def setHasMipmap(has_mipmap: Boolean): Unit =
    gdk_gl_texture_builder_set_has_mipmap(
      this.raw.asInstanceOf,
      gboolean(gint((if has_mipmap == true then 1 else 0)))
    )

  def setHeight(height: Int): Unit =
    gdk_gl_texture_builder_set_height(this.raw.asInstanceOf, height)

  def setId(id: UInt): Unit =
    gdk_gl_texture_builder_set_id(this.raw.asInstanceOf, guint(id))

  def setSync(sync: Ptr[Byte]): Unit =
    gdk_gl_texture_builder_set_sync(this.raw.asInstanceOf, gpointer(sync))

  def setUpdateRegion(region: Ptr[cairo_region_t]): Unit =
    gdk_gl_texture_builder_set_update_region(this.raw.asInstanceOf, region)

  def setUpdateTexture(texture: Texture): Unit =
    gdk_gl_texture_builder_set_update_texture(
      this.raw.asInstanceOf,
      texture.getUnsafeRawPointer().asInstanceOf
    )

  def setWidth(width: Int): Unit =
    gdk_gl_texture_builder_set_width(this.raw.asInstanceOf, width)

end GLTextureBuilder

object GLTextureBuilder:
  def apply(): GLTextureBuilder = new GLTextureBuilder(
    gdk_gl_texture_builder_new().asInstanceOf
  )
end GLTextureBuilder
