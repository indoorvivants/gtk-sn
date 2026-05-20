package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.SocketListenerClass
import sn.gnome.gio.internal.GSocketServiceClass

/** Class structure for #GSocketService.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketServiceClass private[gnome] (raw: Ptr[GSocketServiceClass]):

  def getUnsafeRawPointer(): Ptr[GSocketServiceClass] = this.raw

  def parentClass: sn.gnome.gio.SocketListenerClass /* None */ =
    (!raw).parent_class.asInstanceOf[GSocketListenerClass]
  @annotation.compileTimeOnly("[field incoming]: Field is missing <type>")
  private def incoming__ = ???
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
end SocketServiceClass

object SocketServiceClass:
  def fromRaw(ptr: Ptr[GSocketServiceClass]): SocketServiceClass =
    new SocketServiceClass(ptr)
end SocketServiceClass
