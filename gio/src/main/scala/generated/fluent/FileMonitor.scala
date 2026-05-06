package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{File, FileMonitorEvent}
import sn.gnome.gio.internal.GFileMonitor
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** Monitors a file or directory for changes.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileMonitor(raw: Ptr[GFileMonitor]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Cancels a file monitor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cancel(): Boolean /* None */ =
    g_file_monitor_cancel(this.raw.asInstanceOf[Ptr[GFileMonitor]]).value.!=(0)

  /** Emits the #GFileMonitor::changed signal if a change has taken place.
    * Should be called from file monitor implementations only.
    *
    * Implementations are responsible to call this method from the
    * [thread-default main context][g-main-context-push-thread-default] of the
    * thread that the monitor was created in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def emitEvent(
      child: File /* Some(Ptr[GFile]) */,
      other_file: File /* Some(Ptr[GFile]) */,
      event_type: FileMonitorEvent /* Some(GFileMonitorEvent) */
  ): Unit /* None */ = g_file_monitor_emit_event(
    this.raw.asInstanceOf[Ptr[GFileMonitor]],
    child.getUnsafeRawPointer().asInstanceOf,
    other_file.getUnsafeRawPointer().asInstanceOf,
    event_type.raw
  )

  /** Returns whether the monitor is canceled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCancelled(): Boolean /* None */ = g_file_monitor_is_cancelled(
    this.raw.asInstanceOf[Ptr[GFileMonitor]]
  ).value.!=(0)

  /** Sets the rate limit to which the @monitor will report consecutive change
    * events to the same file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRateLimit(
      limit_msecs: Int /* Some(_root_.sn.gnome.glib.internal.gint) */
  ): Unit /* None */ = g_file_monitor_set_rate_limit(
    this.raw.asInstanceOf[Ptr[GFileMonitor]],
    gint(limit_msecs)
  )

  /** Emitted when @file has been changed.
    *
    * If using %G_FILE_MONITOR_WATCH_MOVES on a directory monitor, and the
    * information is available (and if supported by the backend),
    * @event_type
    *   may be %G_FILE_MONITOR_EVENT_RENAMED, %G_FILE_MONITOR_EVENT_MOVED_IN or
    *   %G_FILE_MONITOR_EVENT_MOVED_OUT.
    *
    * In all cases @file will be a child of the monitored directory. For
    * renames, @file will be the old name and @other_file is the new name. For
    * "moved in" events, @file is the name of the file that appeared and @other_file
    * is the old name that it was moved from (in another directory). For "moved
    * out" events, @file is the name of the file that used to be in this
    * directory and @other_file is the name of the file at its new location.
    *
    * It makes sense to treat %G_FILE_MONITOR_EVENT_MOVED_IN as equivalent to
    * %G_FILE_MONITOR_EVENT_CREATED and %G_FILE_MONITOR_EVENT_MOVED_OUT as
    * equivalent to %G_FILE_MONITOR_EVENT_DELETED, with extra information.
    * %G_FILE_MONITOR_EVENT_RENAMED is equivalent to a delete/create pair. This
    * is exactly how the events will be reported in the case that the
    * %G_FILE_MONITOR_WATCH_MOVES flag is not in use.
    *
    * If using the deprecated flag %G_FILE_MONITOR_SEND_MOVED flag and @event_type
    * is %G_FILE_MONITOR_EVENT_MOVED, @file will be set to a #GFile containing
    * the old path, and @other_file will be set to a #GFile containing the new
    * path.
    *
    * In all the other cases, @other_file will be set to #NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(File)))"
  )
  private def onChanged = ???

end FileMonitor
