package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.internal.GNotification
import sn.gnome.gio.internal.GNotificationPriority
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object

class Notification(raw: Ptr[GNotification]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addButton(label: String | CString, detailed_action: String | CString)(
      using Zone
  ): Unit = g_notification_add_button(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
  )

  inline def addButtonWithTarget(
      label: String | CString,
      action: String | CString,
      target_format: String | CString,
      args: Any*
  )(using Zone): Unit = g_notification_add_button_with_target(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(target_format).asInstanceOf[Ptr[gchar]],
    args*
  )

  def addButtonWithTargetValue(
      label: String | CString,
      action: String | CString,
      target: Ptr[GVariant]
  )(using Zone): Unit = g_notification_add_button_with_target_value(
    this.raw.asInstanceOf,
    __sn_extract_string(label).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    target
  )

  def setBody(body: String | CString)(using Zone): Unit =
    g_notification_set_body(
      this.raw.asInstanceOf,
      __sn_extract_string(body).asInstanceOf[Ptr[gchar]]
    )

  def setCategory(category: String | CString)(using Zone): Unit =
    g_notification_set_category(
      this.raw.asInstanceOf,
      __sn_extract_string(category).asInstanceOf[Ptr[gchar]]
    )

  def setDefaultAction(detailed_action: String | CString)(using Zone): Unit =
    g_notification_set_default_action(
      this.raw.asInstanceOf,
      __sn_extract_string(detailed_action).asInstanceOf[Ptr[gchar]]
    )

  inline def setDefaultActionAndTarget(
      action: String | CString,
      target_format: String | CString,
      args: Any*
  )(using Zone): Unit = g_notification_set_default_action_and_target(
    this.raw.asInstanceOf,
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(target_format).asInstanceOf[Ptr[gchar]],
    args*
  )

  def setDefaultActionAndTargetValue(
      action: String | CString,
      target: Ptr[GVariant]
  )(using Zone): Unit = g_notification_set_default_action_and_target_value(
    this.raw.asInstanceOf,
    __sn_extract_string(action).asInstanceOf[Ptr[gchar]],
    target
  )

  def setIcon(icon: Icon): Unit = g_notification_set_icon(
    this.raw.asInstanceOf,
    icon.getUnsafeRawPointer().asInstanceOf
  )

  def setPriority(priority: GNotificationPriority): Unit =
    g_notification_set_priority(this.raw.asInstanceOf, priority)

  def setTitle(title: String | CString)(using Zone): Unit =
    g_notification_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title).asInstanceOf[Ptr[gchar]]
    )

  def setUrgent(urgent: Boolean): Unit = g_notification_set_urgent(
    this.raw.asInstanceOf,
    gboolean(gint((if urgent == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Notification

object Notification:
  def apply(title: String | CString)(using Zone): Notification =
    new Notification(
      g_notification_new(
        __sn_extract_string(title).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Notification
