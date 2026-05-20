package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.FilterInputStreamClass
import sn.gnome.gio.internal.GConverterInputStreamClass

class ConverterInputStreamClass private[gnome] (
    raw: Ptr[GConverterInputStreamClass]
):

  def getUnsafeRawPointer(): Ptr[GConverterInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.FilterInputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GFilterInputStreamClass]
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
end ConverterInputStreamClass

object ConverterInputStreamClass:
  def fromRaw(ptr: Ptr[GConverterInputStreamClass]): ConverterInputStreamClass =
    new ConverterInputStreamClass(ptr)
end ConverterInputStreamClass
