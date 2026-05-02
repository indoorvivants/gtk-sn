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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A type for representing D-Bus messages that can be sent or received on a
  * #GDBusConnection.
  */
class DBusMessage(raw: Ptr[GDBusMessage]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Copies @message. The copy is a deep copy and the returned #GDBusMessage is
    * completely identical except that it is guaranteed to not be locked.
    *
    * This operation can fail if e.g. @message contains file descriptors and the
    * per-process or system-wide open files limit is reached.
    */
  def copy(): GResult[DBusMessage /* None */ ] = GResult.wrap(__errorPtr =>
    new DBusMessage(
      g_dbus_message_copy(
        this.raw.asInstanceOf[Ptr[GDBusMessage]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience to get the first item in the body of @message.
    */
  def getArg0()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_arg0(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the body of a message.
    */
  def getBody(): Ptr[GVariant] /* None */ = g_dbus_message_get_body(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the byte order of @message.
    */
  def getByteOrder(): GDBusMessageByteOrder /* None */ =
    g_dbus_message_get_byte_order(this.raw.asInstanceOf[Ptr[GDBusMessage]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header
    * field.
    */
  def getDestination()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_destination(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header
    * field.
    */
  def getErrorName()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_error_name(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the flags for @message.
    */
  def getFlags(): GDBusMessageFlags /* None */ = g_dbus_message_get_flags(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a header field on @message.
    *
    * The caller is responsible for checking the type of the returned #GVariant
    * matches what is expected.
    */
  def getHeader(
      header_field: GDBusMessageHeaderField /* Some(GDBusMessageHeaderField) */
  ): Ptr[GVariant] /* None */ = g_dbus_message_get_header(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    header_field
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets an array of all header fields on @message that are set.
    */
  def getHeaderFields(): Ptr[UByte] /* None */ =
    g_dbus_message_get_header_fields(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header
    * field.
    */
  def getInterface()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_interface(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks whether @message is locked. To monitor changes to this value,
    * conncet to the #GObject::notify signal to listen for changes on the
    * #GDBusMessage:locked property.
    */
  def getLocked(): Boolean /* None */ = g_dbus_message_get_locked(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header
    * field.
    */
  def getMember()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_member(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the type of @message.
    */
  def getMessageType(): GDBusMessageType /* None */ =
    g_dbus_message_get_message_type(this.raw.asInstanceOf[Ptr[GDBusMessage]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS
    * header field.
    */
  def getNumUnixFds(): UInt /* None */ = g_dbus_message_get_num_unix_fds(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
    */
  def getPath()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_path(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
    * header field.
    */
  def getReplySerial(): UInt /* None */ = g_dbus_message_get_reply_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header
    * field.
    */
  def getSender()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_sender(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the serial for @message.
    */
  def getSerial(): UInt /* None */ = g_dbus_message_get_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header
    * field.
    *
    * This will always be non-%NULL, but may be an empty string.
    */
  def getSignature()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_signature(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the UNIX file descriptors associated with @message, if any.
    *
    * This method is only available on UNIX.
    *
    * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE values
    * in the body of the message. For example, if g_variant_get_handle() returns
    * 5, that is intended to be a reference to the file descriptor that can be
    * accessed by `g_unix_fd_list_get (list, 5, ...)`.
    */
  def getUnixFdList(): UnixFDList /* None */ = new UnixFDList(
    g_dbus_message_get_unix_fd_list(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @message is locked, does nothing. Otherwise locks the message.
    */
  def lock(): Unit /* None */ = g_dbus_message_lock(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusMessage that is an error reply to @method_call_message.
    */
  inline def newMethodError(
      error_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      error_message_format: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      args: Any*
  )(using Zone): DBusMessage /* None */ = new DBusMessage(
    g_dbus_message_new_method_error(
      this.raw.asInstanceOf[Ptr[GDBusMessage]],
      __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(error_message_format).asInstanceOf[Ptr[gchar]],
      args*
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusMessage that is an error reply to @method_call_message.
    */
  def newMethodErrorLiteral(
      error_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      error_message: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusMessage /* None */ = new DBusMessage(
    g_dbus_message_new_method_error_literal(
      this.raw.asInstanceOf[Ptr[GDBusMessage]],
      __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(error_message).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Like g_dbus_message_new_method_error() but intended for language bindings.
    */
  def newMethodErrorValist(
      error_name: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      error_message_format: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      var_args: CVarArgList /* Some(va_list) */
  )(using Zone): DBusMessage /* None */ = new DBusMessage(
    g_dbus_message_new_method_error_valist(
      this.raw.asInstanceOf[Ptr[GDBusMessage]],
      __sn_extract_string(error_name).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(error_message_format).asInstanceOf[Ptr[gchar]],
      var_args
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusMessage that is a reply to @method_call_message.
    */
  def newMethodReply(): DBusMessage /* None */ = new DBusMessage(
    g_dbus_message_new_method_reply(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /**  COMMENT FOR THE ORIGINAL C DEFINITION
    *
    *  Produces a human-readable multi-line description of @message.
    *
    *  The contents of the description has no ABI guarantees, the contents
    *  and formatting is subject to change at any time. Typical output
    *  looks something like this:
    *  |[
    *  Flags:   none
    *  Version: 0
    *  Serial:  4
    *  Headers:
    *    path -> objectpath '/org/gtk/GDBus/TestObject'
    *    interface -> 'org.gtk.GDBus.TestInterface'
    *    member -> 'GimmeStdout'
    *    destination -> ':1.146'
    *  Body: ()
    *  UNIX File Descriptors:
    *    (none)
    *  ]|
    *  or
    *  |[
    *  Flags:   no-reply-expected
    *  Version: 0
    *  Serial:  477
    *  Headers:
    *    reply-serial -> uint32 4
    *    destination -> ':1.159'
    *    sender -> ':1.146'
    *    num-unix-fds -> uint32 1
    *  Body: ()
    *  UNIX File Descriptors:
    *    fd 12: dev=0:10,mode=020620,ino=5,uid=500,gid=5,rdev=136:2,size=0,atime=1273085037,mtime=1273085851,ctime=1272982635
    *  ]|
    */
  def print(
      indent: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* None */ = fromCString(
    g_dbus_message_print(
      this.raw.asInstanceOf[Ptr[GDBusMessage]],
      guint(indent)
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the body @message. As a side-effect the
    * %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field is set to the type
    * string of @body (or cleared if @body is %NULL).
    *
    * If @body is floating, @message assumes ownership of @body.
    */
  def setBody(
      body: Ptr[
        GVariant
      ] /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
  ): Unit /* None */ =
    g_dbus_message_set_body(this.raw.asInstanceOf[Ptr[GDBusMessage]], body)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the byte order of @message.
    */
  def setByteOrder(
      byte_order: GDBusMessageByteOrder /* Some(GDBusMessageByteOrder) */
  ): Unit /* None */ = g_dbus_message_set_byte_order(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    byte_order
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header
    * field.
    */
  def setDestination(
      value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_dbus_message_set_destination(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header
    * field.
    */
  def setErrorName(
      value: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_dbus_message_set_error_name(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the flags to set on @message.
    */
  def setFlags(
      flags: GDBusMessageFlags /* Some(GDBusMessageFlags) */
  ): Unit /* None */ =
    g_dbus_message_set_flags(this.raw.asInstanceOf[Ptr[GDBusMessage]], flags)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a header field on @message.
    *
    * If @value is floating, @message assumes ownership of @value.
    */
  def setHeader(
      header_field: GDBusMessageHeaderField /* Some(GDBusMessageHeaderField) */,
      value: Option[
        Ptr[GVariant] /* Some(Ptr[_root_.sn.gnome.glib.internal.GVariant]) */
      ]
  ): Unit /* None */ = g_dbus_message_set_header(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    header_field,
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.GVariant]](o => o)
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GVariant]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header
    * field.
    */
  def setInterface(
      value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_dbus_message_set_interface(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header
    * field.
    */
  def setMember(
      value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_dbus_message_set_member(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @message to be of @type.
    */
  def setMessageType(
      `type`: GDBusMessageType /* Some(GDBusMessageType) */
  ): Unit /* None */ = g_dbus_message_set_message_type(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    `type`
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS
    * header field.
    */
  def setNumUnixFds(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = g_dbus_message_set_num_unix_fds(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    guint32(value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
    */
  def setPath(
      value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_dbus_message_set_path(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
    * header field.
    */
  def setReplySerial(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = g_dbus_message_set_reply_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    guint32(value)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header
    * field.
    */
  def setSender(
      value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_dbus_message_set_sender(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the serial for @message.
    */
  def setSerial(
      serial: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = g_dbus_message_set_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    guint32(serial)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header
    * field.
    */
  def setSignature(
      value: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ]
  )(using Zone): Unit /* None */ = g_dbus_message_set_signature(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    value
      .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
        __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
      )
      .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the UNIX file descriptors associated with @message. As a side-effect
    * the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field is set to the
    * number of fds in @fd_list (or cleared if
    * @fd_list
    *   is %NULL).
    *
    * This method is only available on UNIX.
    *
    * When designing D-Bus APIs that are intended to be interoperable, please
    * note that non-GDBus implementations of D-Bus can usually only access file
    * descriptors if they are referenced by a value of type
    * %G_VARIANT_TYPE_HANDLE in the body of the message.
    */
  def setUnixFdList(
      fd_list: Option[UnixFDList /* Some(Ptr[GUnixFDList]) */ ]
  ): Unit /* None */ = g_dbus_message_set_unix_fd_list(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    fd_list
      .map[Ptr[GUnixFDList]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GUnixFDList]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes @message to a blob. The byte order returned by
    * g_dbus_message_get_byte_order() will be used.
    */
  @annotation.compileTimeOnly(
    "Method to_blob contains an OUT parameter, which is not supported yet"
  )
  private def toBlob__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @message is not of type %G_DBUS_MESSAGE_TYPE_ERROR does nothing and
    * returns %FALSE.
    *
    * Otherwise this method encodes the error in @message as a #GError using
    * g_dbus_error_set_dbus_error() using the information in the
    * %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field of @message as well
    * as the first string item in @message's body.
    */
  def toGerror(): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_dbus_message_to_gerror(
      this.raw.asInstanceOf[Ptr[GDBusMessage]],
      __errorPtr
    ).value.!=(0)
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
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new empty #GDBusMessage.
    */
  def apply(): DBusMessage = new DBusMessage(g_dbus_message_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusMessage for a method call.
    */
  def methodCall(
      name: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      `interface_`: Option[
        String | CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
      ],
      method: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): DBusMessage = new DBusMessage(
    g_dbus_message_new_method_call(
      name
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]],
      `interface_`
        .map[Ptr[_root_.sn.gnome.glib.internal.gchar]](o =>
          __sn_extract_string(o).asInstanceOf[Ptr[gchar]]
        )
        .getOrElse(null.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]),
      __sn_extract_string(method).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GDBusMessage for a signal emission.
    */
  def signal(
      path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      `interface_`: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      signal: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
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
