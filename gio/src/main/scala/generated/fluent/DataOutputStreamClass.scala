package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.FilterOutputStreamClass
import sn.gnome.gio.internal.GDataOutputStreamClass

class DataOutputStreamClass private[gnome] (raw: Ptr[GDataOutputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GDataOutputStreamClass] = this.raw

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
end DataOutputStreamClass

object DataOutputStreamClass:
  def fromRaw(ptr: Ptr[GDataOutputStreamClass]): DataOutputStreamClass =
    new DataOutputStreamClass(ptr)
end DataOutputStreamClass
