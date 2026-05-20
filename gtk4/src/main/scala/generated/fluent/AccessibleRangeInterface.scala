package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkAccessibleRangeInterface

class AccessibleRangeInterface private[gnome] (
    raw: Ptr[GtkAccessibleRangeInterface]
):

  def getUnsafeRawPointer(): Ptr[GtkAccessibleRangeInterface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field set_current_value]: Field is missing <type>"
  )
  private def setCurrentValue__ = ???
end AccessibleRangeInterface

object AccessibleRangeInterface:
  def fromRaw(ptr: Ptr[GtkAccessibleRangeInterface]): AccessibleRangeInterface =
    new AccessibleRangeInterface(ptr)
end AccessibleRangeInterface
