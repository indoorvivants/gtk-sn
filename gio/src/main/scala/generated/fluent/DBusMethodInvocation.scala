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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Instances of the #GDBusMethodInvocation class are used when handling D-Bus
  * method calls. It provides a way to asynchronously return results and errors.
  *
  * The normal way to obtain a #GDBusMethodInvocation object is to receive it as
  * an argument to the handle_method_call() function in a #GDBusInterfaceVTable
  * that was passed to g_dbus_connection_register_object().
  */
class DBusMethodInvocation(raw: Ptr[GDBusMethodInvocation])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GDBusConnection the method was invoked on.
    */
  def getConnection(): DBusConnection /* None */ = new DBusConnection(
    g_dbus_method_invocation_get_connection(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the D-Bus interface the method was invoked on.
    *
    * If this method call is a property Get, Set or GetAll call that has been
    * redirected to the method call handler then
    * "org.freedesktop.DBus.Properties" will be returned. See
    * #GDBusInterfaceVTable for more information.
    */
  def getInterfaceName()(using Zone): String /* None */ = fromCString(
    g_dbus_method_invocation_get_interface_name(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the #GDBusMessage for the method invocation. This is useful if you
    * need to use low-level protocol features, such as UNIX file descriptor
    * passing, that cannot be properly expressed in the #GVariant API.
    *
    * See this [server][gdbus-server] and [client][gdbus-unix-fd-client] for an
    * example of how to use this low-level API to send and receive UNIX file
    * descriptors.
    */
  def getMessage(): DBusMessage /* None */ = new DBusMessage(
    g_dbus_method_invocation_get_message(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets information about the method call, if any.
    *
    * If this method invocation is a property Get, Set or GetAll call that has
    * been redirected to the method call handler then %NULL will be returned.
    * See g_dbus_method_invocation_get_property_info() and #GDBusInterfaceVTable
    * for more information.
    */
  def getMethodInfo(): Ptr[GDBusMethodInfo] /* None */ =
    g_dbus_method_invocation_get_method_info(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the name of the method that was invoked.
    */
  def getMethodName()(using Zone): String /* None */ = fromCString(
    g_dbus_method_invocation_get_method_name(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the object path the method was invoked on.
    */
  def getObjectPath()(using Zone): String /* None */ = fromCString(
    g_dbus_method_invocation_get_object_path(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the parameters of the method invocation. If there are no input
    * parameters then this will return a GVariant with 0 children rather than
    * NULL.
    */
  def getParameters(): Ptr[GVariant] /* None */ =
    g_dbus_method_invocation_get_parameters(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets information about the property that this method call is for, if any.
    *
    * This will only be set in the case of an invocation in response to a
    * property Get or Set call that has been directed to the method call handler
    * for an object on account of its property_get() or property_set() vtable
    * pointers being unset.
    *
    * See #GDBusInterfaceVTable for more information.
    *
    * If the call was GetAll, %NULL will be returned.
    */
  def getPropertyInfo(): Ptr[GDBusPropertyInfo] /* None */ =
    g_dbus_method_invocation_get_property_info(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the bus name that invoked the method.
    */
  def getSender()(using Zone): String /* None */ = fromCString(
    g_dbus_method_invocation_get_sender(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the @user_data #gpointer passed to
    * g_dbus_connection_register_object().
    */
  def getUserData(): Ptr[Byte] /* None */ =
    g_dbus_method_invocation_get_user_data(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes handling a D-Bus method call by returning an error.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    */
  def returnDbusError(
      error_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      error_message: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_dbus_method_invocation_return_dbus_error(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(error_message).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes handling a D-Bus method call by returning an error.
    *
    * See g_dbus_error_encode_gerror() for details about what error name will be
    * returned on the wire. In a nutshell, if the given error is registered
    * using g_dbus_error_register_error() the name given during registration is
    * used. Otherwise, a name of the form
    * `org.gtk.GDBus.UnmappedGError.Quark...` is used. This provides transparent
    * mapping of #GError between applications using GDBus.
    *
    * If you are writing an application intended to be portable, always register
    * errors with g_dbus_error_register_error() or use
    * g_dbus_method_invocation_return_dbus_error().
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * Since 2.48, if the method call requested for a reply not to be sent then
    * this call will free @invocation but otherwise do nothing (as per the
    * recommendations of the D-Bus specification).
    */
  inline def returnError(
      domain: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      code: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      format: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): Unit /* None */ = g_dbus_method_invocation_return_error(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    domain,
    gint(code),
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_method_invocation_return_error() but without printf()-style
    * formatting.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    */
  def returnErrorLiteral(
      domain: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      code: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      message: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_dbus_method_invocation_return_error_literal(
      this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
      domain,
      gint(code),
      __sn_extract_string(message).asInstanceOf[Ptr[gchar]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_method_invocation_return_error() but intended for language
    * bindings.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    */
  def returnErrorValist(
      domain: GQuark /* Some(_root_.sn.gnome.glib.internal.GQuark) */,
      code: Int /* Some(_root_.sn.gnome.glib.internal.gint) */,
      format: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ = g_dbus_method_invocation_return_error_valist(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    domain,
    gint(code),
    __sn_extract_string(format).asInstanceOf[Ptr[gchar]],
    var_args
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_method_invocation_return_error() but takes a #GError instead
    * of the error domain, error code and message.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    */
  def returnGerror(
      error: Ptr[GError] /* Some(Ptr[_root_.sn.gnome.glib.internal.GError]) */
  ): Unit /* None */ = g_dbus_method_invocation_return_gerror(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    error
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Finishes handling a D-Bus method call by returning @parameters.
    *  If the @parameters GVariant is floating, it is consumed.
    *
    *  It is an error if @parameters is not of the right format: it must be a tuple
    *  containing the out-parameters of the D-Bus method. Even if the method has a
    *  single out-parameter, it must be contained in a tuple. If the method has no
    *  out-parameters, @parameters may be %NULL or an empty tuple.
    *
    *  |[<!-- language="C" -->
    *  GDBusMethodInvocation *invocation = some_invocation;
    *  g_autofree gchar *result_string = NULL;
    *  g_autoptr (GError) error = NULL;
    *
    *  result_string = calculate_result (&error);
    *
    *  if (error != NULL)
    *    g_dbus_method_invocation_return_gerror (invocation, error);
    *  else
    *    g_dbus_method_invocation_return_value (invocation,
    *                                           g_variant_new ("(s)", result_string));
    *
    *  // Do not free @invocation here; returning a value does that
    *  ]|
    *
    *  This method will take ownership of @invocation. See
    *  #GDBusInterfaceVTable for more information about the ownership of
    *  @invocation.
    *
    *  Since 2.48, if the method call requested for a reply not to be sent
    *  then this call will sink @parameters and free @invocation, but
    *  otherwise do nothing (as per the recommendations of the D-Bus
    *  specification).
    */
  def returnValue(
      parameters: Option[
        Ptr[GVariant] /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
      ]
  ): Unit /* None */ = g_dbus_method_invocation_return_value(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    parameters
      .map[Ptr[_root_.sn.gnome.glib.internal.GVariant]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GVariant]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_method_invocation_return_value() but also takes a
    * #GUnixFDList.
    *
    * This method is only available on UNIX.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    */
  def returnValueWithUnixFdList(
      parameters: Option[
        Ptr[GVariant] /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
      ],
      fd_list: Option[UnixFDList /* Some(Ptr[GUnixFDList]) */ ]
  ): Unit /* None */ = g_dbus_method_invocation_return_value_with_unix_fd_list(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    parameters
      .map[Ptr[_root_.sn.gnome.glib.internal.GVariant]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GVariant]]
      ),
    fd_list
      .map[Ptr[GUnixFDList]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GUnixFDList]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_method_invocation_return_gerror() but takes ownership of @error
    * so the caller does not need to free it.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    */
  def takeError(
      error: Ptr[GError] /* Some(Ptr[_root_.sn.gnome.glib.internal.GError]) */
  ): Unit /* None */ = g_dbus_method_invocation_take_error(
    this.raw.asInstanceOf[Ptr[GDBusMethodInvocation]],
    error
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusMethodInvocation
