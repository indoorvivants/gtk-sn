package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketService
import sn.gnome.gio.internal.GThreadedSocketService

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GThreadedSocketService is a simple subclass of #GSocketService that
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
  */
class ThreadedSocketService(raw: Ptr[GThreadedSocketService])
    extends SocketService(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ThreadedSocketService

object ThreadedSocketService:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GThreadedSocketService with no listeners. Listeners must be
    * added with one of the #GSocketListener "add" methods.
    */
  def apply(max_threads: Int /* Some(CInt) */ ): ThreadedSocketService =
    new ThreadedSocketService(
      g_threaded_socket_service_new(max_threads).asInstanceOf
    )
end ThreadedSocketService
