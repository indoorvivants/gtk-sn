package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.DBusConnection
import sn.gnome.gio.fluent.DBusMessage
import sn.gnome.gio.fluent.UnixFDList
import sn.gnome.gio.internal.GDBusMethodInfo
import sn.gnome.gio.internal.GDBusMethodInvocation
import sn.gnome.gio.internal.GDBusPropertyInfo
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class DBusMethodInvocation(raw: Ptr[GDBusMethodInvocation])
    extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConnection(): DBusConnection = new DBusConnection(
    g_dbus_method_invocation_get_connection(this.raw.asInstanceOf).asInstanceOf
  )

  def getInterfaceName()(using Zone): String = fromCString(
    g_dbus_method_invocation_get_interface_name(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

  def getMessage(): DBusMessage = new DBusMessage(
    g_dbus_method_invocation_get_message(this.raw.asInstanceOf).asInstanceOf
  )

  def getMethodInfo(): Ptr[GDBusMethodInfo] =
    g_dbus_method_invocation_get_method_info(this.raw.asInstanceOf)

  def getMethodName()(using Zone): String = fromCString(
    g_dbus_method_invocation_get_method_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getObjectPath()(using Zone): String = fromCString(
    g_dbus_method_invocation_get_object_path(this.raw.asInstanceOf).asInstanceOf
  )

  def getParameters(): Ptr[GVariant] = g_dbus_method_invocation_get_parameters(
    this.raw.asInstanceOf
  )

  def getPropertyInfo(): Ptr[GDBusPropertyInfo] =
    g_dbus_method_invocation_get_property_info(this.raw.asInstanceOf)

  def getSender()(using Zone): String = fromCString(
    g_dbus_method_invocation_get_sender(this.raw.asInstanceOf).asInstanceOf
  )

  def getUserData(): Ptr[Byte] = g_dbus_method_invocation_get_user_data(
    this.raw.asInstanceOf
  ).value

  def returnDbusError(
      error_name: String | CString,
      error_message: String | CString
  )(using Zone): Unit = g_dbus_method_invocation_return_dbus_error(
    this.raw.asInstanceOf,
    __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(error_message).asInstanceOf[Ptr[gchar]]
  )

  inline def returnError(
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: Any*
  )(using Zone): Unit = g_dbus_method_invocation_return_error(
    this.raw.asInstanceOf,
    domain,
    gint(code),
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    args*
  )

  def returnErrorLiteral(domain: GQuark, code: Int, message: String | CString)(
      using Zone
  ): Unit = g_dbus_method_invocation_return_error_literal(
    this.raw.asInstanceOf,
    domain,
    gint(code),
    __sn_extract_string(message).asInstanceOf[Ptr[gchar]]
  )

  def returnErrorValist(
      domain: GQuark,
      code: Int,
      format: String | CString,
      var_args: CVarArgList
  )(using Zone): Unit = g_dbus_method_invocation_return_error_valist(
    this.raw.asInstanceOf,
    domain,
    gint(code),
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    var_args
  )

  def returnGerror(error: Ptr[GError]): Unit =
    g_dbus_method_invocation_return_gerror(this.raw.asInstanceOf, error)

  def returnValue(parameters: Ptr[GVariant]): Unit =
    g_dbus_method_invocation_return_value(this.raw.asInstanceOf, parameters)

  def returnValueWithUnixFdList(
      parameters: Ptr[GVariant],
      fd_list: UnixFDList
  ): Unit = g_dbus_method_invocation_return_value_with_unix_fd_list(
    this.raw.asInstanceOf,
    parameters,
    fd_list.getUnsafeRawPointer().asInstanceOf
  )

  def takeError(error: Ptr[GError]): Unit =
    g_dbus_method_invocation_take_error(this.raw.asInstanceOf, error)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusMethodInvocation
