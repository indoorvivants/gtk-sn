package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkConstraintTargetInterface

class ConstraintTargetInterface private[gnome] (
    raw: Ptr[GtkConstraintTargetInterface]
):

  def getUnsafeRawPointer(): Ptr[GtkConstraintTargetInterface] = this.raw
end ConstraintTargetInterface

object ConstraintTargetInterface:
  def fromRaw(
      ptr: Ptr[GtkConstraintTargetInterface]
  ): ConstraintTargetInterface = new ConstraintTargetInterface(ptr)
end ConstraintTargetInterface
