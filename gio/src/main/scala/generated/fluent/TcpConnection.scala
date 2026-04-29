package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketConnection
import sn.gnome.gio.internal.GTcpConnection
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This is the subclass of #GSocketConnection that is created for TCP/IP
  * sockets.
  */
class TcpConnection(raw: Ptr[GTcpConnection])
    extends SocketConnection(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if graceful disconnects are used. See
    * g_tcp_connection_set_graceful_disconnect().
    */
  def getGracefulDisconnect(): Boolean =
    g_tcp_connection_get_graceful_disconnect(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This enables graceful disconnects on close. A graceful disconnect means
    * that we signal the receiving end that the connection is terminated and
    * wait for it to close the connection before closing the connection.
    *
    * A graceful disconnect means that we can be sure that we successfully sent
    * all the outstanding data to the other end, or get an error reported.
    * However, it also means we have to wait for all the data to reach the other
    * side and for it to acknowledge this by closing the socket, which may take
    * a while. For this reason it is disabled by default.
    */
  def setGracefulDisconnect(graceful_disconnect: Boolean): Unit =
    g_tcp_connection_set_graceful_disconnect(
      this.raw.asInstanceOf,
      gboolean(gint((if graceful_disconnect == true then 1 else 0)))
    )

end TcpConnection
