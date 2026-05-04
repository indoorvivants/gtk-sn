package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GNotificationPriority

/** Priority levels for #GNotifications.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum NotificationPriority(val raw: GNotificationPriority):
  /** the default priority, to be used for the majority of notifications (for
    * example email messages, software updates, completed download/sync
    * operations)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORMAL
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_NORMAL
      )

  /** for notifications that do not require immediate attention - typically used
    * for contextual background information, such as contact birthdays or local
    * weather
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LOW
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_LOW
      )

  /** for events that require more attention, usually because responses are
    * time-sensitive (for example chat and SMS messages or alarms)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIGH
      extends NotificationPriority(
        GNotificationPriority.G_NOTIFICATION_PRIORITY_HIGH
      )

  /** for urgent notifications, or notifications that require a response in a
    * short space of time (for example phone calls or emergency warnings)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
