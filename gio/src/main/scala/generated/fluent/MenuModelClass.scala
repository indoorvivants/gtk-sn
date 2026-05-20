package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GMenuModelClass
import sn.gnome.gobject.ObjectClass

class MenuModelClass private[gnome] (raw: Ptr[GMenuModelClass]):

  def getUnsafeRawPointer(): Ptr[GMenuModelClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field is_mutable]: Field is missing <type>")
  private def isMutable__ = ???
  @annotation.compileTimeOnly("[field get_n_items]: Field is missing <type>")
  private def getNItems__ = ???
  @annotation.compileTimeOnly(
    "[field get_item_attributes]: Field is missing <type>"
  )
  private def getItemAttributes__ = ???
  @annotation.compileTimeOnly(
    "[field iterate_item_attributes]: Field is missing <type>"
  )
  private def iterateItemAttributes__ = ???
  @annotation.compileTimeOnly(
    "[field get_item_attribute_value]: Field is missing <type>"
  )
  private def getItemAttributeValue__ = ???
  @annotation.compileTimeOnly("[field get_item_links]: Field is missing <type>")
  private def getItemLinks__ = ???
  @annotation.compileTimeOnly(
    "[field iterate_item_links]: Field is missing <type>"
  )
  private def iterateItemLinks__ = ???
  @annotation.compileTimeOnly("[field get_item_link]: Field is missing <type>")
  private def getItemLink__ = ???
end MenuModelClass

object MenuModelClass:
  def fromRaw(ptr: Ptr[GMenuModelClass]): MenuModelClass = new MenuModelClass(
    ptr
  )
end MenuModelClass
