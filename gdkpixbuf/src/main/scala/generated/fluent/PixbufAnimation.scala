package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gdkpixbuf.fluent.PixbufAnimation
import sn.gnome.gdkpixbuf.fluent.PixbufAnimationIter
import sn.gnome.gdkpixbuf.internal.GdkPixbufAnimation
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GTimeVal
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An opaque object representing an animation.
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
  */
class PixbufAnimation(raw: Ptr[GdkPixbufAnimation])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the height of the bounding box of a pixbuf animation.
    */
  def getHeight(): Int /* None */ = gdk_pixbuf_animation_get_height(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get an iterator for displaying an animation.
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
    */
  def getIter(
      start_time: Option[
        Ptr[GTimeVal] /* Some(Ptr[_root_.sn.gnome.glib.internal.GTimeVal]) */
      ]
  ): PixbufAnimationIter /* None */ = new PixbufAnimationIter(
    gdk_pixbuf_animation_get_iter(
      this.raw.asInstanceOf,
      start_time
        .map[Ptr[_root_.sn.gnome.glib.internal.GTimeVal]](o => o)
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GTimeVal]]
        )
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a static image for the animation.
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
    */
  def getStaticImage(): Pixbuf /* None */ = new Pixbuf(
    gdk_pixbuf_animation_get_static_image(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries the width of the bounding box of a pixbuf animation.
    */
  def getWidth(): Int /* None */ = gdk_pixbuf_animation_get_width(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether the animation is a static image.
    *
    * If you load a file with gdk_pixbuf_animation_new_from_file() and it turns
    * out to be a plain, unanimated image, then this function will return
    * `TRUE`. Use gdk_pixbuf_animation_get_static_image() to retrieve the image.
    */
  def isStaticImage(): Boolean /* None */ =
    gdk_pixbuf_animation_is_static_image(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a reference to an animation.
    */
  override def ref(): PixbufAnimation /* None */ = new PixbufAnimation(
    gdk_pixbuf_animation_ref(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a reference from an animation.
    */
  override def unref(): Unit /* None */ = gdk_pixbuf_animation_unref(
    this.raw.asInstanceOf
  )

end PixbufAnimation

object PixbufAnimation:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new animation by loading it from a file.
    *
    * The file format is detected automatically.
    *
    * If the file's format does not support multi-frame images, then an
    * animation with a single frame will be created.
    *
    * Possible errors are in the `GDK_PIXBUF_ERROR` and `G_FILE_ERROR` domains.
    */
  def fromFile(
      filename: String | CString /* Some(CString) */
  )(using Zone): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_file(
        __sn_extract_string(filename),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new pixbuf animation by loading an image from an resource.
    *
    * The file format is detected automatically. If `NULL` is returned, then
    * @error
    *   will be set.
    */
  def fromResource(
      resource_path: String | CString /* Some(CString) */
  )(using Zone): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_resource(
        __sn_extract_string(resource_path),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new animation by loading it from an input stream.
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
    */
  def fromStream(
      stream: InputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GInputStream]) */,
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ]
  ): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_stream(
        stream.getUnsafeRawPointer().asInstanceOf,
        cancellable
          .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
            o.getUnsafeRawPointer().asInstanceOf
          )
          .getOrElse(
            null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
          ),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous pixbuf animation creation operation started with
    * [func@GdkPixbuf.PixbufAnimation.new_from_stream_async].
    */
  def fromStreamFinish(
      async_result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[PixbufAnimation] = GResult.wrap(__errorPtr =>
    new PixbufAnimation(
      gdk_pixbuf_animation_new_from_stream_finish(
        async_result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end PixbufAnimation
