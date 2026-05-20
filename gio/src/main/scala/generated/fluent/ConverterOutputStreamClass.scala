package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.FilterOutputStreamClass
import sn.gnome.gio.internal.GConverterOutputStreamClass

class ConverterOutputStreamClass private[gnome] (
    raw: Ptr[GConverterOutputStreamClass]
):

  def getUnsafeRawPointer(): Ptr[GConverterOutputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.FilterOutputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GFilterOutputStreamClass]
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
end ConverterOutputStreamClass

object ConverterOutputStreamClass:
  def fromRaw(
      ptr: Ptr[GConverterOutputStreamClass]
  ): ConverterOutputStreamClass = new ConverterOutputStreamClass(ptr)
end ConverterOutputStreamClass
