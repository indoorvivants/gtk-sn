package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkClipboard
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GdkClipboard` object represents data shared between applications or
  * inside an application.
  *
  * To get a `GdkClipboard` object, use [method@Gdk.Display.get_clipboard] or
  * [method@Gdk.Display.get_primary_clipboard]. You can find out about the data
  * that is currently available in a clipboard using
  * [method@Gdk.Clipboard.get_formats].
  *
  * To make text or image data available in a clipboard, use
  * [method@Gdk.Clipboard.set_text] or [method@Gdk.Clipboard.set_texture]. For
  * other data, you can use [method@Gdk.Clipboard.set_content], which takes a
  * [class@Gdk.ContentProvider] object.
  *
  * To read textual or image data from a clipboard, use
  * [method@Gdk.Clipboard.read_text_async] or
  * [method@Gdk.Clipboard.read_texture_async]. For other data, use
  * [method@Gdk.Clipboard.read_async], which provides a `GInputStream` object.
  */
class Clipboard(raw: Ptr[GdkClipboard]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkContentProvider` currently set on @clipboard.
    *
    * If the @clipboard is empty or its contents are not owned by the current
    * process, %NULL will be returned.
    */
  def getContent(): ContentProvider = new ContentProvider(
    gdk_clipboard_get_content(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkDisplay` that the clipboard was created for.
    */
  def getDisplay(): Display = new Display(
    gdk_clipboard_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the formats that the clipboard can provide its current contents in.
    */
  def getFormats(): Ptr[GdkContentFormats] = gdk_clipboard_get_formats(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns if the clipboard is local.
    *
    * A clipboard is considered local if it was last claimed by the running
    * application.
    *
    * Note that [method@Gdk.Clipboard.get_content] may return %NULL even on a
    * local clipboard. In this case the clipboard is empty.
    */
  def isLocal(): Boolean =
    gdk_clipboard_is_local(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously requests an input stream to read the @clipboard's contents
    * from.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.Clipboard.read_finish] to get the result of the
    * operation.
    *
    * The clipboard will choose the most suitable mime type from the given list
    * to fulfill the request, preferring the ones listed first.
    */
  def readAsync(
      mime_types: Ptr[CString],
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  )(using Zone): Unit = gdk_clipboard_read_async(
    this.raw.asInstanceOf,
    mime_types,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_async].
    */
  @annotation.compileTimeOnly(
    "Method read_finish contains an OUT parameter, which is not supported yet"
  )
  def readFinish(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously request the @clipboard contents converted to a string.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.Clipboard.read_text_finish] to get the result.
    *
    * This is a simple wrapper around [method@Gdk.Clipboard.read_value_async].
    * Use that function or [method@Gdk.Clipboard.read_async] directly if you
    * need more control over the operation.
    */
  def readTextAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_read_text_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_text_async].
    */
  def readTextFinish(result: AsyncResult)(using Zone): GResult[String] =
    GResult.wrap(__errorPtr =>
      fromCString(
        gdk_clipboard_read_text_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously request the @clipboard contents converted to a `GdkPixbuf`.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.Clipboard.read_texture_finish] to get the result.
    *
    * This is a simple wrapper around [method@Gdk.Clipboard.read_value_async].
    * Use that function or [method@Gdk.Clipboard.read_async] directly if you
    * need more control over the operation.
    */
  def readTextureAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_read_texture_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_texture_async].
    */
  def readTextureFinish(result: AsyncResult): GResult[Texture] =
    GResult.wrap(__errorPtr =>
      new Texture(
        gdk_clipboard_read_texture_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously request the @clipboard contents converted to the given
    * @type.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.Clipboard.read_value_finish] to get the resulting
    * `GValue`.
    *
    * For local clipboard contents that are available in the given `GType`, the
    * value will be copied directly. Otherwise, GDK will try to use
    * [func@content_deserialize_async] to convert the clipboard's data.
    */
  def readValueAsync(
      `type`: GType,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_read_value_async(
    this.raw.asInstanceOf,
    `type`,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_value_async].
    */
  def readValueFinish(result: AsyncResult): GResult[Ptr[GValue]] =
    GResult.wrap(__errorPtr =>
      gdk_clipboard_read_value_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the clipboard to contain the value collected from the given varargs.
    *
    * Values should be passed the same way they are passed to other value
    * collecting APIs, such as [method@GObject.Object.set] or
    * [func@GObject.signal_emit].
    *
    * ```c
    * gdk_clipboard_set (clipboard, GTK_TYPE_STRING, "Hello World");
    *
    * gdk_clipboard_set (clipboard, GDK_TYPE_TEXTURE, some_texture);
    * ```
    */
  inline def set(`type`: GType, args: Any*): Unit =
    gdk_clipboard_set(this.raw.asInstanceOf, `type`, args*)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new content provider on @clipboard.
    *
    * The clipboard will claim the `GdkDisplay`'s resources and advertise these
    * new contents to other applications.
    *
    * In the rare case of a failure, this function will return %FALSE. The
    * clipboard will then continue reporting its old contents and ignore
    * @provider.
    *
    * If the contents are read by either an external application or the
    * @clipboard's
    *   read functions, @clipboard will select the best format to transfer the
    *   contents and then request that format from @provider.
    */
  def setContent(provider: ContentProvider): Boolean =
    gdk_clipboard_set_content(
      this.raw.asInstanceOf,
      provider.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Puts the given @text into the clipboard.
    */
  def setText(text: String | CString)(using Zone): Unit =
    gdk_clipboard_set_text(this.raw.asInstanceOf, __sn_extract_string(text))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Puts the given @texture into the clipboard.
    */
  def setTexture(texture: Texture): Unit = gdk_clipboard_set_texture(
    this.raw.asInstanceOf,
    texture.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the clipboard to contain the value collected from the given @args.
    */
  def setValist(`type`: GType, args: CVarArgList): Unit =
    gdk_clipboard_set_valist(this.raw.asInstanceOf, `type`, args)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @clipboard to contain the given @value.
    */
  def setValue(value: Ptr[GValue]): Unit =
    gdk_clipboard_set_value(this.raw.asInstanceOf, value)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously instructs the @clipboard to store its contents remotely.
    *
    * If the clipboard is not local, this function does nothing but report
    * success.
    *
    * The @callback must call [method@Gdk.Clipboard.store_finish].
    *
    * The purpose of this call is to preserve clipboard contents beyond the
    * lifetime of an application, so this function is typically called on exit.
    * Depending on the platform, the functionality may not be available unless a
    * "clipboard manager" is running.
    *
    * This function is called automatically when a [class@Gtk.Application] is
    * shut down, so you likely don't need to call it.
    */
  def storeAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_store_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard store.
    *
    * See [method@Gdk.Clipboard.store_async].
    */
  def storeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gdk_clipboard_store_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Clipboard
