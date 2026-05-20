package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.OutputStreamClass
import sn.gnome.gio.internal.GFilterOutputStreamClass

class FilterOutputStreamClass private[gnome] (
    raw: Ptr[GFilterOutputStreamClass]
):

  def getUnsafeRawPointer(): Ptr[GFilterOutputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.OutputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GOutputStreamClass]
  @annotation.compileTimeOnly("[field _g_reserved1]: Field is missing <type>")
  private def GReserved1__ = ???
  @annotation.compileTimeOnly("[field _g_reserved2]: Field is missing <type>")
  private def GReserved2__ = ???
  @annotation.compileTimeOnly("[field _g_reserved3]: Field is missing <type>")
  private def GReserved3__ = ???
end FilterOutputStreamClass

object FilterOutputStreamClass:
  def fromRaw(ptr: Ptr[GFilterOutputStreamClass]): FilterOutputStreamClass =
    new FilterOutputStreamClass(ptr)
end FilterOutputStreamClass
