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

class ContentDeserializer(raw: Ptr[GdkContentDeserializer])
    extends Object(raw.asInstanceOf),
      AsyncResult:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getCancellable(): Cancellable = new Cancellable(
    gdk_content_deserializer_get_cancellable(this.raw.asInstanceOf).asInstanceOf
  )

  def getGtype(): GType = gdk_content_deserializer_get_gtype(
    this.raw.asInstanceOf
  )

  def getInputStream(): InputStream = new InputStream(
    gdk_content_deserializer_get_input_stream(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getMimeType()(using Zone): String = fromCString(
    gdk_content_deserializer_get_mime_type(this.raw.asInstanceOf).asInstanceOf
  )

  def getPriority(): Int = gdk_content_deserializer_get_priority(
    this.raw.asInstanceOf
  )

  def getTaskData(): Ptr[Byte] = gdk_content_deserializer_get_task_data(
    this.raw.asInstanceOf
  ).value

  def getUserData(): Ptr[Byte] = gdk_content_deserializer_get_user_data(
    this.raw.asInstanceOf
  ).value

  def getValue(): Ptr[GValue] = gdk_content_deserializer_get_value(
    this.raw.asInstanceOf
  )

  def returnError(error: Ptr[GError]): Unit =
    gdk_content_deserializer_return_error(this.raw.asInstanceOf, error)

  def returnSuccess(): Unit = gdk_content_deserializer_return_success(
    this.raw.asInstanceOf
  )

  def setTaskData(data: Ptr[Byte], _notify: GDestroyNotify): Unit =
    gdk_content_deserializer_set_task_data(
      this.raw.asInstanceOf,
      gpointer(data),
      _notify
    )

end ContentDeserializer
