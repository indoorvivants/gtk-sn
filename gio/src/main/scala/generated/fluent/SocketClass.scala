package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GSocketClass
import sn.gnome.gobject.ObjectClass

class SocketClass private[gnome] (raw: Ptr[GSocketClass]):

  def getUnsafeRawPointer(): Ptr[GSocketClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
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
  @annotation.compileTimeOnly("[field _g_reserved7]: Field is missing <type>")
  private def GReserved7__ = ???
  @annotation.compileTimeOnly("[field _g_reserved8]: Field is missing <type>")
  private def GReserved8__ = ???
  @annotation.compileTimeOnly("[field _g_reserved9]: Field is missing <type>")
  private def GReserved9__ = ???
  @annotation.compileTimeOnly("[field _g_reserved10]: Field is missing <type>")
  private def GReserved10__ = ???
end SocketClass

object SocketClass:
  def fromRaw(ptr: Ptr[GSocketClass]): SocketClass = new SocketClass(ptr)
end SocketClass
