package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{ContentProvider, Display, Texture}
import sn.gnome.gdk4.internal.GdkClipboard
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType

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
  def getContent(): ContentProvider /* None */ = new ContentProvider(
    gdk_clipboard_get_content(
      this.raw.asInstanceOf[Ptr[GdkClipboard]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkDisplay` that the clipboard was created for.
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_clipboard_get_display(
      this.raw.asInstanceOf[Ptr[GdkClipboard]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the formats that the clipboard can provide its current contents in.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  def getFormats__ = ???

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
  def isLocal(): Boolean /* None */ =
    gdk_clipboard_is_local(this.raw.asInstanceOf[Ptr[GdkClipboard]]).value.!=(0)

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
  @annotation.compileTimeOnly(
    "Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  def readAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_async].
    */
  @annotation.compileTimeOnly(
    "Method read_finish contains an OUT parameter, which is not supported yet"
  )
  def readFinish__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def readTextAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_text_async].
    */
  def readTextFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  )(using Zone): GResult[String /* None */ ] = GResult.wrap(__errorPtr =>
    fromCString(
      gdk_clipboard_read_text_finish(
        this.raw.asInstanceOf[Ptr[GdkClipboard]],
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def readTextureAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_texture_async].
    */
  def readTextureFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Texture /* None */ ] = GResult.wrap(__errorPtr =>
    new Texture(
      gdk_clipboard_read_texture_finish(
        this.raw.asInstanceOf[Ptr[GdkClipboard]],
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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def readValueAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard read.
    *
    * See [method@Gdk.Clipboard.read_value_async].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def readValueFinish__ = ???

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
  inline def set(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      args: Any*
  ): Unit /* None */ =
    gdk_clipboard_set(this.raw.asInstanceOf[Ptr[GdkClipboard]], `type`, args*)

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
  def setContent(
      provider: Option[ContentProvider /* Some(Ptr[GdkContentProvider]) */ ]
  ): Boolean /* None */ = gdk_clipboard_set_content(
    this.raw.asInstanceOf[Ptr[GdkClipboard]],
    provider
      .map[Ptr[GdkContentProvider]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GdkContentProvider]])
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Puts the given @text into the clipboard.
    */
  def setText(
      text: String | CString /* Some(CString) */
  )(using Zone): Unit /* None */ = gdk_clipboard_set_text(
    this.raw.asInstanceOf[Ptr[GdkClipboard]],
    __sn_extract_string(text)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Puts the given @texture into the clipboard.
    */
  def setTexture(
      texture: Texture /* Some(Ptr[GdkTexture]) */
  ): Unit /* None */ = gdk_clipboard_set_texture(
    this.raw.asInstanceOf[Ptr[GdkClipboard]],
    texture.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the clipboard to contain the value collected from the given @args.
    */
  def setValist(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      args: CVarArgList /* Some(va_list) */
  ): Unit /* None */ = gdk_clipboard_set_valist(
    this.raw.asInstanceOf[Ptr[GdkClipboard]],
    `type`,
    args
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the @clipboard to contain the given @value.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def setValue__ = ???

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
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def storeAsync__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous clipboard store.
    *
    * See [method@Gdk.Clipboard.store_async].
    */
  def storeFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gdk_clipboard_store_finish(
      this.raw.asInstanceOf[Ptr[GdkClipboard]],
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
