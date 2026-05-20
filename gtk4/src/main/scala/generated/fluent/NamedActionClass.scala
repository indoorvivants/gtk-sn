package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkNamedActionClass

class NamedActionClass private[gnome] (raw: Ptr[GtkNamedActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkNamedActionClass] = this.raw
end NamedActionClass

object NamedActionClass:
  def fromRaw(ptr: Ptr[GtkNamedActionClass]): NamedActionClass =
    new NamedActionClass(ptr)
end NamedActionClass
