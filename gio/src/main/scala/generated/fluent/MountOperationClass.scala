package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMountOperationClass
import sn.gnome.gobject.ObjectClass

class MountOperationClass private[gnome] (raw: Ptr[GMountOperationClass]):

  def getUnsafeRawPointer(): Ptr[GMountOperationClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field ask_password]: Field is missing <type>")
  private def askPassword__ = ???
  @annotation.compileTimeOnly("[field ask_question]: Field is missing <type>")
  private def askQuestion__ = ???
  @annotation.compileTimeOnly("[field reply]: Field is missing <type>")
  private def reply__ = ???
  @annotation.compileTimeOnly("[field aborted]: Field is missing <type>")
  private def aborted__ = ???
  @annotation.compileTimeOnly("[field show_processes]: Field is missing <type>")
  private def showProcesses__ = ???
  @annotation.compileTimeOnly(
    "[field show_unmount_progress]: Field is missing <type>"
  )
  private def showUnmountProgress__ = ???
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
  @annotation.compileTimeOnly("[field _g_reserved6]: Field is missing <type>")
  private def GReserved6__ = ???
  @annotation.compileTimeOnly("[field _g_reserved7]: Field is missing <type>")
  private def GReserved7__ = ???
  @annotation.compileTimeOnly("[field _g_reserved8]: Field is missing <type>")
  private def GReserved8__ = ???
  @annotation.compileTimeOnly("[field _g_reserved9]: Field is missing <type>")
  private def GReserved9__ = ???
end MountOperationClass

object MountOperationClass:
  def fromRaw(ptr: Ptr[GMountOperationClass]): MountOperationClass =
    new MountOperationClass(ptr)
end MountOperationClass
