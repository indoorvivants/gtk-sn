package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.IOStream
import sn.gnome.gio.fluent.Socket
import sn.gnome.gio.fluent.TcpConnection
import sn.gnome.gio.internal.GTcpWrapperConnection

class TcpWrapperConnection(raw: Ptr[GTcpWrapperConnection])
    extends TcpConnection(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getBaseIoStream(): IOStream = new IOStream(
    g_tcp_wrapper_connection_get_base_io_stream(
      this.raw.asInstanceOf
    ).asInstanceOf
  )

end TcpWrapperConnection

object TcpWrapperConnection:
  def apply(base_io_stream: IOStream, socket: Socket): TcpWrapperConnection =
    new TcpWrapperConnection(
      g_tcp_wrapper_connection_new(
        base_io_stream.getUnsafeRawPointer().asInstanceOf,
        socket.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end TcpWrapperConnection
