package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketService
import sn.gnome.gio.internal.GThreadedSocketService

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
class ThreadedSocketService(raw: Ptr[GThreadedSocketService])
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
  @annotation.compileTimeOnly(
    "[signal run]: Type Type(List(),ListMap(@name -> DataRecord(SocketConnection))) has no @type attribute"
  )
  private def onRun = ???

end ThreadedSocketService

object ThreadedSocketService:
  /** Creates a new #GThreadedSocketService with no listeners. Listeners must be
    * added with one of the #GSocketListener "add" methods.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(max_threads: Int /* Some(CInt) */ ): ThreadedSocketService =
    new ThreadedSocketService(
      g_threaded_socket_service_new(max_threads).asInstanceOf
    )
end ThreadedSocketService
