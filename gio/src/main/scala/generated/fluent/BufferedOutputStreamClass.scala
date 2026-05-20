package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.FilterOutputStreamClass
import sn.gnome.gio.internal.GBufferedOutputStreamClass

class BufferedOutputStreamClass private[gnome] (
    raw: Ptr[GBufferedOutputStreamClass]
):

  def getUnsafeRawPointer(): Ptr[GBufferedOutputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.FilterOutputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GFilterOutputStreamClass]
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
end BufferedOutputStreamClass

object BufferedOutputStreamClass:
  def fromRaw(ptr: Ptr[GBufferedOutputStreamClass]): BufferedOutputStreamClass =
    new BufferedOutputStreamClass(ptr)
end BufferedOutputStreamClass
