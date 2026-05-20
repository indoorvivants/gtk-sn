package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.InputStreamClass
import sn.gnome.gio.internal.GFilterInputStreamClass

class FilterInputStreamClass private[gnome] (raw: Ptr[GFilterInputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GFilterInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.InputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GInputStreamClass]
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
end FilterInputStreamClass

object FilterInputStreamClass:
  def fromRaw(ptr: Ptr[GFilterInputStreamClass]): FilterInputStreamClass =
    new FilterInputStreamClass(ptr)
end FilterInputStreamClass
