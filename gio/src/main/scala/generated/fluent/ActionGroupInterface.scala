package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GActionGroupInterface
import sn.gnome.gobject.TypeInterface

/** The virtual function table for #GActionGroup.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActionGroupInterface private[gnome] (raw: Ptr[GActionGroupInterface]):

  def getUnsafeRawPointer(): Ptr[GActionGroupInterface] = this.raw

  def gIface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).g_iface.asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field has_action]: Field is missing <type>")
  private def hasAction__ = ???
  @annotation.compileTimeOnly("[field list_actions]: Field is missing <type>")
  private def listActions__ = ???
  @annotation.compileTimeOnly(
    "[field get_action_enabled]: Field is missing <type>"
  )
  private def getActionEnabled__ = ???
  @annotation.compileTimeOnly(
    "[field get_action_parameter_type]: Field is missing <type>"
  )
  private def getActionParameterType__ = ???
  @annotation.compileTimeOnly(
    "[field get_action_state_type]: Field is missing <type>"
  )
  private def getActionStateType__ = ???
  @annotation.compileTimeOnly(
    "[field get_action_state_hint]: Field is missing <type>"
  )
  private def getActionStateHint__ = ???
  @annotation.compileTimeOnly(
    "[field get_action_state]: Field is missing <type>"
  )
  private def getActionState__ = ???
  @annotation.compileTimeOnly(
    "[field change_action_state]: Field is missing <type>"
  )
  private def changeActionState__ = ???
  @annotation.compileTimeOnly(
    "[field activate_action]: Field is missing <type>"
  )
  private def activateAction__ = ???
  @annotation.compileTimeOnly("[field action_added]: Field is missing <type>")
  private def actionAdded__ = ???
  @annotation.compileTimeOnly("[field action_removed]: Field is missing <type>")
  private def actionRemoved__ = ???
  @annotation.compileTimeOnly(
    "[field action_enabled_changed]: Field is missing <type>"
  )
  private def actionEnabledChanged__ = ???
  @annotation.compileTimeOnly(
    "[field action_state_changed]: Field is missing <type>"
  )
  private def actionStateChanged__ = ???
  @annotation.compileTimeOnly("[field query_action]: Field is missing <type>")
  private def queryAction__ = ???
end ActionGroupInterface

object ActionGroupInterface:
  def fromRaw(ptr: Ptr[GActionGroupInterface]): ActionGroupInterface =
    new ActionGroupInterface(ptr)
end ActionGroupInterface
