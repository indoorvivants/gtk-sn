package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.OutputStreamClass
import sn.gnome.gio.internal.GMemoryOutputStreamClass

class MemoryOutputStreamClass private[gnome] (
    raw: Ptr[GMemoryOutputStreamClass]
):

  def getUnsafeRawPointer(): Ptr[GMemoryOutputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.OutputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GOutputStreamClass]
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
end MemoryOutputStreamClass

object MemoryOutputStreamClass:
  def fromRaw(ptr: Ptr[GMemoryOutputStreamClass]): MemoryOutputStreamClass =
    new MemoryOutputStreamClass(ptr)
end MemoryOutputStreamClass
