package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkPadControllerClass

class PadControllerClass private[gnome] (raw: Ptr[GtkPadControllerClass]):

  def getUnsafeRawPointer(): Ptr[GtkPadControllerClass] = this.raw
end PadControllerClass

object PadControllerClass:
  def fromRaw(ptr: Ptr[GtkPadControllerClass]): PadControllerClass =
    new PadControllerClass(ptr)
end PadControllerClass
