package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.internal.GFileMonitor
import sn.gnome.gio.internal.GFileMonitorEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class FileMonitor(raw: Ptr[GFileMonitor]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def cancel(): Boolean =
    g_file_monitor_cancel(this.raw.asInstanceOf).value.!=(0)

  def emitEvent(
      child: File,
      other_file: File,
      event_type: GFileMonitorEvent
  ): Unit = g_file_monitor_emit_event(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    other_file.getUnsafeRawPointer().asInstanceOf,
    event_type
  )

  def isCancelled(): Boolean =
    g_file_monitor_is_cancelled(this.raw.asInstanceOf).value.!=(0)

  def setRateLimit(limit_msecs: Int): Unit =
    g_file_monitor_set_rate_limit(this.raw.asInstanceOf, gint(limit_msecs))

end FileMonitor
