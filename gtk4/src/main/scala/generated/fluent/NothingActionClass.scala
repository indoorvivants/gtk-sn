package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkNothingActionClass

class NothingActionClass private[gnome] (raw: Ptr[GtkNothingActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkNothingActionClass] = this.raw
end NothingActionClass

object NothingActionClass:
  def fromRaw(ptr: Ptr[GtkNothingActionClass]): NothingActionClass =
    new NothingActionClass(ptr)
end NothingActionClass
