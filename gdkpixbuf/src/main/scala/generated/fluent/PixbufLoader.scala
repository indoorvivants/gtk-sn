package sn.gnome.gdkpixbuf.fluent

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.fluent.{Pixbuf, PixbufAnimation}
import sn.gnome.gdkpixbuf.internal.GdkPixbufLoader
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** Incremental image loader.
  *
  * `GdkPixbufLoader` provides a way for applications to drive the process of
  * loading an image, by letting them send the image data directly to the loader
  * instead of having the loader read the data from a file. Applications can use
  * this functionality instead of `gdk_pixbuf_new_from_file()` or
  * `gdk_pixbuf_animation_new_from_file()` when they need to parse image data in
  * small chunks. For example, it should be used when reading an image from a
  * (potentially) slow network connection, or when loading an extremely large
  * file.
  *
  * To use `GdkPixbufLoader` to load an image, create a new instance, and call
  * [method@GdkPixbuf.PixbufLoader.write] to send the data to it. When done,
  * [method@GdkPixbuf.PixbufLoader.close] should be called to end the stream and
  * finalize everything.
  *
  * The loader will emit three important signals throughout the process:
  *
  *   - [signal@GdkPixbuf.PixbufLoader::size-prepared] will be emitted as soon
  *     as the image has enough information to determine the size of the image
  *     to be used. If you want to scale the image while loading it, you can
  *     call [method@GdkPixbuf.PixbufLoader.set_size] in response to this
  *     signal.
  *   - [signal@GdkPixbuf.PixbufLoader::area-prepared] will be emitted as soon
  *     as the pixbuf of the desired has been allocated. You can obtain the
  *     `GdkPixbuf` instance by calling
  *     [method@GdkPixbuf.PixbufLoader.get_pixbuf]. If you want to use it,
  *     simply acquire a reference to it. You can also call
  *     `gdk_pixbuf_loader_get_pixbuf()` later to get the same pixbuf.
  *   - [signal@GdkPixbuf.PixbufLoader::area-updated] will be emitted every time
  *     a region is updated. This way you can update a partially completed
  *     image. Note that you do not know anything about the completeness of an
  *     image from the updated area. For example, in an interlaced image you
  *     will need to make several passes before the image is done loading.
  *
  * ## Loading an animation
  *
  * Loading an animation is almost as easy as loading an image. Once the first
  * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been emitted, you
  * can call [method@GdkPixbuf.PixbufLoader.get_animation] to get the
  * [class@GdkPixbuf.PixbufAnimation] instance, and then call and
  * [method@GdkPixbuf.PixbufAnimation.get_iter] to get a
  * [class@GdkPixbuf.PixbufAnimationIter] to retrieve the pixbuf for the desired
  * time stamp.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufLoader(raw: Ptr[GdkPixbufLoader]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Informs a pixbuf loader that no further writes with
    * gdk_pixbuf_loader_write() will occur, so that it can free its internal
    * loading structures.
    *
    * This function also tries to parse any data that hasn't yet been parsed; if
    * the remaining data is partial or corrupt, an error will be returned.
    *
    * If `FALSE` is returned, `error` will be set to an error from the
    * `GDK_PIXBUF_ERROR` or `G_FILE_ERROR` domains.
    *
    * If you're just cancelling a load rather than expecting it to be finished,
    * passing `NULL` for `error` to ignore it is reasonable.
    *
    * Remember that this function does not release a reference on the loader, so
    * you will need to explicitly release any reference you hold.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gdk_pixbuf_loader_close(
      this.raw.asInstanceOf[Ptr[GdkPixbufLoader]],
      __errorPtr
    ).value.!=(0)
  )

  /** Queries the #GdkPixbufAnimation that a pixbuf loader is currently
    * creating.
    *
    * In general it only makes sense to call this function after the
    * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been emitted by
    * the loader.
    *
    * If the loader doesn't have enough bytes yet, and hasn't emitted the
    * `area-prepared` signal, this function will return `NULL`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAnimation(): PixbufAnimation /* None */ = new PixbufAnimation(
    gdk_pixbuf_loader_get_animation(
      this.raw.asInstanceOf[Ptr[GdkPixbufLoader]]
    ).asInstanceOf
  )

  /** Obtains the available information about the format of the currently
    * loading image file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_format/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PixbufFormat), @type -> DataRecord(GdkPixbufFormat*)))"
  )
  private def getFormat__ = ???

  /** Queries the #GdkPixbuf that a pixbuf loader is currently creating.
    *
    * In general it only makes sense to call this function after the
    * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been emitted by
    * the loader; this means that enough data has been read to know the size of
    * the image that will be allocated.
    *
    * If the loader has not received enough data via gdk_pixbuf_loader_write(),
    * then this function returns `NULL`.
    *
    * The returned pixbuf will be the same in all future calls to the loader, so
    * if you want to keep using it, you should acquire a reference to it.
    *
    * Additionally, if the loader is an animation, it will return the "static
    * image" of the animation (see gdk_pixbuf_animation_get_static_image()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPixbuf(): Pixbuf /* None */ = new Pixbuf(
    gdk_pixbuf_loader_get_pixbuf(
      this.raw.asInstanceOf[Ptr[GdkPixbufLoader]]
    ).asInstanceOf
  )

  /** Causes the image to be scaled while it is loaded.
    *
    * The desired image size can be determined relative to the original size of
    * the image by calling gdk_pixbuf_loader_set_size() from a signal handler
    * for the ::size-prepared signal.
    *
    * Attempts to set the desired image size are ignored after the emission of
    * the ::size-prepared signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  ): Unit /* None */ = gdk_pixbuf_loader_set_size(
    this.raw.asInstanceOf[Ptr[GdkPixbufLoader]],
    width,
    height
  )

  /** Parses the next `count` bytes in the given image buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method write/<method parameters>/buf]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))"
  )
  private def write__ = ???

  /** Parses the next contents of the given image buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method write_bytes/<method parameters>/buffer]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def writeBytes__ = ???

  /** This signal is emitted when the pixbuf loader has allocated the pixbuf in
    * the desired size.
    *
    * After this signal is emitted, applications can call
    * gdk_pixbuf_loader_get_pixbuf() to fetch the partially-loaded pixbuf.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAreaPrepared(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkPixbufLoader],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"area-prepared"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAreaPrepared

  /** This signal is emitted when a significant area of the image being loaded
    * has been updated.
    *
    * Normally it means that a complete scanline has been read in, but it could
    * be a different area as well.
    *
    * Applications can use this signal to know when to repaint areas of an image
    * that is being loaded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAreaUpdated(
      handler: ((x: Int, y: Int, width: Int, height: Int)) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (x: Int, y: Int, width: Int, height: Int),
      Unit
    ]
    val c_handler = CFuncPtr6.fromScalaFunction {
      (
          self: Ptr[GdkPixbufLoader],
          x: Int /* param */,
          y: Int /* param */,
          width: Int /* param */,
          height: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((x = x, y = y, width = width, height = height))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"area-updated"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onAreaUpdated

  /** This signal is emitted when gdk_pixbuf_loader_close() is called.
    *
    * It can be used by different parts of an application to receive
    * notification when an image loader is closed by the code that drives it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClosed(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkPixbufLoader],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"closed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onClosed

  /** This signal is emitted when the pixbuf loader has been fed the initial
    * amount of data that is required to figure out the size of the image that
    * it will create.
    *
    * Applications can call gdk_pixbuf_loader_set_size() in response to this
    * signal to set the desired size to which the image should be scaled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSizePrepared(handler: ((width: Int, height: Int)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (width: Int, height: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GdkPixbufLoader],
          width: Int /* param */,
          height: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((width = width, height = height))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"size-prepared"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onSizePrepared
end PixbufLoader

object PixbufLoader:
  /** Creates a new pixbuf loader object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): PixbufLoader = new PixbufLoader(
    gdk_pixbuf_loader_new().asInstanceOf
  )

  /** Creates a new pixbuf loader object that always attempts to parse image
    * data as if it were an image of MIME type @mime_type, instead of
    * identifying the type automatically.
    *
    * This function is useful if you want an error if the image isn't the
    * expected MIME type; for loading image formats that can't be reliably
    * identified by looking at the data; or if the user manually forces a
    * specific MIME type.
    *
    * The list of supported mime types depends on what image loaders are
    * installed, but typically "image/png", "image/jpeg", "image/gif",
    * "image/tiff" and "image/x-xpixmap" are among the supported mime types. To
    * obtain the full list of supported mime types, call
    * gdk_pixbuf_format_get_mime_types() on each of the #GdkPixbufFormat structs
    * returned by gdk_pixbuf_get_formats().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMimeType(
      mime_type: String | CString /* Some(CString) */
  )(using Zone): GResult[PixbufLoader] = GResult.wrap(__errorPtr =>
    new PixbufLoader(
      gdk_pixbuf_loader_new_with_mime_type(
        __sn_extract_string(mime_type),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Creates a new pixbuf loader object that always attempts to parse image
    * data as if it were an image of type @image_type, instead of identifying
    * the type automatically.
    *
    * This function is useful if you want an error if the image isn't the
    * expected type; for loading image formats that can't be reliably identified
    * by looking at the data; or if the user manually forces a specific type.
    *
    * The list of supported image formats depends on what image loaders are
    * installed, but typically "png", "jpeg", "gif", "tiff" and "xpm" are among
    * the supported formats. To obtain the full list of supported image formats,
    * call gdk_pixbuf_format_get_name() on each of the #GdkPixbufFormat structs
    * returned by gdk_pixbuf_get_formats().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withType(
      image_type: String | CString /* Some(CString) */
  )(using Zone): GResult[PixbufLoader] = GResult.wrap(__errorPtr =>
    new PixbufLoader(
      gdk_pixbuf_loader_new_with_type(
        __sn_extract_string(image_type),
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
end PixbufLoader
