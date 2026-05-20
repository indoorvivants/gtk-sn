package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkDropControllerMotionClass

class DropControllerMotionClass private[gnome] (
    raw: Ptr[GtkDropControllerMotionClass]
):

  def getUnsafeRawPointer(): Ptr[GtkDropControllerMotionClass] = this.raw
end DropControllerMotionClass

object DropControllerMotionClass:
  def fromRaw(
      ptr: Ptr[GtkDropControllerMotionClass]
  ): DropControllerMotionClass = new DropControllerMotionClass(ptr)
end DropControllerMotionClass
