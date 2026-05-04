package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{SocketConnectable, SocketFamily}
import sn.gnome.gio.internal.GSocketAddress
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, gpointer, gsize, gssize}
import sn.gnome.gobject.fluent.Object

/** #GSocketAddress is the equivalent of struct sockaddr in the BSD sockets API.
  * This is an abstract class; use #GInetSocketAddress for internet sockets, or
  * #GUnixSocketAddress for UNIX domain sockets.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketAddress(raw: Ptr[GSocketAddress])
    extends Object(raw.asInstanceOf),
      SocketConnectable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the socket family type of @address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFamily(): SocketFamily /* None */ = SocketFamily.fromRaw(
    g_socket_address_get_family(this.raw.asInstanceOf[Ptr[GSocketAddress]])
  )

  /** Gets the size of @address's native struct sockaddr. You can use this to
    * allocate memory to pass to g_socket_address_to_native().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNativeSize(): CLongInt /* None */ = g_socket_address_get_native_size(
    this.raw.asInstanceOf[Ptr[GSocketAddress]]
  ).value

  /** Converts a #GSocketAddress to a native struct sockaddr, which can be
    * passed to low-level functions like connect() or bind().
    *
    * If not enough space is available, a %G_IO_ERROR_NO_SPACE error is
    * returned. If the address type is not known on the system then a
    * %G_IO_ERROR_NOT_SUPPORTED error is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toNative(
      dest: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      destlen: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_socket_address_to_native(
      this.raw.asInstanceOf[Ptr[GSocketAddress]],
      dest
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      gsize(destlen),
      __errorPtr
    ).value.!=(0)
  )

end SocketAddress

object SocketAddress:
  /** Creates a #GSocketAddress subclass corresponding to the native struct
    * sockaddr @native.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromNative(
      native: Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */,
      len: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gsize) */
  ): SocketAddress = new SocketAddress(
    g_socket_address_new_from_native(gpointer(native), gsize(len)).asInstanceOf
  )
end SocketAddress
