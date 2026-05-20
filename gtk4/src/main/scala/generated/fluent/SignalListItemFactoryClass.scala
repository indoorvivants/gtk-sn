package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkSignalListItemFactoryClass

class SignalListItemFactoryClass private[gnome] (
    raw: Ptr[GtkSignalListItemFactoryClass]
):

  def getUnsafeRawPointer(): Ptr[GtkSignalListItemFactoryClass] = this.raw
end SignalListItemFactoryClass

object SignalListItemFactoryClass:
  def fromRaw(
      ptr: Ptr[GtkSignalListItemFactoryClass]
  ): SignalListItemFactoryClass = new SignalListItemFactoryClass(ptr)
end SignalListItemFactoryClass
