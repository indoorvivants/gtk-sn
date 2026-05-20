package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.IOStreamClass
import sn.gnome.gio.internal.GSocketConnectionClass

class SocketConnectionClass private[gnome] (raw: Ptr[GSocketConnectionClass]):

  def getUnsafeRawPointer(): Ptr[GSocketConnectionClass] = this.raw

  def parentClass: sn.gnome.gio.IOStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GIOStreamClass]
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
  @annotation.compileTimeOnly("[field _g_reserved6]: Field is missing <type>")
  private def GReserved6__ = ???
end SocketConnectionClass

object SocketConnectionClass:
  def fromRaw(ptr: Ptr[GSocketConnectionClass]): SocketConnectionClass =
    new SocketConnectionClass(ptr)
end SocketConnectionClass
