package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleAnnouncementPriority: _ANNOUNCEMENT_PRIORITY_LOW: The announcement is low priority, and might be read only on the user's request. _ANNOUNCEMENT_PRIORITY_MEDIUM: The announcement is of medium priority, and is usually spoken at the next opportunity, such as at the end of speaking the current sentence or when the user pauses typing. _ANNOUNCEMENT_PRIORITY_HIGH: The announcement is of high priority, and is usually spoken immediately. Because an interruption might disorient users or cause them to not complete their current task, authors SHOULD NOT use high priority announcements unless the interruption is imperative. An example would be a notification about a critical battery power level.
*/
opaque type GtkAccessibleAnnouncementPriority = CUnsignedInt
object GtkAccessibleAnnouncementPriority extends _BindgenEnumCUnsignedInt[GtkAccessibleAnnouncementPriority]:
  given _tag: Tag[GtkAccessibleAnnouncementPriority] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleAnnouncementPriority = a.toUInt
  val GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW = define(0)
  val GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM = define(1)
  val GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH = define(2)
  def getName(value: GtkAccessibleAnnouncementPriority): Option[String] =
    value match
      case `GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW` => Some("GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_LOW")
      case `GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM` => Some("GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_MEDIUM")
      case `GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH` => Some("GTK_ACCESSIBLE_ANNOUNCEMENT_PRIORITY_HIGH")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleAnnouncementPriority)
    inline def &(b: GtkAccessibleAnnouncementPriority): GtkAccessibleAnnouncementPriority = a & b
    inline def |(b: GtkAccessibleAnnouncementPriority): GtkAccessibleAnnouncementPriority = a | b
    inline def is(b: GtkAccessibleAnnouncementPriority): Boolean = (a & b) == b