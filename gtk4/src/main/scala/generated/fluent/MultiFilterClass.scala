package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkMultiFilterClass

class MultiFilterClass private[gnome] (raw: Ptr[GtkMultiFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkMultiFilterClass] = this.raw
end MultiFilterClass

object MultiFilterClass:
  def fromRaw(ptr: Ptr[GtkMultiFilterClass]): MultiFilterClass =
    new MultiFilterClass(ptr)
end MultiFilterClass
