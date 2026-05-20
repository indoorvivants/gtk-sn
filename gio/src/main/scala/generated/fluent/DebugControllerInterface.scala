package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDebugControllerInterface

/** The virtual function table for #GDebugController.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DebugControllerInterface private[gnome] (
    raw: Ptr[GDebugControllerInterface]
):

  def getUnsafeRawPointer(): Ptr[GDebugControllerInterface] = this.raw

end DebugControllerInterface

object DebugControllerInterface:
  def fromRaw(ptr: Ptr[GDebugControllerInterface]): DebugControllerInterface =
    new DebugControllerInterface(ptr)
end DebugControllerInterface
