package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkActivateActionClass

class ActivateActionClass private[gnome] (raw: Ptr[GtkActivateActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkActivateActionClass] = this.raw
end ActivateActionClass

object ActivateActionClass:
  def fromRaw(ptr: Ptr[GtkActivateActionClass]): ActivateActionClass =
    new ActivateActionClass(ptr)
end ActivateActionClass
