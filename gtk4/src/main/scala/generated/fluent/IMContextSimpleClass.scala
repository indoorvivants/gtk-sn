package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.IMContextClass
import sn.gnome.gtk4.internal.GtkIMContextSimpleClass

class IMContextSimpleClass private[gnome] (raw: Ptr[GtkIMContextSimpleClass]):

  def getUnsafeRawPointer(): Ptr[GtkIMContextSimpleClass] = this.raw

  def parentClass: sn.gnome.gtk4.IMContextClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkIMContextClass]
end IMContextSimpleClass

object IMContextSimpleClass:
  def fromRaw(ptr: Ptr[GtkIMContextSimpleClass]): IMContextSimpleClass =
    new IMContextSimpleClass(ptr)
end IMContextSimpleClass
