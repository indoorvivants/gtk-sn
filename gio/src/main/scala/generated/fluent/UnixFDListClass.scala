package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GUnixFDListClass
import sn.gnome.gobject.ObjectClass

class UnixFDListClass private[gnome] (raw: Ptr[GUnixFDListClass]):

  def getUnsafeRawPointer(): Ptr[GUnixFDListClass] = this.raw

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
end UnixFDListClass

object UnixFDListClass:
  def fromRaw(ptr: Ptr[GUnixFDListClass]): UnixFDListClass =
    new UnixFDListClass(ptr)
end UnixFDListClass
