package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GCancellable
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GPollFD
import sn.gnome.glib.internal.GSource
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gulong
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GCallback

class Cancellable(raw: Ptr[GCancellable]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def cancel(): Unit = g_cancellable_cancel(this.raw.asInstanceOf)

  def connect(
      callback: GCallback,
      data: Ptr[Byte],
      data_destroy_func: GDestroyNotify
  ): CUnsignedLongInt = g_cancellable_connect(
    this.raw.asInstanceOf,
    callback,
    gpointer(data),
    data_destroy_func
  ).value

  def disconnect(handler_id: CUnsignedLongInt): Unit =
    g_cancellable_disconnect(this.raw.asInstanceOf, gulong(handler_id))

  def getFd(): Int = g_cancellable_get_fd(this.raw.asInstanceOf)

  def isCancelled(): Boolean =
    g_cancellable_is_cancelled(this.raw.asInstanceOf).value.!=(0)

  def makePollfd(pollfd: Ptr[GPollFD]): Boolean =
    g_cancellable_make_pollfd(this.raw.asInstanceOf, pollfd).value.!=(0)

  def popCurrent(): Unit = g_cancellable_pop_current(this.raw.asInstanceOf)

  def pushCurrent(): Unit = g_cancellable_push_current(this.raw.asInstanceOf)

  def releaseFd(): Unit = g_cancellable_release_fd(this.raw.asInstanceOf)

  def reset(): Unit = g_cancellable_reset(this.raw.asInstanceOf)

  def setErrorIfCancelled(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_cancellable_set_error_if_cancelled(
      this.raw.asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def sourceNew(): Ptr[GSource] = g_cancellable_source_new(
    this.raw.asInstanceOf
  )

end Cancellable

object Cancellable:
  def apply(): Cancellable = new Cancellable(g_cancellable_new().asInstanceOf)
end Cancellable
