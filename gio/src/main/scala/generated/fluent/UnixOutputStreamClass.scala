package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixOutputStreamClass

class UnixOutputStreamClass private[gnome] (raw: Ptr[GUnixOutputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GUnixOutputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.OutputStreamClass /* None */ =
    sn.gnome.gio.OutputStreamClass.fromRaw((!raw).parent_class)
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
end UnixOutputStreamClass
object UnixOutputStreamClass:
  def fromRaw(ptr: Ptr[GUnixOutputStreamClass]): UnixOutputStreamClass =
    new UnixOutputStreamClass(ptr)
end UnixOutputStreamClass
