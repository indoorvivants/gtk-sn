package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuLinkIterClass
import sn.gnome.gobject.ObjectClass

class MenuLinkIterClass private[gnome] (raw: Ptr[GMenuLinkIterClass]):

  def getUnsafeRawPointer(): Ptr[GMenuLinkIterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_next]: Field is missing <type>")
  private def getNext__ = ???
end MenuLinkIterClass

object MenuLinkIterClass:
  def fromRaw(ptr: Ptr[GMenuLinkIterClass]): MenuLinkIterClass =
    new MenuLinkIterClass(ptr)
end MenuLinkIterClass
