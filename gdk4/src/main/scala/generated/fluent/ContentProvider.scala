package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentProvider
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GType,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A `GdkContentProvider` is used to provide content for the clipboard or for
  * drag-and-drop operations in a number of formats.
  *
  * To create a `GdkContentProvider`, use
  * [ctor@Gdk.ContentProvider.new_for_value] or
  * [ctor@Gdk.ContentProvider.new_for_bytes].
  *
  * GDK knows how to handle common text and image formats out-of-the-box. See
  * [class@Gdk.ContentSerializer] and [class@Gdk.ContentDeserializer] if you
  * want to add support for application-specific data formats.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContentProvider private[gnome] (raw: Ptr[GdkContentProvider])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emits the ::content-changed signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentChanged(): Unit /* None */ =
    gdk_content_provider_content_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentProvider]]
    )
  end contentChanged

  /** Gets the contents of @provider stored in @value.
    *
    * The @value will have been initialized to the `GType` the value should be
    * provided in. This given `GType` does not need to be listed in the formats
    * returned by [method@Gdk.ContentProvider.ref_formats]. However, if the
    * given `GType` is not supported, this operation can fail and
    * `G_IO_ERROR_NOT_SUPPORTED` will be reported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value]: Method get_value contains an OUT parameter, which is not supported yet"
  )
  private def getValue__ = ???

  /** Gets the formats that the provider can provide its current contents in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method ref_formats/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def refFormats__ = ???

  /** Gets the formats that the provider suggests other applications to store
    * the data in.
    *
    * An example of such an application would be a clipboard manager.
    *
    * This can be assumed to be a subset of
    * [method@Gdk.ContentProvider.ref_formats].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method ref_storable_formats/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def refStorableFormats__ = ???

  /** Asynchronously writes the contents of @provider to @stream in the given
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method write_mime_type_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def writeMimeTypeAsync__ = ???

  /** Finishes an asynchronous write operation.
    *
    * See [method@Gdk.ContentProvider.write_mime_type_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def writeMimeTypeFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      gdk_content_provider_write_mime_type_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentProvider]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end writeMimeTypeFinish

  /** Emitted whenever the content provided by this provider has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onContentChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkContentProvider],
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
    val signal = c"content-changed"
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
  end onContentChanged
end ContentProvider

object ContentProvider:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkContentProvider])(using Runtime) =
    summon[Runtime].getOrCreate[ContentProvider](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ContentProvider(ptr)
    )

  /** Create a content provider that provides the given @bytes as data for the
    * given @mime_type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def forBytes() = ???

  /** Create a content provider that provides the given @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def forValue() = ???

  /** Create a content provider that provides the value of the given
    * @type.
    *
    * The value is provided using G_VALUE_COLLECT(), so the same rules apply as
    * when calling g_object_new() or g_object_set().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def typed(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      args: Any*
  )(using Runtime): ContentProvider =
    val raw: Ptr[Byte] =
      gdk_content_provider_new_typed(`type`, args*).asInstanceOf
    summon[Runtime].getOrCreate[ContentProvider](
      raw,
      r => ContentProvider.applyUnsafe(r.asInstanceOf)
    )
  end typed

  /** Creates a content provider that represents all the given @providers.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "Constructor new_union is weird: non NULL-terminated arrays require special handling"
  )
  private def union() = ???

end ContentProvider
