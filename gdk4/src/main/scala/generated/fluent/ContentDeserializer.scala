package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkContentDeserializer
import sn.gnome.gio.fluent.{AsyncResult, Cancellable, InputStream}
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*

/** A `GdkContentDeserializer` is used to deserialize content received via
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ContentDeserializer private[gnome] (raw: Ptr[GdkContentDeserializer])
    extends Object(raw.asInstanceOf),
      AsyncResult:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the cancellable for the current operation.
    *
    * This is the `GCancellable` that was passed to
    * [func@Gdk.content_deserialize_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCancellable()(using
      Runtime
  ): sn.gnome.gio.fluent.Cancellable /* None */ =
    sn.gnome.gio.fluent.Cancellable.applyUnsafe(
      gdk_content_deserializer_get_cancellable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
      ).asInstanceOf
    )
  end getCancellable

  /** Gets the `GType` to create an instance of.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGtype(): GType /* None */ =
    gdk_content_deserializer_get_gtype(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
    )
  end getGtype

  /** Gets the input stream for the current operation.
    *
    * This is the stream that was passed to
    * [func@Gdk.content_deserialize_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputStream()(using
      Runtime
  ): sn.gnome.gio.fluent.InputStream /* None */ =
    sn.gnome.gio.fluent.InputStream.applyUnsafe(
      gdk_content_deserializer_get_input_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
      ).asInstanceOf
    )
  end getInputStream

  /** Gets the mime type to deserialize from.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMimeType()(using Zone): String /* None */ =
    fromCString(
      gdk_content_deserializer_get_mime_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
      ).asInstanceOf
    )
  end getMimeType

  /** Gets the I/O priority for the current operation.
    *
    * This is the priority that was passed to
    * [func@Gdk.content_deserialize_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPriority(): Int /* None */ =
    gdk_content_deserializer_get_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
    )
  end getPriority

  /** Gets the data that was associated with the current operation.
    *
    * See [method@Gdk.ContentDeserializer.set_task_data].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTaskData(): Ptr[Byte] /* None */ =
    gdk_content_deserializer_get_task_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
    ).value
  end getTaskData

  /** Gets the user data that was passed when the deserializer was registered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getUserData(): Ptr[Byte] /* None */ =
    gdk_content_deserializer_get_user_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
    ).value
  end getUserData

  /** Gets the `GValue` to store the deserialized object in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_value/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(GValue*)))"
  )
  private def getValue__ = ???

  /** Indicate that the deserialization has ended with an error.
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

  /** Indicate that the deserialization has been successfully completed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def returnSuccess(): Unit /* None */ =
    gdk_content_deserializer_return_success(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkContentDeserializer]]
    )
  end returnSuccess

  /** Associate data with the current deserialization operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_task_data/<method parameters>/notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def setTaskData__ = ???

end ContentDeserializer

object ContentDeserializer:
  def applyUnsafe(ptr: Ptr[GdkContentDeserializer])(using Runtime) =
    summon[Runtime].getOrCreate[ContentDeserializer](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ContentDeserializer(ptr)
    )

end ContentDeserializer
