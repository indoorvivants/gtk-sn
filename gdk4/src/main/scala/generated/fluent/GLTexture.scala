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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A GdkTexture representing a GL texture object.
  */
class GLTexture(raw: Ptr[GdkGLTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Releases the GL resources held by a `GdkGLTexture`.
    *
    * The texture contents are still available via the
    * [method@Gdk.Texture.download] function, after this function has been
    * called.
    */
  def release(): Unit /* None */ = gdk_gl_texture_release(this.raw.asInstanceOf)

end GLTexture

object GLTexture:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new texture for an existing GL texture.
    *
    * Note that the GL texture must not be modified until @destroy is called,
    * which will happen when the GdkTexture object is finalized, or due to an
    * explicit call of [method@Gdk.GLTexture.release].
    */
  def apply(
      context: GLContext /* Some(Ptr[GdkGLContext]) */,
      id: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */,
      destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */,
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): GLTexture = new GLTexture(
    gdk_gl_texture_new(
      context.getUnsafeRawPointer().asInstanceOf,
      guint(id),
      width,
      height,
      destroy,
      data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    ).asInstanceOf
  )
end GLTexture
