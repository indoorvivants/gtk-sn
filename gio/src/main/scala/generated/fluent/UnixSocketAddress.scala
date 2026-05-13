package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{
  SocketAddress,
  SocketConnectable,
  UnixSocketAddressType
}
import sn.gnome.gio.internal.GUnixSocketAddress
import sn.gnome.glib.internal.{gboolean, gchar, gint, gsize}
import sn.gnome.gobject.runtime.*

/** Support for UNIX-domain (also known as local) sockets.
  *
  * UNIX domain sockets are generally visible in the filesystem. However, some
  * systems support abstract socket names which are not visible in the
  * filesystem and not affected by the filesystem permissions, visibility, etc.
  * Currently this is only supported under Linux. If you attempt to use abstract
  * sockets on other systems, function calls may return
  * %G_IO_ERROR_NOT_SUPPORTED errors. You can use
  * g_unix_socket_address_abstract_names_supported() to see if abstract names
  * are supported.
  *
  * Since GLib 2.72, #GUnixSocketAddress is available on all platforms. It
  * requires underlying system support (such as Windows 10 with `AF_UNIX`) at
  * run time.
  *
  * Before GLib 2.72, `<gio/gunixsocketaddress.h>` belonged to the UNIX-specific
  * GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
  * when using it. This is no longer necessary since GLib 2.72.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class UnixSocketAddress private[gnome] (raw: Ptr[GUnixSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets @address's type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAddressType(): UnixSocketAddressType /* None */ =
    UnixSocketAddressType.fromRaw(
      g_unix_socket_address_get_address_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixSocketAddress]]
      )
    )
  end getAddressType

  /** Tests if @address is abstract.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIsAbstract(): Boolean /* None */ =
    g_unix_socket_address_get_is_abstract(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixSocketAddress]]
    ).value.!=(0)
  end getIsAbstract

  /** Gets @address's path, or for abstract sockets the "name".
    *
    * Guaranteed to be zero-terminated, but an abstract socket may contain
    * embedded zeros, and thus you should use
    * g_unix_socket_address_get_path_len() to get the true length of this
    * string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPath()(using Zone): String /* None */ =
    fromCString(
      g_unix_socket_address_get_path(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixSocketAddress]]
      ).asInstanceOf
    )
  end getPath

  /** Gets the length of @address's path.
    *
    * For details, see g_unix_socket_address_get_path().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPathLen(): CUnsignedLongInt /* None */ =
    g_unix_socket_address_get_path_len(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GUnixSocketAddress]]
    ).value
  end getPathLen

end UnixSocketAddress

object UnixSocketAddress:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GUnixSocketAddress])(using Runtime) =
    summon[Runtime].getOrCreate[UnixSocketAddress](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new UnixSocketAddress(ptr)
    )

  /** Creates a new #GUnixSocketAddress for @path.
    *
    * To create abstract socket addresses, on systems that support that, use
    * g_unix_socket_address_new_abstract().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      path: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): UnixSocketAddress =
    val raw: Ptr[Byte] = g_unix_socket_address_new(
      toCString(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime].getOrCreate[UnixSocketAddress](
      raw,
      r => UnixSocketAddress.applyUnsafe(r.asInstanceOf)
    )
  end apply

  /** Creates a new %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED #GUnixSocketAddress
    * for @path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def `abstract`() = ???

  /** Creates a new #GUnixSocketAddress of type @type with name @path.
    *
    * If @type is %G_UNIX_SOCKET_ADDRESS_PATH, this is equivalent to calling
    * g_unix_socket_address_new().
    *
    * If @type is %G_UNIX_SOCKET_ADDRESS_ANONYMOUS, @path and @path_len will be
    * ignored.
    *
    * If @path_type is %G_UNIX_SOCKET_ADDRESS_ABSTRACT, then @path_len bytes of @path
    * will be copied to the socket's path, and only those bytes will be
    * considered part of the name. (If @path_len is -1, then @path is assumed to
    * be NUL-terminated.) For example, if @path was "test", then calling
    * g_socket_address_get_native_size() on the returned socket would return 7
    * (2 bytes of overhead, 1 byte for the abstract-socket indicator byte, and 4
    * bytes for the name "test").
    *
    * If @path_type is %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED, then
    * @path_len
    *   bytes of @path will be copied to the socket's path, the rest of the path
    *   will be padded with 0 bytes, and the entire zero-padded buffer will be
    *   considered the name. (As above, if
    * @path_len
    *   is -1, then @path is assumed to be NUL-terminated.) In this case,
    *   g_socket_address_get_native_size() will always return the full size of a
    *   `struct sockaddr_un`, although g_unix_socket_address_get_path_len() will
    *   still return just the length of @path.
    *
    * %G_UNIX_SOCKET_ADDRESS_ABSTRACT is preferred over
    * %G_UNIX_SOCKET_ADDRESS_ABSTRACT_PADDED for new programs. Of course, when
    * connecting to a server created by another process, you must use the
    * appropriate type corresponding to how that process created its listening
    * socket.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[path]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const gchar*)))"
  )
  private def withType() = ???

  /** Checks if abstract UNIX domain socket names are supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def abstractNamesSupported()
      : Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_unix_socket_address_abstract_names_supported().value.!=(0)

end UnixSocketAddress
