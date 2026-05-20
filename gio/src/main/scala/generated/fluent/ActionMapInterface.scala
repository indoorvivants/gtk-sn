package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GActionMapInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GActionMap.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActionMapInterface private[gnome] (raw: Ptr[GActionMapInterface]):

  def getUnsafeRawPointer(): Ptr[GActionMapInterface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field lookup_action]: Field is missing <type>")
  private def lookupAction__ = ???
  @annotation.compileTimeOnly("[field add_action]: Field is missing <type>")
  private def addAction__ = ???
  @annotation.compileTimeOnly("[field remove_action]: Field is missing <type>")
  private def removeAction__ = ???
end ActionMapInterface

object ActionMapInterface:
  def fromRaw(ptr: Ptr[GActionMapInterface]): ActionMapInterface =
    new ActionMapInterface(ptr)
end ActionMapInterface
