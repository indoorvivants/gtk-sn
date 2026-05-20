package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkNativeInterface

class NativeInterface private[gnome] (raw: Ptr[GtkNativeInterface]):

  def getUnsafeRawPointer(): Ptr[GtkNativeInterface] = this.raw
end NativeInterface

object NativeInterface:
  def fromRaw(ptr: Ptr[GtkNativeInterface]): NativeInterface =
    new NativeInterface(ptr)
end NativeInterface
