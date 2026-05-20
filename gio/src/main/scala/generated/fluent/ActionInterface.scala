package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GActionInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GAction.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActionInterface private[gnome] (raw: Ptr[GActionInterface]):

  def getUnsafeRawPointer(): Ptr[GActionInterface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_name]: Field is missing <type>")
  private def getName__ = ???
  @annotation.compileTimeOnly(
    "[field get_parameter_type]: Field is missing <type>"
  )
  private def getParameterType__ = ???
  @annotation.compileTimeOnly("[field get_state_type]: Field is missing <type>")
  private def getStateType__ = ???
  @annotation.compileTimeOnly("[field get_state_hint]: Field is missing <type>")
  private def getStateHint__ = ???
  @annotation.compileTimeOnly("[field get_enabled]: Field is missing <type>")
  private def getEnabled__ = ???
  @annotation.compileTimeOnly("[field get_state]: Field is missing <type>")
  private def getState__ = ???
  @annotation.compileTimeOnly("[field change_state]: Field is missing <type>")
  private def changeState__ = ???
  @annotation.compileTimeOnly("[field activate]: Field is missing <type>")
  private def activate__ = ???
end ActionInterface

object ActionInterface:
  def fromRaw(ptr: Ptr[GActionInterface]): ActionInterface =
    new ActionInterface(ptr)
end ActionInterface
