package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.OutputStream
import sn.gnome.gio.internal.GFilterOutputStream
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class FilterOutputStream(raw: Ptr[GFilterOutputStream])
    extends OutputStream(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaseStream(): OutputStream = new OutputStream(
    g_filter_output_stream_get_base_stream(this.raw.asInstanceOf).asInstanceOf
  )

  def getCloseBaseStream(): Boolean =
    g_filter_output_stream_get_close_base_stream(this.raw.asInstanceOf).value
      .!=(0)

  def setCloseBaseStream(close_base: Boolean): Unit =
    g_filter_output_stream_set_close_base_stream(
      this.raw.asInstanceOf,
      gboolean(gint((if close_base == true then 1 else 0)))
    )

end FilterOutputStream
