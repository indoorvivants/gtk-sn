package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.GLContext
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkGLTexture
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.LoadableIcon
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint

class GLTexture(raw: Ptr[GdkGLTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def release(): Unit = gdk_gl_texture_release(this.raw.asInstanceOf)

end GLTexture

object GLTexture:
  def apply(
      context: GLContext,
      id: UInt,
      width: Int,
      height: Int,
      destroy: GDestroyNotify,
      data: Ptr[Byte]
  ): GLTexture = new GLTexture(
    gdk_gl_texture_new(
      context.getUnsafeRawPointer().asInstanceOf,
      guint(id),
      width,
      height,
      destroy,
      gpointer(data)
    ).asInstanceOf
  )
end GLTexture
