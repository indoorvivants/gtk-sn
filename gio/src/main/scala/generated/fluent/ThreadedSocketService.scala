package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.SocketService
import sn.gnome.gio.internal.GThreadedSocketService

class ThreadedSocketService(raw: Ptr[GThreadedSocketService])
    extends SocketService(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end ThreadedSocketService

object ThreadedSocketService:
  def apply(max_threads: Int): ThreadedSocketService =
    new ThreadedSocketService(
      g_threaded_socket_service_new(max_threads).asInstanceOf
    )
end ThreadedSocketService
