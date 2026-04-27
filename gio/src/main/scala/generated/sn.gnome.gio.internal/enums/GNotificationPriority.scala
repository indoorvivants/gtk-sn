package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GNotificationPriority: _NOTIFICATION_PRIORITY_LOW: for notifications that do not require immediate attention - typically used for contextual background information, such as contact birthdays or local weather _NOTIFICATION_PRIORITY_NORMAL: the default priority, to be used for the majority of notifications (for example email messages, software updates, completed download/sync operations) _NOTIFICATION_PRIORITY_HIGH: for events that require more attention, usually because responses are time-sensitive (for example chat and SMS messages or alarms) _NOTIFICATION_PRIORITY_URGENT: for urgent notifications, or notifications that require a response in a short space of time (for example phone calls or emergency warnings)
*/
opaque type GNotificationPriority = CUnsignedInt
object GNotificationPriority extends _BindgenEnumCUnsignedInt[GNotificationPriority]:
  given _tag: Tag[GNotificationPriority] = Tag.UInt
  inline def define(inline a: Long): GNotificationPriority = a.toUInt
  val G_NOTIFICATION_PRIORITY_NORMAL = define(0)
  val G_NOTIFICATION_PRIORITY_LOW = define(1)
  val G_NOTIFICATION_PRIORITY_HIGH = define(2)
  val G_NOTIFICATION_PRIORITY_URGENT = define(3)
  def getName(value: GNotificationPriority): Option[String] =
    value match
      case `G_NOTIFICATION_PRIORITY_NORMAL` => Some("G_NOTIFICATION_PRIORITY_NORMAL")
      case `G_NOTIFICATION_PRIORITY_LOW` => Some("G_NOTIFICATION_PRIORITY_LOW")
      case `G_NOTIFICATION_PRIORITY_HIGH` => Some("G_NOTIFICATION_PRIORITY_HIGH")
      case `G_NOTIFICATION_PRIORITY_URGENT` => Some("G_NOTIFICATION_PRIORITY_URGENT")
      case _ => _root_.scala.None
  extension (a: GNotificationPriority)
    inline def &(b: GNotificationPriority): GNotificationPriority = a & b
    inline def |(b: GNotificationPriority): GNotificationPriority = a | b
    inline def is(b: GNotificationPriority): Boolean = (a & b) == b