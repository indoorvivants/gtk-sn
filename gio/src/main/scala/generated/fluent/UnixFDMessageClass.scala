package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDMessageClass

class UnixFDMessageClass private[gnome] (raw: Ptr[GUnixFDMessageClass]):

  def getUnsafeRawPointer(): Ptr[GUnixFDMessageClass] = this.raw

  def parentClass: sn.gnome.gio.SocketControlMessageClass /* None */ =
    sn.gnome.gio.SocketControlMessageClass.fromRaw((!raw).parent_class)
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
end UnixFDMessageClass
object UnixFDMessageClass:
  def fromRaw(ptr: Ptr[GUnixFDMessageClass]): UnixFDMessageClass =
    new UnixFDMessageClass(ptr)
end UnixFDMessageClass
