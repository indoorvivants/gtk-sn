package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.InputStreamClass
import sn.gnome.gio.internal.GMemoryInputStreamClass

class MemoryInputStreamClass private[gnome] (raw: Ptr[GMemoryInputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GMemoryInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.InputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GInputStreamClass]
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
end MemoryInputStreamClass

object MemoryInputStreamClass:
  def fromRaw(ptr: Ptr[GMemoryInputStreamClass]): MemoryInputStreamClass =
    new MemoryInputStreamClass(ptr)
end MemoryInputStreamClass
