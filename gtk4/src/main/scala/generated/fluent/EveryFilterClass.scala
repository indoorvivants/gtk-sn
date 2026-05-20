package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkEveryFilterClass

class EveryFilterClass private[gnome] (raw: Ptr[GtkEveryFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkEveryFilterClass] = this.raw
end EveryFilterClass

object EveryFilterClass:
  def fromRaw(ptr: Ptr[GtkEveryFilterClass]): EveryFilterClass =
    new EveryFilterClass(ptr)
end EveryFilterClass
