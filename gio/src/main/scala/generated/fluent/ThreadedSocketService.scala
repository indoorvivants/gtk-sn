package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{SocketConnection, SocketService}
import sn.gnome.gio.internal.{GSocketConnection, GThreadedSocketService}
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GObject,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** A #GThreadedSocketService is a simple subclass of #GSocketService that
  * handles incoming connections by creating a worker thread and dispatching the
  * connection to it by emitting the #GThreadedSocketService::run signal in the
  * new thread.
  *
  * The signal handler may perform blocking IO and need not return until the
  * connection is closed.
  *
  * The service is implemented using a thread pool, so there is a limited amount
  * of threads available to serve incoming requests. The service automatically
  * stops the #GSocketService from accepting new connections when all threads
  * are busy.
  *
  * As with #GSocketService, you may connect to #GThreadedSocketService::run, or
  * subclass and override the default handler.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ThreadedSocketService private[gnome] (raw: Ptr[GThreadedSocketService])
    extends SocketService(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** The ::run signal is emitted in a worker thread in response to an incoming
    * connection. This thread is dedicated to handling
    * @connection
    *   and may perform blocking IO. The signal handler need not return until
    *   the connection is closed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onRun(
      handler: ((connection: SocketConnection, sourceObject: Object)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (connection: SocketConnection, sourceObject: Object),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GThreadedSocketService],
          connection: Ptr[GSocketConnection] /* param */,
          sourceObject: Ptr[GObject] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            connection = sr.runtime
              .get[SocketConnection](connection.asInstanceOf[Ptr[Byte]]),
            sourceObject =
              sr.runtime.get[Object](sourceObject.asInstanceOf[Ptr[Byte]])
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"run"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onRun
end ThreadedSocketService

object ThreadedSocketService:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GThreadedSocketService])(using Runtime) =
    summon[Runtime].getOrCreate[ThreadedSocketService](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ThreadedSocketService(ptr)
    )

  /** Creates a new #GThreadedSocketService with no listeners. Listeners must be
    * added with one of the #GSocketListener "add" methods.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(max_threads: Int /* Some(CInt) */ )(using
      Runtime
  ): ThreadedSocketService =
    val raw: Ptr[Byte] = g_threaded_socket_service_new(max_threads).asInstanceOf
    summon[Runtime].getOrCreate[ThreadedSocketService](
      raw,
      r => ThreadedSocketService.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ThreadedSocketService
