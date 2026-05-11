package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{Paintable, Texture}
import sn.gnome.gdk4.internal.GdkGLTexture
import sn.gnome.gio.fluent.{Icon, LoadableIcon}
import sn.gnome.gobject.runtime.*

/** A GdkTexture representing a GL texture object.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GLTexture private[gnome] (raw: Ptr[GdkGLTexture])
    extends Texture(raw.asInstanceOf),
      Paintable,
      Icon,
      LoadableIcon:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Releases the GL resources held by a `GdkGLTexture`.
    *
    * The texture contents are still available via the
    * [method@Gdk.Texture.download] function, after this function has been
    * called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def release(): Unit /* None */ =
    gdk_gl_texture_release(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkGLTexture]]
    )
  end release

end GLTexture

object GLTexture:
  def applyUnsafe(ptr: Ptr[GdkGLTexture])(using Runtime) =
    summon[Runtime].getOrCreate[GLTexture](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new GLTexture(ptr)
    )

  /** Creates a new texture for an existing GL texture.
    *
    * Note that the GL texture must not be modified until @destroy is called,
    * which will happen when the GdkTexture object is finalized, or due to an
    * explicit call of [method@Gdk.GLTexture.release].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[destroy]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def `new`() = ???

end GLTexture
