package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkCallbackActionClass

class CallbackActionClass private[gnome] (raw: Ptr[GtkCallbackActionClass]):

  def getUnsafeRawPointer(): Ptr[GtkCallbackActionClass] = this.raw
end CallbackActionClass

object CallbackActionClass:
  def fromRaw(ptr: Ptr[GtkCallbackActionClass]): CallbackActionClass =
    new CallbackActionClass(ptr)
end CallbackActionClass
