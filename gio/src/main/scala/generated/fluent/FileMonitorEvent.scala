package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GFileMonitorEvent

/** Specifies what type of event a monitor event is.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FileMonitorEvent(val raw: GFileMonitorEvent):
  /** a file changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHANGED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGED)

  /** a hint that this was probably the last change in a set of changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHANGES_DONE_HINT
      extends FileMonitorEvent(
        GFileMonitorEvent.G_FILE_MONITOR_EVENT_CHANGES_DONE_HINT
      )

  /** a file was deleted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DELETED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_DELETED)

  /** a file was created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CREATED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_CREATED)

  /** a file attribute was changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ATTRIBUTE_CHANGED
      extends FileMonitorEvent(
        GFileMonitorEvent.G_FILE_MONITOR_EVENT_ATTRIBUTE_CHANGED
      )

  /** the file location will soon be unmounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PRE_UNMOUNT
      extends FileMonitorEvent(
        GFileMonitorEvent.G_FILE_MONITOR_EVENT_PRE_UNMOUNT
      )

  /** the file location was unmounted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNMOUNTED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_UNMOUNTED)

  /** the file was moved -- only sent if the (deprecated)
    * %G_FILE_MONITOR_SEND_MOVED flag is set
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOVED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED)

  /** the file was renamed within the current directory -- only sent if the
    * %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RENAMED
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_RENAMED)

  /** the file was moved into the monitored directory from another location --
    * only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MOVED_IN
      extends FileMonitorEvent(GFileMonitorEvent.G_FILE_MONITOR_EVENT_MOVED_IN)

  /** the file was moved out of the monitored directory to another location --
    * only sent if the %G_FILE_MONITOR_WATCH_MOVES flag is set. Since: 2.46
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
