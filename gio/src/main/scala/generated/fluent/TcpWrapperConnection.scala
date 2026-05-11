package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{IOStream, Socket, SocketConnection, TcpConnection}
import sn.gnome.gio.internal.{GSocketConnection, GTcpWrapperConnection}
import sn.gnome.gobject.runtime.*

/** A #GTcpWrapperConnection can be used to wrap a #GIOStream that is based on a
  * #GSocket, but which is not actually a #GSocketConnection. This is used by
  * #GSocketClient so that it can always return a #GSocketConnection, even when
  * the connection it has actually created is not directly a #GSocketConnection.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TcpWrapperConnection private[gnome] (raw: Ptr[GTcpWrapperConnection])
    extends TcpConnection(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Connect @connection to the specified remote address.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method connect]: Method connect is weird: Incorrectly marked as overriding a connect method in GObject"
  )
  private def connect__ = ???

  /** Gets @conn's base #GIOStream
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseIoStream()(using
      Runtime
  ): sn.gnome.gio.fluent.IOStream /* None */ =
    sn.gnome.gio.fluent.IOStream.applyUnsafe(
      g_tcp_wrapper_connection_get_base_io_stream(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTcpWrapperConnection]]
      ).asInstanceOf
    )
  end getBaseIoStream

end TcpWrapperConnection

object TcpWrapperConnection:
  def applyUnsafe(ptr: Ptr[GTcpWrapperConnection])(using Runtime) =
    summon[Runtime].getOrCreate[TcpWrapperConnection](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TcpWrapperConnection(ptr)
    )

  /** Wraps @base_io_stream and @socket together as a #GSocketConnection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      base_io_stream: sn.gnome.gio.fluent.IOStream /* Some(Ptr[GIOStream]) */,
      socket: sn.gnome.gio.fluent.Socket /* Some(Ptr[GSocket]) */
  )(using Runtime): TcpWrapperConnection =
    val raw: Ptr[Byte] = g_tcp_wrapper_connection_new(
      base_io_stream.getUnsafeRawPointer().asInstanceOf,
      socket.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime].getOrCreate[TcpWrapperConnection](
      raw,
      r => TcpWrapperConnection.applyUnsafe(r.asInstanceOf)
    )
  end apply
end TcpWrapperConnection
