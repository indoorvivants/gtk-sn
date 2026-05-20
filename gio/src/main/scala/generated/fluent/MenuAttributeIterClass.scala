package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuAttributeIterClass
import sn.gnome.gobject.ObjectClass

class MenuAttributeIterClass private[gnome] (raw: Ptr[GMenuAttributeIterClass]):

  def getUnsafeRawPointer(): Ptr[GMenuAttributeIterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_next]: Field is missing <type>")
  private def getNext__ = ???
end MenuAttributeIterClass

object MenuAttributeIterClass:
  def fromRaw(ptr: Ptr[GMenuAttributeIterClass]): MenuAttributeIterClass =
    new MenuAttributeIterClass(ptr)
end MenuAttributeIterClass
