package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentDeserializer
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InputStream
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GdkContentDeserializer` is used to deserialize content received via
  * inter-application data transfers.
  *
  * The `GdkContentDeserializer` transforms serialized content that is
  * identified by a mime type into an object identified by a GType.
  *
  * GTK provides serializers and deserializers for common data types such as
  * text, colors, images or file lists. To register your own deserialization
  * functions, use [func@content_register_deserializer].
  *
  * Also see [class@Gdk.ContentSerializer].
  */
class ContentDeserializer(raw: Ptr[GdkContentDeserializer])
    extends Object(raw.asInstanceOf),
      AsyncResult:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the cancellable for the current operation.
    *
    * This is the `GCancellable` that was passed to
    * [func@Gdk.content_deserialize_async].
    */
  def getCancellable(): Cancellable = new Cancellable(
    gdk_content_deserializer_get_cancellable(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GType` to create an instance of.
    */
  def getGtype(): GType = gdk_content_deserializer_get_gtype(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the input stream for the current operation.
    *
    * This is the stream that was passed to
    * [func@Gdk.content_deserialize_async].
    */
  def getInputStream(): InputStream = new InputStream(
    gdk_content_deserializer_get_input_stream(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the mime type to deserialize from.
    */
  def getMimeType()(using Zone): String = fromCString(
    gdk_content_deserializer_get_mime_type(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the I/O priority for the current operation.
    *
    * This is the priority that was passed to
    * [func@Gdk.content_deserialize_async].
    */
  def getPriority(): Int = gdk_content_deserializer_get_priority(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the data that was associated with the current operation.
    *
    * See [method@Gdk.ContentDeserializer.set_task_data].
    */
  def getTaskData(): Ptr[Byte] = gdk_content_deserializer_get_task_data(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the user data that was passed when the deserializer was registered.
    */
  def getUserData(): Ptr[Byte] = gdk_content_deserializer_get_user_data(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GValue` to store the deserialized object in.
    */
  def getValue(): Ptr[GValue] = gdk_content_deserializer_get_value(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicate that the deserialization has ended with an error.
    *
    * This function consumes @error.
    */
  def returnError(error: Ptr[GError]): Unit =
    gdk_content_deserializer_return_error(this.raw.asInstanceOf, error)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicate that the deserialization has been successfully completed.
    */
  def returnSuccess(): Unit = gdk_content_deserializer_return_success(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associate data with the current deserialization operation.
    */
  def setTaskData(data: Ptr[Byte], _notify: GDestroyNotify): Unit =
    gdk_content_deserializer_set_task_data(
      this.raw.asInstanceOf,
      gpointer(data),
      _notify
    )

end ContentDeserializer
