package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkScrollableInterface

class ScrollableInterface private[gnome] (raw: Ptr[GtkScrollableInterface]):

  def getUnsafeRawPointer(): Ptr[GtkScrollableInterface] = this.raw

  def baseIface: sn.gnome.gobject.TypeInterface /* None */ = (!raw).base_iface
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_border]: Field is missing <type>")
  private def getBorder__ = ???
end ScrollableInterface

object ScrollableInterface:
  def fromRaw(ptr: Ptr[GtkScrollableInterface]): ScrollableInterface =
    new ScrollableInterface(ptr)
end ScrollableInterface
