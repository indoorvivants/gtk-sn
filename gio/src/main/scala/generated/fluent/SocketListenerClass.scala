package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketListenerClass
import sn.gnome.gobject.ObjectClass

/** Class structure for #GSocketListener.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SocketListenerClass private[gnome] (raw: Ptr[GSocketListenerClass]):

  def getUnsafeRawPointer(): Ptr[GSocketListenerClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field event]: Field is missing <type>")
  private def event__ = ???
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
end SocketListenerClass

object SocketListenerClass:
  def fromRaw(ptr: Ptr[GSocketListenerClass]): SocketListenerClass =
    new SocketListenerClass(ptr)
end SocketListenerClass
