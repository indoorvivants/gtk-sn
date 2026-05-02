package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.fluent.TcpConnection
import sn.gnome.gio.internal.GTcpWrapperConnection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GTcpWrapperConnection can be used to wrap a #GIOStream that is based on a
  * #GSocket, but which is not actually a #GSocketConnection. This is used by
  * #GSocketClient so that it can always return a #GSocketConnection, even when
  * the connection it has actually created is not directly a #GSocketConnection.
  */
class TcpWrapperConnection(raw: Ptr[GTcpWrapperConnection])
    extends TcpConnection(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets @conn's base #GIOStream
    */
  def getBaseIoStream(): IOStream /* None */ = new IOStream(
    g_tcp_wrapper_connection_get_base_io_stream(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

end TcpWrapperConnection

object TcpWrapperConnection:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Wraps @base_io_stream and @socket together as a #GSocketConnection.
    */
  def apply(
      base_io_stream: IOStream /* Some(Ptr[GIOStream]) */,
      socket: Socket /* Some(Ptr[GSocket]) */
  ): TcpWrapperConnection = new TcpWrapperConnection(
    g_tcp_wrapper_connection_new(
      base_io_stream.getUnsafeRawPointer().asInstanceOf,
      socket.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TcpWrapperConnection
