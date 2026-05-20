package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GRemoteActionGroupInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GRemoteActionGroup.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RemoteActionGroupInterface private[gnome] (
    raw: Ptr[GRemoteActionGroupInterface]
):

  def getUnsafeRawPointer(): Ptr[GRemoteActionGroupInterface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field activate_action_full]: Field is missing <type>"
  )
  private def activateActionFull__ = ???
  @annotation.compileTimeOnly(
    "[field change_action_state_full]: Field is missing <type>"
  )
  private def changeActionStateFull__ = ???
end RemoteActionGroupInterface

object RemoteActionGroupInterface:
  def fromRaw(
      ptr: Ptr[GRemoteActionGroupInterface]
  ): RemoteActionGroupInterface = new RemoteActionGroupInterface(ptr)
end RemoteActionGroupInterface
