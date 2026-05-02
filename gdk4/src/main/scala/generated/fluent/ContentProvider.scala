package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkContentProvider
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GBytes
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GdkContentProvider` is used to provide content for the clipboard or for
  * drag-and-drop operations in a number of formats.
  *
  * To create a `GdkContentProvider`, use
  * [ctor@Gdk.ContentProvider.new_for_value] or
  * [ctor@Gdk.ContentProvider.new_for_bytes].
  *
  * GDK knows how to handle common text and image formats out-of-the-box. See
  * [class@Gdk.ContentSerializer] and [class@Gdk.ContentDeserializer] if you
  * want to add support for application-specific data formats.
  */
class ContentProvider(raw: Ptr[GdkContentProvider])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the ::content-changed signal.
    */
  def contentChanged(): Unit /* None */ = gdk_content_provider_content_changed(
    this.raw.asInstanceOf[Ptr[GdkContentProvider]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the contents of @provider stored in @value.
    *
    * The @value will have been initialized to the `GType` the value should be
    * provided in. This given `GType` does not need to be listed in the formats
    * returned by [method@Gdk.ContentProvider.ref_formats]. However, if the
    * given `GType` is not supported, this operation can fail and
    * `G_IO_ERROR_NOT_SUPPORTED` will be reported.
    */
  @annotation.compileTimeOnly(
    "Method get_value contains an OUT parameter, which is not supported yet"
  )
  private def getValue__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the formats that the provider can provide its current contents in.
    */
  def refFormats(): Ptr[GdkContentFormats] /* None */ =
    gdk_content_provider_ref_formats(
      this.raw.asInstanceOf[Ptr[GdkContentProvider]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the formats that the provider suggests other applications to store
    * the data in.
    *
    * An example of such an application would be a clipboard manager.
    *
    * This can be assumed to be a subset of
    * [method@Gdk.ContentProvider.ref_formats].
    */
  def refStorableFormats(): Ptr[GdkContentFormats] /* None */ =
    gdk_content_provider_ref_storable_formats(
      this.raw.asInstanceOf[Ptr[GdkContentProvider]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously writes the contents of @provider to @stream in the given
    * @mime_type.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.ContentProvider.write_mime_type_finish] to get the result
    * of the operation.
    *
    * The given mime type does not need to be listed in the formats returned by
    * [method@Gdk.ContentProvider.ref_formats]. However, if the given `GType` is
    * not supported, `G_IO_ERROR_NOT_SUPPORTED` will be reported.
    *
    * The given @stream will not be closed.
    */
  def writeMimeTypeAsync(
      mime_type: String | CString /* Some(CString) */,
      stream: OutputStream /* Some(Ptr[_root_.sn.gnome.gio.internal.GOutputStream]) */,
      io_priority: Int /* Some(CInt) */,
      cancellable: Option[
        Cancellable /* Some(Ptr[_root_.sn.gnome.gio.internal.GCancellable]) */
      ],
      callback: Option[
        GAsyncReadyCallback /* Some(_root_.sn.gnome.gio.internal.GAsyncReadyCallback) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = gdk_content_provider_write_mime_type_async(
    this.raw.asInstanceOf[Ptr[GdkContentProvider]],
    __sn_extract_string(mime_type),
    stream.getUnsafeRawPointer().asInstanceOf,
    io_priority,
    cancellable
      .map[Ptr[_root_.sn.gnome.gio.internal.GCancellable]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GCancellable]]
      ),
    callback
      .map[_root_.sn.gnome.gio.internal.GAsyncReadyCallback](o => o)
      .getOrElse(
        null.asInstanceOf[_root_.sn.gnome.gio.internal.GAsyncReadyCallback]
      ),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an asynchronous write operation.
    *
    * See [method@Gdk.ContentProvider.write_mime_type_async].
    */
  def writeMimeTypeFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    gdk_content_provider_write_mime_type_finish(
      this.raw.asInstanceOf[Ptr[GdkContentProvider]],
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
end ContentProvider

object ContentProvider:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a content provider that provides the given @bytes as data for the
    * given @mime_type.
    */
  def forBytes(
      mime_type: String | CString /* Some(CString) */,
      bytes: Ptr[GBytes] /* Some(Ptr[_root_.sn.gnome.glib.internal.GBytes]) */
  )(using Zone): ContentProvider = new ContentProvider(
    gdk_content_provider_new_for_bytes(
      __sn_extract_string(mime_type),
      bytes
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a content provider that provides the given @value.
    */
  def forValue(
      value: Ptr[
        GValue
      ] /* Some(Ptr[_root_.sn.gnome.gobject.internal.GValue]) */
  ): ContentProvider = new ContentProvider(
    gdk_content_provider_new_for_value(value).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a content provider that provides the value of the given
    * @type.
    *
    * The value is provided using G_VALUE_COLLECT(), so the same rules apply as
    * when calling g_object_new() or g_object_set().
    */
  inline def typed(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      args: Any*
  ): ContentProvider = new ContentProvider(
    gdk_content_provider_new_typed(`type`, args*).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a content provider that represents all the given @providers.
    *
    * Whenever data needs to be written, the union provider will try the given
    * @providers
    *   in the given order and the first one supporting a format will be chosen
    *   to provide it.
    *
    * This allows an easy way to support providing data in different formats.
    * For example, an image may be provided by its file and by the image
    * contents with a call such as
    * ```c
    * gdk_content_provider_new_union ((GdkContentProvider *[2]) {
    *                                   gdk_content_provider_new_typed (G_TYPE_FILE, file),
    *                                   gdk_content_provider_new_typed (G_TYPE_TEXTURE, texture)
    *                                 }, 2);
    * ```
    */
  @annotation.compileTimeOnly(
    "Constructor new_union is weird: non NULL-terminated arrays require special handling"
  )
  def union() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ContentProvider
