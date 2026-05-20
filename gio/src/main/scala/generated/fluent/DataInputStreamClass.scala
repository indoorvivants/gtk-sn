package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.BufferedInputStreamClass
import sn.gnome.gio.internal.GDataInputStreamClass

class DataInputStreamClass private[gnome] (raw: Ptr[GDataInputStreamClass]):

  def getUnsafeRawPointer(): Ptr[GDataInputStreamClass] = this.raw

  def parentClass: sn.gnome.gio.BufferedInputStreamClass /* None */ =
    (!raw).parent_class.asInstanceOf[GBufferedInputStreamClass]
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
end DataInputStreamClass

object DataInputStreamClass:
  def fromRaw(ptr: Ptr[GDataInputStreamClass]): DataInputStreamClass =
    new DataInputStreamClass(ptr)
end DataInputStreamClass
