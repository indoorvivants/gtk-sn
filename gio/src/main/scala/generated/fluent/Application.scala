package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ActionGroup
import sn.gnome.gio.fluent.ActionMap
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.Notification
import sn.gnome.gio.internal.GApplication
import sn.gnome.gio.internal.GApplicationFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GOptionArg
import sn.gnome.glib.internal.GOptionFlags
import sn.gnome.glib.internal.GOptionGroup
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

class Application(raw: Ptr[GApplication])
    extends Object(raw.asInstanceOf),
      ActionGroup,
      ActionMap:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def activate(): Unit = g_application_activate(this.raw.asInstanceOf)

  def addMainOption(
      long_name: String | CString,
      short_name: Byte,
      flags: GOptionFlags,
      arg: GOptionArg,
      description: String | CString,
      arg_description: String | CString
  )(using Zone): Unit = g_application_add_main_option(
    this.raw.asInstanceOf,
    __sn_extract_string(long_name),
    gchar(short_name).asInstanceOf,
    flags,
    arg,
    __sn_extract_string(description),
    __sn_extract_string(arg_description)
  )

  // Method add_main_option_entries contains an array parameter, which is not supported yet

  def addOptionGroup(group: Ptr[GOptionGroup]): Unit =
    g_application_add_option_group(this.raw.asInstanceOf, group)

  def bindBusyProperty(`object`: Object, property: String | CString)(using
      Zone
  ): Unit = g_application_bind_busy_property(
    this.raw.asInstanceOf,
    gpointer(
      `object`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]]
  )

  def getApplicationId()(using Zone): String = fromCString(
    g_application_get_application_id(this.raw.asInstanceOf).asInstanceOf
  )

  def getDbusConnection(): DBusConnection = new DBusConnection(
    g_application_get_dbus_connection(this.raw.asInstanceOf).asInstanceOf
  )

  def getDbusObjectPath()(using Zone): String = fromCString(
    g_application_get_dbus_object_path(this.raw.asInstanceOf).asInstanceOf
  )

  def getFlags(): GApplicationFlags = g_application_get_flags(
    this.raw.asInstanceOf
  )

  def getInactivityTimeout(): UInt = g_application_get_inactivity_timeout(
    this.raw.asInstanceOf
  ).value

  def getIsBusy(): Boolean =
    g_application_get_is_busy(this.raw.asInstanceOf).value.!=(0)

  def getIsRegistered(): Boolean =
    g_application_get_is_registered(this.raw.asInstanceOf).value.!=(0)

  def getIsRemote(): Boolean =
    g_application_get_is_remote(this.raw.asInstanceOf).value.!=(0)

  def getResourceBasePath()(using Zone): String = fromCString(
    g_application_get_resource_base_path(this.raw.asInstanceOf).asInstanceOf
  )

  def hold(): Unit = g_application_hold(this.raw.asInstanceOf)

  def markBusy(): Unit = g_application_mark_busy(this.raw.asInstanceOf)

  // Method open contains an array parameter, which is not supported yet

  def quit(): Unit = g_application_quit(this.raw.asInstanceOf)

  def register(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_application_register(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def release(): Unit = g_application_release(this.raw.asInstanceOf)

  // Method run contains an array parameter, which is not supported yet

  def sendNotification(id: String | CString, notification: Notification)(using
      Zone
  ): Unit = g_application_send_notification(
    this.raw.asInstanceOf,
    __sn_extract_string(id).asInstanceOf[Ptr[gchar]],
    notification.getUnsafeRawPointer().asInstanceOf
  )

  def setActionGroup(action_group: ActionGroup): Unit =
    g_application_set_action_group(
      this.raw.asInstanceOf,
      action_group.getUnsafeRawPointer().asInstanceOf
    )

  def setApplicationId(application_id: String | CString)(using Zone): Unit =
    g_application_set_application_id(
      this.raw.asInstanceOf,
      __sn_extract_string(application_id).asInstanceOf[Ptr[gchar]]
    )

  def setDefault(): Unit = g_application_set_default(this.raw.asInstanceOf)

  def setFlags(flags: GApplicationFlags): Unit =
    g_application_set_flags(this.raw.asInstanceOf, flags)

  def setInactivityTimeout(inactivity_timeout: UInt): Unit =
    g_application_set_inactivity_timeout(
      this.raw.asInstanceOf,
      guint(inactivity_timeout)
    )

  def setOptionContextDescription(
      description: String | CString
  )(using Zone): Unit = g_application_set_option_context_description(
    this.raw.asInstanceOf,
    __sn_extract_string(description).asInstanceOf[Ptr[gchar]]
  )

  def setOptionContextParameterString(
      parameter_string: String | CString
  )(using Zone): Unit = g_application_set_option_context_parameter_string(
    this.raw.asInstanceOf,
    __sn_extract_string(parameter_string).asInstanceOf[Ptr[gchar]]
  )

  def setOptionContextSummary(summary: String | CString)(using Zone): Unit =
    g_application_set_option_context_summary(
      this.raw.asInstanceOf,
      __sn_extract_string(summary).asInstanceOf[Ptr[gchar]]
    )

  def setResourceBasePath(resource_path: String | CString)(using Zone): Unit =
    g_application_set_resource_base_path(
      this.raw.asInstanceOf,
      __sn_extract_string(resource_path).asInstanceOf[Ptr[gchar]]
    )

  def unbindBusyProperty(`object`: Object, property: String | CString)(using
      Zone
  ): Unit = g_application_unbind_busy_property(
    this.raw.asInstanceOf,
    gpointer(
      `object`.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
    ),
    __sn_extract_string(property).asInstanceOf[Ptr[gchar]]
  )

  def unmarkBusy(): Unit = g_application_unmark_busy(this.raw.asInstanceOf)

  def withdrawNotification(id: String | CString)(using Zone): Unit =
    g_application_withdraw_notification(
      this.raw.asInstanceOf,
      __sn_extract_string(id).asInstanceOf[Ptr[gchar]]
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Application

object Application:
  def apply(application_id: String | CString, flags: GApplicationFlags)(using
      Zone
  ): Application = new Application(
    g_application_new(
      __sn_extract_string(application_id).asInstanceOf[Ptr[gchar]],
      flags
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
end Application
