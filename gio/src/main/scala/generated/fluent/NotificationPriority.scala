package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GNotificationPriority

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Priority levels for #GNotifications.
  */
enum NotificationPriority(val raw: GNotificationPriority):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the default priority, to be used for the majority of notifications (for
    * example email messages, software updates, completed download/sync
    * operations)
    */
  case NORMAL
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_NORMAL
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * for notifications that do not require immediate attention - typically used
    * for contextual background information, such as contact birthdays or local
    * weather
    */
  case LOW
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_LOW
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * for events that require more attention, usually because responses are
    * time-sensitive (for example chat and SMS messages or alarms)
    */
  case HIGH
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_HIGH
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * for urgent notifications, or notifications that require a response in a
    * short space of time (for example phone calls or emergency warnings)
    */
  case URGENT
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_URGENT
      )
end NotificationPriority

object NotificationPriority:
  def fromRaw(raw: GNotificationPriority): NotificationPriority =
    raw match
      case GNotificationPriority.G_NOTIFICATION_PRIORITY_NORMAL =>
        NotificationPriority.NORMAL
      case GNotificationPriority.G_NOTIFICATION_PRIORITY_LOW =>
        NotificationPriority.LOW
      case GNotificationPriority.G_NOTIFICATION_PRIORITY_HIGH =>
        NotificationPriority.HIGH
      case GNotificationPriority.G_NOTIFICATION_PRIORITY_URGENT =>
        NotificationPriority.URGENT
  end fromRaw
end NotificationPriority
