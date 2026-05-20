package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileMonitorClass
import sn.gnome.gobject.ObjectClass

class FileMonitorClass private[gnome] (raw: Ptr[GFileMonitorClass]):

  def getUnsafeRawPointer(): Ptr[GFileMonitorClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field cancel]: Field is missing <type>")
  private def cancel__ = ???
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
end FileMonitorClass

object FileMonitorClass:
  def fromRaw(ptr: Ptr[GFileMonitorClass]): FileMonitorClass =
    new FileMonitorClass(ptr)
end FileMonitorClass
