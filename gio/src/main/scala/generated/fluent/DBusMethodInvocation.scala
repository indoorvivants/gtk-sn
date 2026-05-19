package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{DBusConnection, DBusMessage}
import sn.gnome.gio.internal.GDBusMethodInvocation
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** Instances of the #GDBusMethodInvocation class are used when handling D-Bus
  * method calls. It provides a way to asynchronously return results and errors.
  *
  * The normal way to obtain a #GDBusMethodInvocation object is to receive it as
  * an argument to the handle_method_call() function in a #GDBusInterfaceVTable
  * that was passed to g_dbus_connection_register_object().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusMethodInvocation private[gnome] (raw: Ptr[GDBusMethodInvocation])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the #GDBusConnection the method was invoked on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConnection()(using Runtime): sn.gnome.gio.DBusConnection /* None */ =
    sn.gnome.gio.DBusConnection.applyUnsafe(
      g_dbus_method_invocation_get_connection(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
      ).asInstanceOf
    )
  end getConnection

  /** Gets the name of the D-Bus interface the method was invoked on.
    *
    * If this method call is a property Get, Set or GetAll call that has been
    * redirected to the method call handler then
    * "org.freedesktop.DBus.Properties" will be returned. See
    * #GDBusInterfaceVTable for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterfaceName()(using Zone): String /* None */ =
    fromCString(
      g_dbus_method_invocation_get_interface_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
      ).asInstanceOf
    )
  end getInterfaceName

  /** Gets the #GDBusMessage for the method invocation. This is useful if you
    * need to use low-level protocol features, such as UNIX file descriptor
    * passing, that cannot be properly expressed in the #GVariant API.
    *
    * See this [server][gdbus-server] and [client][gdbus-unix-fd-client] for an
    * example of how to use this low-level API to send and receive UNIX file
    * descriptors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessage()(using Runtime): sn.gnome.gio.DBusMessage /* None */ =
    sn.gnome.gio.DBusMessage.applyUnsafe(
      g_dbus_method_invocation_get_message(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
      ).asInstanceOf
    )
  end getMessage

  /** Gets information about the method call, if any.
    *
    * If this method invocation is a property Get, Set or GetAll call that has
    * been redirected to the method call handler then %NULL will be returned.
    * See g_dbus_method_invocation_get_property_info() and #GDBusInterfaceVTable
    * for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_method_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusMethodInfo), @type -> DataRecord(const GDBusMethodInfo*)))"
  )
  private def getMethodInfo__ = ???

  /** Gets the name of the method that was invoked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMethodName()(using Zone): String /* None */ =
    fromCString(
      g_dbus_method_invocation_get_method_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
      ).asInstanceOf
    )
  end getMethodName

  /** Gets the object path the method was invoked on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getObjectPath()(using Zone): String /* None */ =
    fromCString(
      g_dbus_method_invocation_get_object_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
      ).asInstanceOf
    )
  end getObjectPath

  /** Gets the parameters of the method invocation. If there are no input
    * parameters then this will return a GVariant with 0 children rather than
    * NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_parameters/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getParameters__ = ???

  /** Gets information about the property that this method call is for, if any.
    *
    * This will only be set in the case of an invocation in response to a
    * property Get or Set call that has been directed to the method call handler
    * for an object on account of its property_get() or property_set() vtable
    * pointers being unset.
    *
    * See #GDBusInterfaceVTable for more information.
    *
    * If the call was GetAll, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_property_info/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(DBusPropertyInfo), @type -> DataRecord(const GDBusPropertyInfo*)))"
  )
  private def getPropertyInfo__ = ???

  /** Gets the bus name that invoked the method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSender()(using Zone): String /* None */ =
    fromCString(
      g_dbus_method_invocation_get_sender(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
      ).asInstanceOf
    )
  end getSender

  /** Gets the @user_data #gpointer passed to
    * g_dbus_connection_register_object().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserData(): Ptr[Byte] /* None */ =
    g_dbus_method_invocation_get_user_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]]
    ).value
  end getUserData

  /** Finishes handling a D-Bus method call by returning an error.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def returnDbusError(
      error_name: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      error_message: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_dbus_method_invocation_return_dbus_error(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusMethodInvocation]],
      toCString(error_name).asInstanceOf[Ptr[gchar]],
      toCString(error_message).asInstanceOf[Ptr[gchar]]
    )
  end returnDbusError

  /** Finishes handling a D-Bus method call by returning an error.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_error/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def returnError__ = ???

  /** Like g_dbus_method_invocation_return_error() but without printf()-style
    * formatting.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_error_literal/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def returnErrorLiteral__ = ???

  /** Like g_dbus_method_invocation_return_error() but intended for language
    * bindings.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_error_valist/<method parameters>/domain]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def returnErrorValist__ = ???

  /** Like g_dbus_method_invocation_return_error() but takes a #GError instead
    * of the error domain, error code and message.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_gerror/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  private def returnGerror__ = ???

  /**  Finishes handling a D-Bus method call by returning @parameters.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_value/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def returnValue__ = ???

  /** Like g_dbus_method_invocation_return_value() but also takes a
    * #GUnixFDList.
    *
    * This method is only available on UNIX.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method return_value_with_unix_fd_list/<method parameters>/parameters]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def returnValueWithUnixFdList__ = ???

  /** Like g_dbus_method_invocation_return_gerror() but takes ownership of @error
    * so the caller does not need to free it.
    *
    * This method will take ownership of @invocation. See #GDBusInterfaceVTable
    * for more information about the ownership of
    * @invocation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method take_error/<method parameters>/error]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))"
  )
  private def takeError__ = ???

end DBusMethodInvocation

object DBusMethodInvocation:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GDBusMethodInvocation])(using Runtime) =
    summon[Runtime].getOrCreate[DBusMethodInvocation](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DBusMethodInvocation(ptr)
    )

end DBusMethodInvocation
