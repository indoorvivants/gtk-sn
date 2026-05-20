package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkActionableInterface

/** The interface vtable for `GtkActionable`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ActionableInterface private[gnome] (raw: Ptr[GtkActionableInterface]):

  def getUnsafeRawPointer(): Ptr[GtkActionableInterface] = this.raw

  @annotation.compileTimeOnly(
    "[field get_action_name]: Field is missing <type>"
  )
  private def getActionName__ = ???
  @annotation.compileTimeOnly(
    "[field set_action_name]: Field is missing <type>"
  )
  private def setActionName__ = ???
  @annotation.compileTimeOnly(
    "[field get_action_target_value]: Field is missing <type>"
  )
  private def getActionTargetValue__ = ???
  @annotation.compileTimeOnly(
    "[field set_action_target_value]: Field is missing <type>"
  )
  private def setActionTargetValue__ = ???
end ActionableInterface

object ActionableInterface:
  def fromRaw(ptr: Ptr[GtkActionableInterface]): ActionableInterface =
    new ActionableInterface(ptr)
end ActionableInterface
