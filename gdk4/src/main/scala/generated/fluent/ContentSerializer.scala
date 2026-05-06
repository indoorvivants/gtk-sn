package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentSerializer
import sn.gnome.gio.fluent.{AsyncResult, Cancellable, OutputStream}
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType

/** A `GdkContentSerializer` is used to serialize content for inter-application
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContentSerializer(raw: Ptr[GdkContentSerializer])
    extends Object(raw.asInstanceOf),
      AsyncResult:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the cancellable for the current operation.
    *
    * This is the `GCancellable` that was passed to
    * [func@content_serialize_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCancellable(): Cancellable /* None */ = new Cancellable(
    gdk_content_serializer_get_cancellable(
      this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
    ).asInstanceOf
  )

  /** Gets the `GType` to of the object to serialize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGtype(): GType /* None */ = gdk_content_serializer_get_gtype(
    this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
  )

  /** Gets the mime type to serialize to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMimeType()(using Zone): String /* None */ = fromCString(
    gdk_content_serializer_get_mime_type(
      this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
    ).asInstanceOf
  )

  /** Gets the output stream for the current operation.
    *
    * This is the stream that was passed to [func@content_serialize_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOutputStream(): OutputStream /* None */ = new OutputStream(
    gdk_content_serializer_get_output_stream(
      this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
    ).asInstanceOf
  )

  /** Gets the I/O priority for the current operation.
    *
    * This is the priority that was passed to [func@content_serialize_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPriority(): Int /* None */ = gdk_content_serializer_get_priority(
    this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
  )

  /** Gets the data that was associated with the current operation.
    *
    * See [method@Gdk.ContentSerializer.set_task_data].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTaskData(): Ptr[Byte] /* None */ =
    gdk_content_serializer_get_task_data(
      this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
    ).value

  /** Gets the user data that was passed when the serializer was registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserData(): Ptr[Byte] /* None */ =
    gdk_content_serializer_get_user_data(
      this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
    ).value

  /** Gets the `GValue` to read the object to serialize from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def getValue__ = ???

  /** Indicate that the serialization has ended with an error.
    *
    * This function consumes @error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_error/<method parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))"
  )
  private def returnError__ = ???

  /** Indicate that the serialization has been successfully completed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def returnSuccess(): Unit /* None */ = gdk_content_serializer_return_success(
    this.raw.asInstanceOf[Ptr[GdkContentSerializer]]
  )

  /** Associate data with the current serialization operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_task_data/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def setTaskData__ = ???

end ContentSerializer
