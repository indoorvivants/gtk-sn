package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GFileMonitorEvent

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies what type of event a monitor event is.
  */
enum FileMonitorEvent(val raw: GFileMonitorEvent):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a file changed.
    */
  case CHANGED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a hint that this was probably the last change in a set of changes.
    */
  case CHANGES_DONE_HINT
      extends FileMonitorEvent(
        GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a file was deleted.
    */
  case DELETED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_DELETED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a file was created.
    */
  case CREATED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CREATED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a file attribute was changed.
    */
  case ATTRIBUTE_CHANGED
      extends FileMonitorEvent(
        GFileMonitorEvent.G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file location will soon be unmounted.
    */
  case PRE_UNMOUNT
      extends FileMonitorEvent(
        GFileMonitorEvent.G_FILE_MONITOR_EVENT_PRE_UNMOUNT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file location was unmounted.
    */
  case UNMOUNTED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_UNMOUNTED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file was moved -- only sent if the (deprecated)
    * %G_FILE_MONITOR_SEND_MOVED flag is set
    */
  case MOVED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file was renamed within the current directory -- only sent if the
    * %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46.
    */
  case RENAMED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_RENAMED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file was moved into the monitored directory from another location --
    * only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46.
    */
  case MOVED_IN
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_IN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the file was moved out of the monitored directory to another location --
    * only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46
    */
  case MOVED_OUT
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_OUT)
end FileMonitorEvent

object FileMonitorEvent:
  def fromRaw(raw: GFileMonitorEvent): FileMonitorEvent =
    raw match
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGED =>
        FileMonitorEvent.CHANGED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT =>
        FileMonitorEvent.CHANGES_DONE_HINT
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_DELETED =>
        FileMonitorEvent.DELETED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_CREATED =>
        FileMonitorEvent.CREATED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED =>
        FileMonitorEvent.ATTRIBUTE_CHANGED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_PRE_UNMOUNT =>
        FileMonitorEvent.PRE_UNMOUNT
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_UNMOUNTED =>
        FileMonitorEvent.UNMOUNTED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED =>
        FileMonitorEvent.MOVED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_RENAMED =>
        FileMonitorEvent.RENAMED
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_IN =>
        FileMonitorEvent.MOVED_IN
      case GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_OUT =>
        FileMonitorEvent.MOVED_OUT
  end fromRaw
end FileMonitorEvent
