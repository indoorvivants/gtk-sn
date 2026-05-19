package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.{Pixbuf, PixbufAnimation}
import sn.gnome.gdkpixbuf.internal.GdkPixbufAnimation
import sn.gnome.gio.{AsyncResult, Cancellable, InputStream}
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** An opaque object representing an animation.
  *
  * The GdkPixBuf library provides a simple mechanism to load and represent
  * animations. An animation is conceptually a series of frames to be displayed
  * over time.
  *
  * The animation may not be represented as a series of frames internally; for
  * example, it may be stored as a sprite and instructions for moving the sprite
  * around a background.
  *
  * To display an animation you don't need to understand its representation,
  * however; you just ask `GdkPixbuf` what should be displayed at a given point
  * in time.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufAnimation private[gnome] (raw: Ptr[GdkPixbufAnimation])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Queries the height of the bounding box of a pixbuf animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ =
    gdk_pixbuf_animation_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
    )
  end getHeight

  /** Get an iterator for displaying an animation.
    *
    * The iterator provides the frames that should be displayed at a given time.
    *
    * @start_time
    *   would normally come from g_get_current_time(), and marks the beginning
    *   of animation playback. After creating an iterator, you should
    *   immediately display the pixbuf returned by
    *   gdk_pixbuf_animation_iter_get_pixbuf(). Then, you should install a
    *   timeout (with g_timeout_add()) or by some other mechanism ensure that
    *   you'll update the image after gdk_pixbuf_animation_iter_get_delay_time()
    *   milliseconds. Each time the image is updated, you should reinstall the
    *   timeout with the new, possibly-changed delay time.
    *
    * As a shortcut, if @start_time is `NULL`, the result of
    * g_get_current_time() will be used automatically.
    *
    * To update the image (i.e. possibly change the result of
    * gdk_pixbuf_animation_iter_get_pixbuf() to a new frame of the animation),
    * call gdk_pixbuf_animation_iter_advance().
    *
    * If you're using #GdkPixbufLoader, in addition to updating the image after
    * the delay time, you should also update it whenever you receive the
    * area_updated signal and
    * gdk_pixbuf_animation_iter_on_currently_loading_frame() returns `TRUE`. In
    * this case, the frame currently being fed into the loader has received new
    * data, so needs to be refreshed. The delay time for a frame may also be
    * modified after an area_updated signal, for example if the delay time for a
    * frame is encoded in the data after the frame itself. So your timeout
    * should be reinstalled after any area_updated signal.
    *
    * A delay time of -1 is possible, indicating "infinite".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter/<method parameters>/start_time]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.TimeVal), @type -> DataRecord(const GTimeVal*)))"
  )
  private def getIter__ = ???

  /** Retrieves a static image for the animation.
    *
    * If an animation is really just a plain image (has only one frame), this
    * function returns that image.
    *
    * If the animation is an animation, this function returns a reasonable image
    * to use as a static unanimated image, which might be the first frame, or
    * something more sophisticated depending on the file format.
    *
    * If an animation hasn't loaded any frames yet, this function will return
    * `NULL`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStaticImage()(using Runtime): sn.gnome.gdkpixbuf.Pixbuf /* None */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_animation_get_static_image(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
      ).asInstanceOf
    )
  end getStaticImage

  /** Queries the width of the bounding box of a pixbuf animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    gdk_pixbuf_animation_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
    )
  end getWidth

  /** Checks whether the animation is a static image.
    *
    * If you load a file with gdk_pixbuf_animation_new_from_file() and it turns
    * out to be a plain, unanimated image, then this function will return
    * `TRUE`. Use gdk_pixbuf_animation_get_static_image() to retrieve the image.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isStaticImage(): Boolean /* None */ =
    gdk_pixbuf_animation_is_static_image(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
    ).value.!=(0)
  end isStaticImage

  /** Adds a reference to an animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def ref()(using
      Runtime
  ): sn.gnome.gdkpixbuf.PixbufAnimation /* None */ =
    sn.gnome.gdkpixbuf.PixbufAnimation.applyUnsafe(
      gdk_pixbuf_animation_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
      ).asInstanceOf
    )
  end ref

  /** Removes a reference from an animation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unref(): Unit /* None */ =
    gdk_pixbuf_animation_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkPixbufAnimation]]
    )
  end unref

end PixbufAnimation

object PixbufAnimation:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkPixbufAnimation])(using Runtime) =
    summon[Runtime].getOrCreate[PixbufAnimation](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new PixbufAnimation(ptr)
    )

  /** Creates a new animation by loading it from a file.
    *
    * The file format is detected automatically.
    *
    * If the file's format does not support multi-frame images, then an
    * animation with a single frame will be created.
    *
    * Possible errors are in the `GDK_PIXBUF_ERROR` and `G_FILE_ERROR` domains.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromFile(filename: String /* Some(CString) */ )(using
      Runtime
  ): GResult[PixbufAnimation] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_animation_new_from_file(
        summon[Runtime].inZone(toCString(filename)),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[PixbufAnimation](
          raw,
          r => PixbufAnimation.applyUnsafe(r.asInstanceOf)
        )

  end fromFile

  /** Creates a new pixbuf animation by loading an image from an resource.
    *
    * The file format is detected automatically. If `NULL` is returned, then
    * @error
    *   will be set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromResource(resource_path: String /* Some(CString) */ )(using
      Runtime
  ): GResult[PixbufAnimation] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_animation_new_from_resource(
        summon[Runtime].inZone(toCString(resource_path)),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[PixbufAnimation](
          raw,
          r => PixbufAnimation.applyUnsafe(r.asInstanceOf)
        )

  end fromResource

  /** Creates a new animation by loading it from an input stream.
    *
    * The file format is detected automatically.
    *
    * If `NULL` is returned, then @error will be set.
    *
    * The @cancellable can be used to abort the operation from another thread.
    * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
    * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
    * `G_IO_ERROR` domains.
    *
    * The stream is not closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromStream(
      stream: sn.gnome.gio.InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ]
  )(using Runtime): GResult[PixbufAnimation] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_animation_new_from_stream(
        stream.getUnsafeRawPointer().asInstanceOf,
        cancellable
          .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
          ),
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[PixbufAnimation](
          raw,
          r => PixbufAnimation.applyUnsafe(r.asInstanceOf)
        )

  end fromStream

  /** Finishes an asynchronous pixbuf animation creation operation started with
    * [func@GdkPixbuf.PixbufAnimation.new_from_stream_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromStreamFinish(
      async_result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  )(using Runtime): GResult[PixbufAnimation] =
    GResult.wrap: __errorPtr =>
      val raw: Ptr[Byte] = gdk_pixbuf_animation_new_from_stream_finish(
        async_result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf[Ptr[Byte]]
      if raw == null then null
      else
        summon[Runtime].getOrCreate[PixbufAnimation](
          raw,
          r => PixbufAnimation.applyUnsafe(r.asInstanceOf)
        )

  end fromStreamFinish

  /** Creates a new animation by asynchronously loading an image from an input
    * stream.
    *
    * For more details see gdk_pixbuf_new_from_stream(), which is the
    * synchronous version of this function.
    *
    * When the operation is finished, `callback` will be called in the main
    * thread. You can then call gdk_pixbuf_animation_new_from_stream_finish() to
    * get the result of the operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function new_from_stream_async/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def newFromStreamAsync() = ???

end PixbufAnimation
