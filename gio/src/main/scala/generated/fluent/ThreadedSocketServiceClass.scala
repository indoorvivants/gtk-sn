package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketServiceClass
import sn.gnome.gio.internal.GThreadedSocketServiceClass

class ThreadedSocketServiceClass private[gnome] (
    raw: Ptr[GThreadedSocketServiceClass]
):

  def getUnsafeRawPointer(): Ptr[GThreadedSocketServiceClass] = this.raw

  def parentClass: sn.gnome.gio.SocketServiceClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketServiceClass]
  @annotation.compileTimeOnly("[field run]: Field is missing <type>")
  private def run__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
  @annotation.compileTimeOnly("[field _g_reserved5]: Field is missing <type>")
  private def GReserved5__ = ???
end ThreadedSocketServiceClass

object ThreadedSocketServiceClass:
  def fromRaw(
      ptr: Ptr[GThreadedSocketServiceClass]
  ): ThreadedSocketServiceClass = new ThreadedSocketServiceClass(ptr)
end ThreadedSocketServiceClass
