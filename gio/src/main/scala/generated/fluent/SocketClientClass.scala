package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketClientClass
import sn.gnome.gobject.ObjectClass

class SocketClientClass private[gnome] (raw: Ptr[GSocketClientClass]):

  def getUnsafeRawPointer(): Ptr[GSocketClientClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field event]: Field is missing <type>")
  private def event__ = ???
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
  @annotation.compileTimeOnly("[field _g_reserved4]: Field is missing <type>")
  private def GReserved4__ = ???
end SocketClientClass

object SocketClientClass:
  def fromRaw(ptr: Ptr[GSocketClientClass]): SocketClientClass =
    new SocketClientClass(ptr)
end SocketClientClass
