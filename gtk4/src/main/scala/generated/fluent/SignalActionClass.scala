package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkSignalActionClass

class SignalActionClass private[gnome] (raw: Ptr[GtkSignalActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkSignalActionClass] = this.raw
end SignalActionClass

object SignalActionClass:
  def fromRaw(ptr: Ptr[GtkSignalActionClass]): SignalActionClass =
    new SignalActionClass(ptr)
end SignalActionClass
