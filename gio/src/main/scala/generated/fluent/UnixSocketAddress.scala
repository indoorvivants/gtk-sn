package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.SocketAddress
import sn.gnome.gio.fluent.SocketConnectable
import sn.gnome.gio.fluent.UnixSocketAddressType
import sn.gnome.gio.internal.GUnixSocketAddress
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Support for UNIX-domain (also known as local) sockets.
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
  */
class UnixSocketAddress(raw: Ptr[GUnixSocketAddress])
    extends SocketAddress(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @address's type.
    */
  def getAddressType(): UnixSocketAddressType /* None */ =
    UnixSocketAddressType.fromRaw(
      g_unix_socket_address_get_address_type(
        this.raw.asInstanceOf[Ptr[GUnixSocketAddress]]
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tests if @address is abstract.
    */
  def getIsAbstract(): Boolean /* None */ =
    g_unix_socket_address_get_is_abstract(
      this.raw.asInstanceOf[Ptr[GUnixSocketAddress]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @address's path, or for abstract sockets the "name".
    *
    * Guaranteed to be zero-terminated, but an abstract socket may contain
    * embedded zeros, and thus you should use
    * g_unix_socket_address_get_path_len() to get the true length of this
    * string.
    */
  def getPath()(using Zone): String /* None */ = fromCString(
    g_unix_socket_address_get_path(
      this.raw.asInstanceOf[Ptr[GUnixSocketAddress]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the length of @address's path.
    *
    * For details, see g_unix_socket_address_get_path().
    */
  def getPathLen(): CUnsignedLongInt /* None */ =
    g_unix_socket_address_get_path_len(
      this.raw.asInstanceOf[Ptr[GUnixSocketAddress]]
    ).value

end UnixSocketAddress

object UnixSocketAddress:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GUnixSocketAddress for @path.
    *
    * To create abstract socket addresses, on systems that support that, use
    * g_unix_socket_address_new_abstract().
    */
  def apply(
      path: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): UnixSocketAddress = new UnixSocketAddress(
    g_unix_socket_address_new(
      __sn_extract_string(path).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if abstract UNIX domain socket names are supported.
    */
  def abstractNamesSupported(): Boolean /* None */ =
    g_unix_socket_address_abstract_names_supported().value.!=(0)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end UnixSocketAddress
