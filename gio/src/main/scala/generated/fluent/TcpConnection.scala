package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GTcpConnection
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

class TcpConnection(raw: Ptr[GTcpConnection])
    extends SocketConnection(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getGracefulDisconnect(): Boolean =
    g_tcp_connection_get_graceful_disconnect(this.raw.asInstanceOf).value.!=(0)

  def setGracefulDisconnect(graceful_disconnect: Boolean): Unit =
    g_tcp_connection_set_graceful_disconnect(
      this.raw.asInstanceOf,
      gboolean(gint((if graceful_disconnect == true then 1 else 0)))
    )

end TcpConnection
