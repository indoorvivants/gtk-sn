package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkRootInterface

class RootInterface private[gnome] (raw: Ptr[GtkRootInterface]):

  def getUnsafeRawPointer(): Ptr[GtkRootInterface] = this.raw
end RootInterface

object RootInterface:
  def fromRaw(ptr: Ptr[GtkRootInterface]): RootInterface = new RootInterface(
    ptr
  )
end RootInterface
