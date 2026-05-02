package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.File
import sn.gnome.gio.internal.GFileMonitor
import sn.gnome.gio.internal.GFileMonitorEvent
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Monitors a file or directory for changes.
  *
  * To obtain a #GFileMonitor for a file or directory, use g_file_monitor(),
  * g_file_monitor_file(), or g_file_monitor_directory().
  *
  * To get informed about changes to the file or directory you are monitoring,
  * connect to the #GFileMonitor::changed signal. The signal will be emitted in
  * the [thread-default main context][g-main-context-push-thread-default] of the
  * thread that the monitor was created in (though if the global default main
  * context is blocked, this may cause notifications to be blocked even if the
  * thread-default context is still running).
  */
class FileMonitor(raw: Ptr[GFileMonitor]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cancels a file monitor.
    */
  def cancel(): Boolean /* None */ =
    g_file_monitor_cancel(this.raw.asInstanceOf[Ptr[GFileMonitor]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the #GFileMonitor::changed signal if a change has taken place.
    * Should be called from file monitor implementations only.
    *
    * Implementations are responsible to call this method from the
    * [thread-default main context][g-main-context-push-thread-default] of the
    * thread that the monitor was created in.
    */
  def emitEvent(
      child: File /* Some(Ptr[GFile]) */,
      other_file: File /* Some(Ptr[GFile]) */,
      event_type: GFileMonitorEvent /* Some(GFileMonitorEvent) */
  ): Unit /* None */ = g_file_monitor_emit_event(
    this.raw.asInstanceOf[Ptr[GFileMonitor]],
    child.getUnsafeRawPointer().asInstanceOf,
    other_file.getUnsafeRawPointer().asInstanceOf,
    event_type
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the monitor is canceled.
    */
  def isCancelled(): Boolean /* None */ = g_file_monitor_is_cancelled(
    this.raw.asInstanceOf[Ptr[GFileMonitor]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the rate limit to which the @monitor will report consecutive change
    * events to the same file.
    */
  def setRateLimit(
      limit_msecs: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_file_monitor_set_rate_limit(
    this.raw.asInstanceOf[Ptr[GFileMonitor]],
    gint(limit_msecs)
  )

end FileMonitor
