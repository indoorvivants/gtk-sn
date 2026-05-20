package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.FilterInputStreamClass
import sn.gnome.gio.internal.GBufferedInputStreamClass

class BufferedInputStreamClass private[gnome] (
    raw: Ptr[GBufferedInputStreamClass]
):

  def getUnsafeRawPointer(): Ptr[GBufferedInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.FilterInputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GFilterInputStreamClass]
  @annotation.compileTimeOnly("[field fill]: Field is missing <type>")
  private def fill__ = ???
  @annotation.compileTimeOnly("[field fill_async]: Field is missing <type>")
  private def fillAsync__ = ???
  @annotation.compileTimeOnly("[field fill_finish]: Field is missing <type>")
  private def fillFinish__ = ???
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
end BufferedInputStreamClass

object BufferedInputStreamClass:
  def fromRaw(ptr: Ptr[GBufferedInputStreamClass]): BufferedInputStreamClass =
    new BufferedInputStreamClass(ptr)
end BufferedInputStreamClass
