package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.DBusMessage
import sn.gnome.gio.fluent.UnixFDList
import sn.gnome.gio.internal.GDBusMessage
import sn.gnome.gio.internal.GDBusMessageByteOrder
import sn.gnome.gio.internal.GDBusMessageFlags
import sn.gnome.gio.internal.GDBusMessageHeaderField
import sn.gnome.gio.internal.GDBusMessageType
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GVariant
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guchar
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object

class DBusMessage(raw: Ptr[GDBusMessage]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def copy(): GResult[DBusMessage] = GResult.wrap(__errorPtr =>
    new DBusMessage(
      g_dbus_message_copy(this.raw.asInstanceOf, __errorPtr).asInstanceOf
    )
  )

  def getArg0()(using Zone): String = fromCString(
    g_dbus_message_get_arg0(this.raw.asInstanceOf).asInstanceOf
  )

  def getBody(): Ptr[GVariant] = g_dbus_message_get_body(this.raw.asInstanceOf)

  def getByteOrder(): GDBusMessageByteOrder = g_dbus_message_get_byte_order(
    this.raw.asInstanceOf
  )

  def getDestination()(using Zone): String = fromCString(
    g_dbus_message_get_destination(this.raw.asInstanceOf).asInstanceOf
  )

  def getErrorName()(using Zone): String = fromCString(
    g_dbus_message_get_error_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getFlags(): GDBusMessageFlags = g_dbus_message_get_flags(
    this.raw.asInstanceOf
  )

  def getHeader(header_field: GDBusMessageHeaderField): Ptr[GVariant] =
    g_dbus_message_get_header(this.raw.asInstanceOf, header_field)

  def getHeaderFields(): Ptr[UByte] = g_dbus_message_get_header_fields(
    this.raw.asInstanceOf
  ).asInstanceOf

  def getInterface()(using Zone): String = fromCString(
    g_dbus_message_get_interface(this.raw.asInstanceOf).asInstanceOf
  )

  def getLocked(): Boolean =
    g_dbus_message_get_locked(this.raw.asInstanceOf).value.!=(0)

  def getMember()(using Zone): String = fromCString(
    g_dbus_message_get_member(this.raw.asInstanceOf).asInstanceOf
  )

  def getMessageType(): GDBusMessageType = g_dbus_message_get_message_type(
    this.raw.asInstanceOf
  )

  def getNumUnixFds(): UInt = g_dbus_message_get_num_unix_fds(
    this.raw.asInstanceOf
  ).value

  def getPath()(using Zone): String = fromCString(
    g_dbus_message_get_path(this.raw.asInstanceOf).asInstanceOf
  )

  def getReplySerial(): UInt = g_dbus_message_get_reply_serial(
    this.raw.asInstanceOf
  ).value

  def getSender()(using Zone): String = fromCString(
    g_dbus_message_get_sender(this.raw.asInstanceOf).asInstanceOf
  )

  def getSerial(): UInt = g_dbus_message_get_serial(this.raw.asInstanceOf).value

  def getSignature()(using Zone): String = fromCString(
    g_dbus_message_get_signature(this.raw.asInstanceOf).asInstanceOf
  )

  def getUnixFdList(): UnixFDList = new UnixFDList(
    g_dbus_message_get_unix_fd_list(this.raw.asInstanceOf).asInstanceOf
  )

  def lock(): Unit = g_dbus_message_lock(this.raw.asInstanceOf)

  inline def newMethodError(
      error_name: String | CString,
      error_message_format: String | CString,
      args: Any*
  )(using Zone): DBusMessage = new DBusMessage(
    g_dbus_message_new_method_error(
      this.raw.asInstanceOf,
      __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(error_message_format).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  def newMethodErrorLiteral(
      error_name: String | CString,
      error_message: String | CString
  )(using Zone): DBusMessage = new DBusMessage(
    g_dbus_message_new_method_error_literal(
      this.raw.asInstanceOf,
      __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(error_message).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  def newMethodErrorValist(
      error_name: String | CString,
      error_message_format: String | CString,
      var_args: CVarArgList
  )(using Zone): DBusMessage = new DBusMessage(
    g_dbus_message_new_method_error_valist(
      this.raw.asInstanceOf,
      __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(error_message_format).asInstanceOf[Ptr[gchar]],
      var_args
    ).asInstanceOf
  )

  def newMethodReply(): DBusMessage = new DBusMessage(
    g_dbus_message_new_method_reply(this.raw.asInstanceOf).asInstanceOf
  )

  def print(indent: UInt)(using Zone): String = fromCString(
    g_dbus_message_print(this.raw.asInstanceOf, guint(indent)).asInstanceOf
  )

  def setBody(body: Ptr[GVariant]): Unit =
    g_dbus_message_set_body(this.raw.asInstanceOf, body)

  def setByteOrder(byte_order: GDBusMessageByteOrder): Unit =
    g_dbus_message_set_byte_order(this.raw.asInstanceOf, byte_order)

  def setDestination(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_destination(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setErrorName(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_error_name(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setFlags(flags: GDBusMessageFlags): Unit =
    g_dbus_message_set_flags(this.raw.asInstanceOf, flags)

  def setHeader(
      header_field: GDBusMessageHeaderField,
      value: Ptr[GVariant]
  ): Unit =
    g_dbus_message_set_header(this.raw.asInstanceOf, header_field, value)

  def setInterface(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_interface(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setMember(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_member(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setMessageType(`type`: GDBusMessageType): Unit =
    g_dbus_message_set_message_type(this.raw.asInstanceOf, `type`)

  def setNumUnixFds(value: UInt): Unit =
    g_dbus_message_set_num_unix_fds(this.raw.asInstanceOf, guint32(value))

  def setPath(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_path(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setReplySerial(value: UInt): Unit =
    g_dbus_message_set_reply_serial(this.raw.asInstanceOf, guint32(value))

  def setSender(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_sender(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setSerial(serial: UInt): Unit =
    g_dbus_message_set_serial(this.raw.asInstanceOf, guint32(serial))

  def setSignature(value: String | CString)(using Zone): Unit =
    g_dbus_message_set_signature(
      this.raw.asInstanceOf,
      __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
    )

  def setUnixFdList(fd_list: UnixFDList): Unit =
    g_dbus_message_set_unix_fd_list(
      this.raw.asInstanceOf,
      fd_list.getUnsafeRawPointer().asInstanceOf
    )

  // Method to_blob contains an OUT parameter, which is not supported yet

  def toGerror(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_dbus_message_to_gerror(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusMessage

object DBusMessage:
  def apply(): DBusMessage = new DBusMessage(g_dbus_message_new().asInstanceOf)
  def methodCall(
      name: String | CString,
      path: String | CString,
      `interface_`: String | CString,
      method: String | CString
  )(using Zone): DBusMessage = new DBusMessage(
    g_dbus_message_new_method_call(
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(`interface_`).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(method).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )
  def signal(
      path: String | CString,
      `interface_`: String | CString,
      signal: String | CString
  )(using Zone): DBusMessage = new DBusMessage(
    g_dbus_message_new_signal(
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(`interface_`).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(signal).asInstanceOf[Ptr[gchar]]
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
end DBusMessage
