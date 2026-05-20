package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixInputStreamClass

class UnixInputStreamClass private[gnome] (raw: Ptr[GUnixInputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GUnixInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.InputStreamClass /* None */ =
    sn.gnome.gio.InputStreamClass.fromRaw((!raw).parent_class)
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
end UnixInputStreamClass
object UnixInputStreamClass:
  def fromRaw(ptr: Ptr[GUnixInputStreamClass]): UnixInputStreamClass =
    new UnixInputStreamClass(ptr)
end UnixInputStreamClass
