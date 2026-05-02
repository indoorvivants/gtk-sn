package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentSerializer
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.OutputStream
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GdkContentSerializer` is used to serialize content for inter-application
  * data transfers.
  *
  * The `GdkContentSerializer` transforms an object that is identified by a
  * GType into a serialized form (i.e. a byte stream) that is identified by a
  * mime type.
  *
  * GTK provides serializers and deserializers for common data types such as
  * text, colors, images or file lists. To register your own serialization
  * functions, use [func@Gdk.content_register_serializer].
  *
  * Also see [class@Gdk.ContentDeserializer].
  */
class ContentSerializer(raw: Ptr[GdkContentSerializer])
    extends Object(raw.asInstanceOf),
      AsyncResult:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the cancellable for the current operation.
    *
    * This is the `GCancellable` that was passed to
    * [func@content_serialize_async].
    */
  def getCancellable(): Cancellable /* None */ = new Cancellable(
    gdk_content_serializer_get_cancellable(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GType` to of the object to serialize.
    */
  def getGtype(): GType /* None */ = gdk_content_serializer_get_gtype(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the mime type to serialize to.
    */
  def getMimeType()(using Zone): String /* None */ = fromCString(
    gdk_content_serializer_get_mime_type(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the output stream for the current operation.
    *
    * This is the stream that was passed to [func@content_serialize_async].
    */
  def getOutputStream(): OutputStream /* None */ = new OutputStream(
    gdk_content_serializer_get_output_stream(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the I/O priority for the current operation.
    *
    * This is the priority that was passed to [func@content_serialize_async].
    */
  def getPriority(): Int /* None */ = gdk_content_serializer_get_priority(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the data that was associated with the current operation.
    *
    * See [method@Gdk.ContentSerializer.set_task_data].
    */
  def getTaskData(): Ptr[Byte] /* None */ =
    gdk_content_serializer_get_task_data(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the user data that was passed when the serializer was registered.
    */
  def getUserData(): Ptr[Byte] /* None */ =
    gdk_content_serializer_get_user_data(this.raw.asInstanceOf).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GValue` to read the object to serialize from.
    */
  def getValue(): Ptr[GValue] /* None */ = gdk_content_serializer_get_value(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicate that the serialization has ended with an error.
    *
    * This function consumes @error.
    */
  def returnError(
      error: Ptr[GError] /* Some(Ptr[_root_.sn.gnome.glib.internal.GError]) */
  ): Unit /* None */ =
    gdk_content_serializer_return_error(this.raw.asInstanceOf, error)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicate that the serialization has been successfully completed.
    */
  def returnSuccess(): Unit /* None */ = gdk_content_serializer_return_success(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Associate data with the current serialization operation.
    */
  def setTaskData(
      data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      _notify: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gdk_content_serializer_set_task_data(
    this.raw.asInstanceOf,
    data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    _notify
  )

end ContentSerializer
