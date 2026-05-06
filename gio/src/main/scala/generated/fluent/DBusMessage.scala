package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  DBusMessage,
  DBusMessageByteOrder,
  DBusMessageFlags,
  DBusMessageType,
  UnixFDList
}
import sn.gnome.gio.internal.GDBusMessage
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gchar, gint, guint, guint32}
import sn.gnome.gobject.fluent.Object

/** A type for representing D-Bus messages that can be sent or received on a
  * #GDBusConnection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusMessage(raw: Ptr[GDBusMessage]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Copies @message. The copy is a deep copy and the returned #GDBusMessage is
    * completely identical except that it is guaranteed to not be locked.
    *
    * This operation can fail if e.g. @message contains file descriptors and the
    * per-process or system-wide open files limit is reached.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): GResult[DBusMessage /* None */ ] = GResult.wrap(__errorPtr =>
    new DBusMessage(
      g_dbus_message_copy(
        this.raw.asInstanceOf[Ptr[GDBusMessage]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Convenience to get the first item in the body of @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getArg0()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_arg0(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Gets the body of a message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_body/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getBody__ = ???

  /** Gets the byte order of @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getByteOrder(): DBusMessageByteOrder /* None */ =
    DBusMessageByteOrder.fromRaw(
      g_dbus_message_get_byte_order(this.raw.asInstanceOf[Ptr[GDBusMessage]])
    )

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDestination()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_destination(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getErrorName()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_error_name(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Gets the flags for @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlags(): DBusMessageFlags /* None */ = DBusMessageFlags.fromRaw(
    g_dbus_message_get_flags(this.raw.asInstanceOf[Ptr[GDBusMessage]])
  )

  /** Gets a header field on @message.
    *
    * The caller is responsible for checking the type of the returned #GVariant
    * matches what is expected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_header/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def getHeader__ = ???

  /** Gets an array of all header fields on @message that are set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_header_fields/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@type -> DataRecord(guchar*)))"
  )
  private def getHeaderFields__ = ???

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInterface()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_interface(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Checks whether @message is locked. To monitor changes to this value,
    * conncet to the #GObject::notify signal to listen for changes on the
    * #GDBusMessage:locked property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLocked(): Boolean /* None */ = g_dbus_message_get_locked(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value.!=(0)

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMember()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_member(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Gets the type of @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessageType(): DBusMessageType /* None */ = DBusMessageType.fromRaw(
    g_dbus_message_get_message_type(this.raw.asInstanceOf[Ptr[GDBusMessage]])
  )

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS
    * header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumUnixFds(): UInt /* None */ = g_dbus_message_get_num_unix_fds(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_path(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
    * header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReplySerial(): UInt /* None */ = g_dbus_message_get_reply_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSender()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_sender(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Gets the serial for @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSerial(): UInt /* None */ = g_dbus_message_get_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  ).value

  /** Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header
    * field.
    *
    * This will always be non-%NULL, but may be an empty string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSignature()(using Zone): String /* None */ = fromCString(
    g_dbus_message_get_signature(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** Gets the UNIX file descriptors associated with @message, if any.
    *
    * This method is only available on UNIX.
    *
    * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE values
    * in the body of the message. For example, if g_variant_get_handle() returns
    * 5, that is intended to be a reference to the file descriptor that can be
    * accessed by `g_unix_fd_list_get (list, 5, ...)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnixFdList(): UnixFDList /* None */ = new UnixFDList(
    g_dbus_message_get_unix_fd_list(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /** If @message is locked, does nothing. Otherwise locks the message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lock(): Unit /* None */ = g_dbus_message_lock(
    this.raw.asInstanceOf[Ptr[GDBusMessage]]
  )

  /** Creates a new #GDBusMessage that is an error reply to @method_call_message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Creates a new #GDBusMessage that is an error reply to @method_call_message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Like g_dbus_message_new_method_error() but intended for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Creates a new #GDBusMessage that is a reply to @method_call_message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def newMethodReply(): DBusMessage /* None */ = new DBusMessage(
    g_dbus_message_new_method_reply(
      this.raw.asInstanceOf[Ptr[GDBusMessage]]
    ).asInstanceOf
  )

  /**  Produces a human-readable multi-line description of @message.
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
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def print(
      indent: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* None */ = fromCString(
    g_dbus_message_print(
      this.raw.asInstanceOf[Ptr[GDBusMessage]],
      guint(indent)
    ).asInstanceOf
  )

  /** Sets the body @message. As a side-effect the
    * %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field is set to the type
    * string of @body (or cleared if @body is %NULL).
    *
    * If @body is floating, @message assumes ownership of @body.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_body/<method parameters>/body]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setBody__ = ???

  /** Sets the byte order of @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setByteOrder(
      byte_order: DBusMessageByteOrder /* Some(GDBusMessageByteOrder) */
  ): Unit /* None */ = g_dbus_message_set_byte_order(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    byte_order.raw
  )

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setErrorName(
      value: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ = g_dbus_message_set_error_name(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    __sn_extract_string(value).asInstanceOf[Ptr[gchar]]
  )

  /** Sets the flags to set on @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlags(
      flags: DBusMessageFlags /* Some(GDBusMessageFlags) */
  ): Unit /* None */ = g_dbus_message_set_flags(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    flags.raw
  )

  /** Sets a header field on @message.
    *
    * If @value is floating, @message assumes ownership of @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_header/<method parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Variant), @type -> DataRecord(GVariant*)))"
  )
  private def setHeader__ = ???

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Sets @message to be of @type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMessageType(
      `type`: DBusMessageType /* Some(GDBusMessageType) */
  ): Unit /* None */ = g_dbus_message_set_message_type(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    `type`.raw
  )

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS
    * header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNumUnixFds(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = g_dbus_message_set_num_unix_fds(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    guint32(value)
  )

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL
    * header field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReplySerial(
      value: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = g_dbus_message_set_reply_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    guint32(value)
  )

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Sets the serial for @message.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSerial(
      serial: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): Unit /* None */ = g_dbus_message_set_serial(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    guint32(serial)
  )

  /** Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header
    * field.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Sets the UNIX file descriptors associated with @message. As a side-effect
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUnixFdList(
      fd_list: Option[UnixFDList /* Some(Ptr[GUnixFDList]) */ ]
  ): Unit /* None */ = g_dbus_message_set_unix_fd_list(
    this.raw.asInstanceOf[Ptr[GDBusMessage]],
    fd_list
      .map[Ptr[GUnixFDList]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GUnixFDList]])
  )

  /** Serializes @message to a blob. The byte order returned by
    * g_dbus_message_get_byte_order() will be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_blob]: Method to_blob contains an OUT parameter, which is not supported yet"
  )
  private def toBlob__ = ???

  /** If @message is not of type %G_DBUS_MESSAGE_TYPE_ERROR does nothing and
    * returns %FALSE.
    *
    * Otherwise this method encodes the error in @message as a #GError using
    * g_dbus_error_set_dbus_error() using the information in the
    * %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field of @message as well
    * as the first string item in @message's body.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
  /** Creates a new empty #GDBusMessage.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): DBusMessage = new DBusMessage(g_dbus_message_new().asInstanceOf)

  /** Creates a new #GDBusMessage from the data stored at @blob. The byte order
    * that the message was in can be retrieved using
    * g_dbus_message_get_byte_order().
    *
    * If the @blob cannot be parsed, contains invalid fields, or contains
    * invalid headers, %G_IO_ERROR_INVALID_ARGUMENT will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[blob]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))"
  )
  private def new_from_blob() = ???

  /** Creates a new #GDBusMessage for a method call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Creates a new #GDBusMessage for a signal emission.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Utility function to calculate how many bytes are needed to completely
    * deserialize the D-Bus message stored at @blob.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<function parameters>/blob]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guchar*)))"
  )
  private def bytesNeeded() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end DBusMessage
